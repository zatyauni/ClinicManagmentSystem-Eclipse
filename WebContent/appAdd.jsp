<%@ page import = "java.util.*,appointment.Appointment" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
  
<style>
.gridView {
  display: grid;
  grid-template-areas:
    'header header header'
    'menu main main'
    'menu main main';
}
.row {
	display: flex;
    grid-auto-columns: auto;
    margin: auto 0;
    padding-top: 0.5%;
}
.formBox {
  border: 2px solid #0C5AA6;
  padding: 3%;
  margin: 0% 0 0 0;
  border-radius: 10px;
} 
input[type=submit] {
	background-color: #0C5AA6;
    color: white;
    padding: 12px 40px;
    border: none;
    border-radius: 4px;
    cursor: pointer;

    text-align: center;
}
</style>
<body>
<jsp:useBean id="appointmentModel" class="appointment.AppointmentModel" scope="application" />
   <jsp:useBean id="appointment" class="appointment.Appointment" scope="application" />
    
    <jsp:include page="header.jsp"></jsp:include>
  
<div class="gridView">

	<div class="scheduleAppointment">
		<div class="row">
		<center><h3>New Appointment</h3></center>
			
		</div>
         
        <form action="NewAppointment" method="post"> 
		<div class="formBox">
			<div class="row">
				<label>IC Number: </label>
				<input type="text" name="ic" placeholder="Insert ic number" required><br> 
				
				<label>Name: </label>
				<input type="text" name="name" placeholder="Insert full name" required><br>
				
				<label>Services: </label>
					<select class="form-control" name="service" required>
		                 <option value="X-RAY" >X-RAY</option>                
		                 <option value="HIV " >Premarital HIV Screening</option>
		                 <option value="Walk" >Walk In</option>
		                 <option value="Check">Medical Check Up for Gont Servant/ IPTA/ IPTS/ Student</option>
		                 <option value="Gout">Gout Research Blood Taking</option>
	                </select>
            	<br>
    			<label>Detail Reason:</label>
    				<textarea name="detail" rows="2" placeholder="Insert detail for appointment" ></textarea>
  				<br>
				<label>Date: </label>
				<input type="text" name="dateApp" placeholder="dd/mm/yyyy e.g 01/01/2021" required>
				<br>
				<label>Time: </label>
				<input type="text" name="slot" placeholder="hh:mm:ss e.g 13:30:00" required><br> 
			</div>
			
            <div class="row">
				<button type="submit" class="btn btn-primary">Schedule</button>
			</div>
		</div>
		</form>
		</div>
	</div>
  </body>
  </html>
<jsp:include page="footer.jsp"></jsp:include>