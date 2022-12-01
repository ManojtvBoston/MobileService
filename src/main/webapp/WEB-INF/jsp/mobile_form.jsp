<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%> 
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>     
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <title>Add New Customer</title>
 <link href="../../webjars/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" />
 <script src="../../webjars/bootstrap/4.0.0/js/bootstrap.min.js"></script>
 <script src="../../webjars/jquery/3.0.0/js/jquery.min.js"></script>
</head>
<body >
 <div class="container">
  <spring:url value="/mobile/addNewUser" var="addURL" />
 
  <h1 align="center"><b>Enter Customer Details</b></h1>
     <div class="alert alert-info" role="alert">
</div>

  <form:form modelAttribute="mobileForm" method="post" action="${addURL}" cssClass="form" >
   <form:hidden path="id"/>
   <div class="form-group">
    <label><b>First Name</b></label>
    <form:input path="customer_First_name" cssClass="form-control" id="customer_First_name" placeholder="customer_First_name" />
    
   </div>
   <div class="form-group">
    <label><b>Last Name</b></label>
    <form:input path="customer_last_name" cssClass="form-control" id="customer_last_name" placeholder="customer_last_name" />
   </div>
   <div class="form-group">
    <label>Mobile_Details( Ex: Brand , Model )</label>
    <form:input path="mobile_info" cssClass="form-control" id="mobile_info" placeholder="mobile_info" />
   </div>
   
   <div class="form-group">
    <label><b>Mobile_Issue</b>( Ex : Whats The Problem Your Facing With Your Phone)</label>
    <form:input path="issue" cssClass="form-control" id="issue" placeholder="issue"/>
   </div>
   
    <div class="form-group">
    <label><b>Email</b></label>
    <form:input path="personalEmail" cssClass="form-control" id="personalEmail" placeholder="personalEmail" />
   </div>
   
   
     <div class="form-group">
    <label><b>Phone_Number</b></label>
    <form:input path="mobileNo" cssClass="form-control" id="mobileNo" placeholder="mobileNo"/>
   </div>
   <br>
  
	 <div class="text-center">
   <button type="submit" class="btn btn-outline-success"><b>Register</b></button>
   <br>
   <br>
   <div class="alert alert-success" role="alert">

  
	</div>
  </form:form>
  </div>
 
  
 </div>

</body>

</html>