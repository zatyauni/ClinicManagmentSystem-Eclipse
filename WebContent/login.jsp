<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
    <!DOCTYPE html>
    <html>

    <head>
        <meta charset="ISO-8859-1">
        <title>New Appointment</title>
    </head>
    <body>
<jsp:include page="header.jsp"></jsp:include>
<center>
<form method="post" action="loginsuccess.jsp"> 

  <legend><h1>Login</h1></legend>
   <form onsubmit="return validate()" action="loginsuccess" method="post">
   	<table>
   		<tr>
   			<td>Email:</td>
   			<td><input type="email" id="email" name="emailid" ></td>
   			<td><span style="color:red" id="emailerror" >*</span></td>
   		</tr>
   		
   		<tr>
   			<td>Password:</td>
   			<td><input type="password" id="pass" name="password"></td>
   			<td><span style="color:red" id="passerror">*</span></td>
   		</tr>
   		
   		<tr>
   		<td><input type="submit" value="Login"></td>
   	</table>
   </form>
   </fieldset>
   </center> 
   </div>
   <jsp:include page="footer.jsp"></jsp:include>
</body>
</html>