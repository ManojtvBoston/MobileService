package com.mobilemanagement.project.repo;

import org.springframework.data.repository.CrudRepository;

import com.mobilemanagement.project.entity.Mobile;
//import com.mobilemanagement.project.entity.Student;

public interface MobileRepo extends CrudRepository<Mobile, Integer> {

	
}
