<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dashboard</title>
</head>
<style>
h3{
text-align : center;
}
div.container div {
  width:20%;  
  float:left;
  text-align: left;

</style>
<body>
<center >
    <h3>Paymentswebapp</h3>
	<table style = width:50%>	
		
		<tr><td>welcomes user :<%HttpSession hs = request.getSession();
		String w = (String)hs.getAttribute("Email");
		out.print(w);
		%></td> 
		        
		<td><button type = "button">logout</button></tr>
		<tr><td>primary account no :</td></tr>
		<tr><td>account balance :</td><td><button type = "button"> send money</button> </tr>
		<tr><td>wallet balance : </td><td><button type = "onclick"> [+]</button></td></tr>
	</table>
	
	<table style = width:50%>
	<div class = "container">
		<div style="background-color:#FFC0C7;">
		    <h5>Branch : </h5>
			<h5>Bank Name : </h5>
			<h5>Bank Account_no : </h5>
			<h5>Bank Balance : </h5>
			<h5>IFSC Code : </h5>
			<h5>Branch : </h5>
	  </div>
	  
	  <div style="background-color:#D9EEE1;">
	    <h5>Branch : </h5>
		<h5>Bank Name : </h5>
		<h5>Bank Account_no : </h5>
		<h5>Bank Balance : </h5>
		<h5>IFSC Code : </h5>
		<h5>Branch : </h5>
	  </div>
	   <div style="background-color:#D9EEE1;">
	    <h5>Branch : </h5>
		<h5>Bank Name : </h5>
		<h5>Bank Account_no : </h5>
		<h5>Bank Balance : </h5>
		<h5>IFSC Code : </h5>
		<h5>Branch : </h5>
	  </div>
	
	  <div style ="text-align :center ;">
			<button type = "onclick">Add bank account</button>
			
	  </div>
	</div>
	</table>
	
	
	<table style = width:50%;>
	<tr><td>Recent 10 Txns entires </td><td><button type = "button"> Detailed Stmt</button></tr> 
	<tr><td>
	
	</table>
	
	
</center>

</body>
</html>