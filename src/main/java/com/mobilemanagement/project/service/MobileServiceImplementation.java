package com.mobilemanagement.project.service;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobilemanagement.project.entity.Mobile;
//import com.mobilemanagement.project.entity.Student;
import com.mobilemanagement.project.repo.MobileRepo;

@Service
@Transactional
public class MobileServiceImplementation implements MobileService {

	@Autowired
	MobileRepo mobileRepo;
	
	
	@Override
	public List<Mobile> getAllMobile() {
		return (List<Mobile>) mobileRepo.findAll();
	}

	@Override
	public Mobile getStudentById(int id) {
		return mobileRepo.findById(id).get();
	}

	@Override
	public void addMobile(Mobile mobile) {
		mobileRepo.save(mobile);
	}

	@Override
	public void deleteMobile(int id) {
		mobileRepo.deleteById(id);
	}

}