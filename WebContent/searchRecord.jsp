<%@ page import="java.sql.*" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search Record Patient</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
  <jsp:include page = "header.jsp"></jsp:include>
  <br>
	<h3 align="center"> Search Record Patient</h3>
	<div align="center" class="container">
		<div class="form-group col-6 p-0">
		<form id="form" method="post" action="searchRecord.jsp" class="form-horizontal">
			<div class="form-group col-md-6">
			<label>Enter IC No</label>
			<input type="text" name="ic" class="form-control" id="noIc">
			</div><br>
			<div class="form-group col-md-6" align="center">
			
			<button class="btn btn-success">Search</button>
			
			</div>
			</form>
		</div>
	</div>

</body>


<body>
  	<div class="container">
  		<div class ="form-group col-12 p-0">
  		<%
  		Connection con;
  		PreparedStatement pst;
  		ResultSet rs;
  		Class.forName("com.mysql.jdbc.Driver");
  		con = DriverManager.getConnection("jdbc:mysql://localhost/clinictanglin", "root","");
  		String ic = request.getParameter("ic");
  		 
  		 if (ic != null){
  			
  			 pst = con.prepareStatement("SELECT ic,name FROM newpatient WHERE ic = ?");

  			 pst.setString(1, ic);
  			 rs = pst.executeQuery();
  			 	
  			 		out.print("<h3>Patient Record</h3>");
  			 		out.print("<table class=table>");
  				 	out.print("<thead class=table-light>");
  					out.print("<tr>");
  					out.print("<th>Ic</th>");
  			  	 	out.print("<th>Name</th>");
  			  		out.print("<th>   </th>");
  					out.print("<thead>");
  					
  				while(rs.next()){
					out.print("<tr>");
					out.print("<td>" + rs.getString("ic") + "</td>");
					out.print("<td>" + rs.getString("name") + "</td>");
					
					out.print("<td><a href= \"appAdd.jsp\">Continue To Appointment</a></td>");
					out.print("<thead>");
  			 	}
  		 }
  			 
  		%>
  		</div> 	
  	</div>
</body>
