<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import = "java.util.*" %>
<%@ page import = "appointment.*" %>

<jsp:useBean id="appointmentModel"  class="appointment.AppointmentModel" scope="application" ></jsp:useBean>

<jsp:include page = "header.jsp"></jsp:include>

<h3>Upcoming Appointments</h3>

<% List <appointment.Appointment> list = appointmentModel.viewAppointment(); %>

<style>
.gridView {
  display: grid;
  grid-template-areas:
    'header header header'
    'menu main main'
    'menu main main';
}
.wrapper {
	display: grid;
    grid-gap: 0px;
    padding: 2px;
    margin: 10 auto;
}
.row {
	display: flex;
    grid-auto-columns: auto;
    margin: auto 0;
    padding-top: 0.5%;
}

.column {
  float: left;
  width: 50%;
  padding: 2px;
}
.apps {
  border: 2px solid #0C5AA6;
  padding: 0%;
  margin: 0% 0 0 0 ;
  border-radius: 9px;
  width: auto;
  
}
</style>
<% for(appointment.Appointment app: list){ %>
	<div class="gridView">
			
	<div class="wrapper">
		
		<div class="row">
		</div>
		
		<div class="apps">
		<div class="row">
			
			<div class="column">
			<h6>Id: <%=app.getId() %></h6>
			<h6>Ic: <%=app.getIc() %></h6>
			<h6>Name:<%=app.getName()%></h6>
			<h6>Services:<%=app.getService() %></h6>
			<h6>Detail:<%=app.getDetail() %></h6>
			<h6>Date:<%=app.getDateApp() %></h6>
			<h6>Time:<%=app.getSlot()%></h6>
			</div>
			
	  <form action="appUpdate.jsp" method="POST"> 
	  <button  type="submit" class="btn btn-warning">Update</button> 
	  <input type="hidden" name="id" value="<%= app.getId() %>">
	  </form>
	
	   <form action="DeleteApp" method="POST">
	   <button type="submit" class="btn btn-danger" onclick="return confirm('Are you sure to delete this record')">Delete</button> 
	   <input type="hidden" name="id" value="<%= app.getId() %>">
	   </form>
	   					
		</div>
		</div>
	
	</div>
</div>
<% } %>
<jsp:include page = "footer.jsp"></jsp:include>