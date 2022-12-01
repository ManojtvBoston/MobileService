<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>   
    
<!DOCTYPE>
<html>
<head>
 <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <title>Customer List</title>
 <link href="../../webjars/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" />
 <script src="../../webjars/bootstrap/4.0.0/js/bootstrap.min.js"></script>
 <script src="../../webjars/jquery/3.0.0/js/jquery.min.js"></script>
</head>
<body>
 <br></br>
 <br></br>

	
 <h1 align="center"><b>Customer'S Data</b></h1>
 <br>
 <div class="container">
  <table class="table table-striped">
   <thead class="thead-dark">
    <th scope="row"><b>ID</b></th>
    <th scope="row"><b>First Name</b></th>
    <th scope="row"><b>Last Name</b></th>
    <th scope="row"><b>Mobile_Details</b></th>
    <th scope="row"><b>Mobile_Issue</b></th>
    <th scope="row"><b>Email</b></th>
 	<th scope="row"><b>Phone_Numbe</th>
 	<th scope="row"><b>Update</b></th>
    <th scope="row"><b>Delete</b></th>
 	
    
   </thead>
   <tbody>
    <c:forEach items="${mobileList}" var="mobile" >
     <tr>
      <td>${mobile.id}</td>
      <td>${mobile.customer_First_name}</td>
      <td>${mobile.customer_last_name}</td>
      <td>${mobile.mobile_info}</td>
       <td>${mobile.issue}</td>
       <td>${mobile.personalEmail}</td>
       <td>${mobile.mobileNo}</td>
       
        <td>
       <spring:url value="/mobile/editUser/${mobile.id}" var="editURL" />
       <a type="button" class="btn btn-outline-info" href="${editURL}" role="button" ><b>Update</b></a>
      </td>
      <td>
       <spring:url value="/mobile/deleteUser/${mobile.id}" var="deleteURL" />
       <a type="button" class="btn btn-outline-danger" href="${deleteURL}" role="button" ><b>Delete</b></a>
      </td>
     </tr>
    </c:forEach>
   </tbody>
  </table>
   <br>
 <br>
 <div class="text-center">
  <spring:url value="/mobile/addNewUser/" var="addURL" />
  <a  type="button" class="btn btn-outline-success" href="${addURL}" role="button" ><b>Add New Customer</b></a>
  </div>
  <br>
 <br>
 </div>
</body>
</html>