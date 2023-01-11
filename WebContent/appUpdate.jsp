<%@ page import = "java.util.*,appointment.Appointment" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Appointment Update</title>
</head>
<body>
 
    <% int id = Integer.parseInt(request.getParameter("id")); %>
    <jsp:useBean id="appointmentModel" class="appointment.AppointmentModel" scope="application" />
    <jsp:useBean id="appointment" class="appointment.Appointment" scope="application" />
    <% Appointment ap = appointmentModel.getAppointmentById (id);%>
    
<jsp:include page = "header.jsp"></jsp:include>
 
<center><h2>Update Appointment</h2></center>
 
 <form action="UpdateApp" method="post">
 
  <div class="form-group">
    <label>Ic:</label>
    <input type="text" class="form-control" name="ic" value ="<%=ap.getIc()%>">
  </div>
  
  <div class="form-group">
    <label>Name:</label>
    <input type="text" class="form-control" name="name" value ="<%=ap.getName()%>">
  </div>
  
  <div class="form-group">
    <label>Service:</label>
    <input type="text" class="form-control" name="service" value ="<%=ap.getService()%>">
  </div>
  
  <div class="form-group">
    <label>Detail:</label>
    <textarea class="form-control" name="detail" rows="2" value ="<%=ap.getDetail()%>"></textarea>
  </div>
  
  <div class="form-group">
    <label>Date:</label>
    <input type="date" class="form-control" name="dateApp" value ="<%=ap.getDateApp()%>">
  </div>
  
  <div class="form-group">
    <label>Slot:</label>
    <input type="time" class="form-control" name="slot" value ="<%=ap.getSlot()%>">
  </div>

  <input type="hidden" name="id" value="<%=ap.getId()%>">
  <button type="submit" class="btn btn-primary">Update</button>
</form>
 
<jsp:include page = "footer.jsp"></jsp:include>
