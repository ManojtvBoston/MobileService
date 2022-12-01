package com.mobilemanagement.project.service;

import java.util.List;

import com.mobilemanagement.project.entity.Mobile;
//import com.mobilemanagement.project.entity.Student;

public interface MobileService {

	
	 public List<Mobile> getAllMobile();
	 
	 public Mobile getStudentById(int id);
	 
	 public void addMobile(Mobile mobile);
	 
	 public void deleteMobile(int id);
	

}