<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <jsp:include page = "header.jsp"></jsp:include>
  <br>
<form action="Register" method="post">

	<h3 align="center">New Patient Registration Form</h3>
	
	<p align="center">Please complete this form to register new patient in Tanglin Health Clinic </p>
	<br>
	<table align="center">
	<tr>
	<td>Identification Card Number : </td>
	<td><input type ="text" name="ic" size="45" required></td></tr>
	<tr>
	<td>Full Name : </td>
	<td><input type ="text" name="name" size="45" required></td></tr>
	<tr>
	<td>Gender : </td>
	<td><select class="form-control" id="gender" name="gender" required>
	<option selected disabled value="">Choose...</option>
	<option value="Male" style="height:35px;">Male</option>
			<option value="Female" style="height:35px;">Female</option>
				</select></td></tr>
	<tr>
	<td>Email : </td>
	<td><input type ="text" name="email" size="45" required></td></tr>
	<tr>
	<td>Birth Of Date : </td>
	<td><input type ="text" id="birthDate" name="birthDate" placeholder="YYYY/MM/DD" size="45" required></td></tr>
	<tr>
	<td>Phone Number : </td>
	<td><input type ="text" name="phoneNum" size="45" required></td></tr>
	<tr>
	<td>Address : </td>
	<td><input type ="text" name="address" size="45" required></td></tr>
	<tr>
	<td>Postcode: </td>
	<td><input type ="text" name="postcode" size="45" required></td></tr>
	<tr >
	<td>Area : </td>
	<td><input type ="text" name="area" size="45" required></td></tr>
	<tr>
    <td>State : </td>
    <td class=""><select class="form-control"  name="state" required>
    									<option selected disabled value="">Choose...</option>
										<option value="Johor" style="height:35px;">Johor</option>
										<option value="Kedah" style="height:35px;">Kedah</option>
										<option value="Kelantan" style="height:35px;">Kelantan</option>
										<option value="Melaka" style="height:35px;">Melaka</option>
										<option value="Negeri Sembilan" style="height:35px;">Negeri Sembilan</option>
										<option value="Pahang" style="height:35px;">Pahang</option>
										<option value="Perak" style="height:35px;">Perak</option>
										<option value="Perlis" style="height:35px;">Perlis</option>
										<option value="Pulau Pinang" style="height:35px;">Pulau Pinang</option>
										<option value="Sabah" style="height:35px;">Sabah</option>
										<option value="Sarawak" style="height:35px;">Sarawak</option>
										<option value="Selangor" style="height:35px;">Selangor</option>
										<option value="Terengganu" style="height:35px;">Terengganu</option>
										<option value="WP Kuala Lumpur" style="height:35px;">WP Kuala Lumpur</option>
										<option value="WP Labuan" style="height:35px;">WP Labuan</option>
										<option value="WP Putrajaya" style="height:35px;">WP Putrajaya</option>
				</select></td>
	</tr>
	<tr>
	<td></td><td><br><input type="submit" value="Register"></td></tr>
	</table>

</form>
<jsp:include page="footer.jsp"></jsp:include>
