package com.mobilemanagement.project.entity;

import javax.persistence.*;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;

@Entity
@Table(name="mobile")
public class Mobile {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@NotBlank(message = "Please Enter Department Name")
	@Column(name="customer_First_name")
	private String Customer_First_name;
	
	@Column(name="customer_last_name")
	private String Customer_last_name;
	
	@Length(max =20, min = 2)
	@Column(name="mobile_info")
	private String Mobile_info;
	
	
	
	@NotBlank
	@Column(name="issue")
	private String Issue;
	@Email(message="Please provide a valid email address")
	@Pattern(regexp=".+@.+\\..+", message="Please provide a valid email address")
	@Column(name="personalEmail")
	private String PersonalEmail;
	
	
//	@Pattern(regexp = "(\\+91)[0-9]{9}")
	@Column(name="mobileNo")
	private String MobileNo;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCustomer_First_name() {
		return Customer_First_name;
	}

	public void setCustomer_First_name(String customer_First_name) {
		Customer_First_name = customer_First_name;
	}

	public String getCustomer_last_name() {
		return Customer_last_name;
	}

	public void setCustomer_last_name(String customer_last_name) {
		Customer_last_name = customer_last_name;
	}

	public String getMobile_info() {
		return Mobile_info;
	}

	public void setMobile_info(String mobile_info) {
		Mobile_info = mobile_info;
	}

	public String getIssue() {
		return Issue;
	}

	public void setIssue(String issue) {
		Issue = issue;
	}

	public String getPersonalEmail() {
		return PersonalEmail;
	}

	public void setPersonalEmail(String personalEmail) {
		this.PersonalEmail = personalEmail;
	}

	public String getMobileNo() {
		return MobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.MobileNo = mobileNo;
	}
}
