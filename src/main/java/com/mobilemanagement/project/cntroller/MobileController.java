package com.mobilemanagement.project.cntroller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mobilemanagement.project.CustomException.BuisnessException;
//import com.mobilemanagement.project.entity.Student;
import com.mobilemanagement.project.entity.Mobile;

import com.mobilemanagement.project.service.MobileService;

@Controller
@RequestMapping(value="/mobile")
public class MobileController {

	@Autowired
	MobileService mobileService;
	
	
	 @RequestMapping(value="/list", method=RequestMethod.GET)
	 public ModelAndView list() 
	 {
		 
		  ModelAndView model = new ModelAndView("mobile_list");
		  List<Mobile> mobileList = mobileService.getAllMobile();
		  model.addObject("mobileList", mobileList);
		
		  return model;
	 }
	 
	 @RequestMapping(value="/addNewUser/", method=RequestMethod.GET)
	 public ModelAndView addMobile() 
	 {
		 
		  ModelAndView model = new ModelAndView();
		  Mobile mobile = new Mobile();
		  model.addObject("mobileForm", mobile);
		  model.setViewName("mobile_form");
		  
		  return model;
	 }
	 
	 
	 
	 @RequestMapping(value="/editUser/{id}", method=RequestMethod.GET)
	 public ModelAndView editMobile(@PathVariable int id)
	 {
		  ModelAndView model = new ModelAndView();
		  
		  Mobile mobile = mobileService.getStudentById(id);
		  model.addObject("mobileForm", mobile);
		  model.setViewName("mobile_form");
	  
	  return model;
	 }
	 
	 
	 
	 
	 @RequestMapping( value="/addNewUser", method=RequestMethod.POST)
	 public ModelAndView add(@Valid @ModelAttribute("mobileForm") Mobile mobile) 
	 {
		 try
		 {
			 if(mobile.getCustomer_First_name().isEmpty() || mobile.getCustomer_First_name().length() == 0)
			 {
				 throw new BuisnessException("601","Please Send Proper Name  It's empty ");
			 }
		 
		 mobileService.addMobile(mobile);
		 return new ModelAndView("redirect:/mobile/list");
		 }
		 catch(IllegalArgumentException e)
		 {
			 throw new  BuisnessException("602","something went wrong in service layer"+e.getMessage());
		 }
	  
	 }
	 
	 @RequestMapping(value="/deleteUser/{id}", method=RequestMethod.GET)
	 public ModelAndView delete(@PathVariable("id") int id) 
	 {
			 
			 mobileService.deleteMobile(id);
			 return new ModelAndView("redirect:/mobile/list");
		  
	 }
	
	
	
}