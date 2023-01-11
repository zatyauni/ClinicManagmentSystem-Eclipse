<!DOCTYPE html>
<html lang="en">
<head>
<!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

<!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

<title>Tanglin Health Clinic </title>
</head>

<body>

 <div class="spacing top" style="width:98%;  margin : 5px 5px 0 5px; position: fixed; z-index: 200; top: 0px;">
	<div class="spacing right left" style="left: 10%; right:10%;  background-color: #3cb371; min-height: 50px;">
	<table width=100% border=0>
		<tr>
			<td rowspan=3 width=58 valign=top>
				<span class="a91"><img src="http://jknj4.moh.gov.my/qrtca/images/logo.png" width=120>
			</td>
			<td valign=top>
				<span ><b>TANGLIN HEALTH CLINIC</span>
				<br><span>Jalan Cenderasari, Tasik Perdana, 50480 Kuala Lumpur, Wilayah Persekutuan Kuala Lumpur</span>
				<br><span>03-2698 3311</span>
    </div>	
			</td>
		</tr>
	</table>	
  </div>

<nav class="navbar navbar-expand-lg navbar-light bg-light">
        
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        
        <li class="nav-item">
          <a class="nav-link" href="index.jsp">Home</a>
        </li>
        
        <% if (session.getAttribute("status") != null) {
				if(session.getAttribute("status").equals("loggedin")) {%>

				<li class="nav-item">
			          <a class="nav-link" href="searchRecord.jsp">New Appointment</a>
			        </li>
			        
					<li class="nav-item">
			          <a class="nav-link" href="upcoming.jsp">Upcoming Appointment</a>
			        </li>
					
			        <li class="nav-item">
			          <a class="nav-link" href="complete.jsp">Complete Appointment</a>
			        </li>
			        
			        <li class="nav-item">
			          <a class="nav-link" href="patientRegistration.jsp">Add New Patient</a>
			        </li>
				<%} 
        } %>
        
          <li class="nav-item">
          <a class="nav-link" href="aboutus.jsp">About Us</a>
         </li>
         <li class="nav-item">
          <a class="nav-link" href="contactus.jsp">Contact Us</a>
         </li>

      </ul>

	<ul class="navbar-nav navbar-right">
	
		<% if (session.getAttribute("status") != null) {
				if(session.getAttribute("status").equals("loggedin")) {%>
					<a class="nav-link" href="logout.jsp">Logout</a>
		<%		} %>
		<% } 
				else { %>
					<a class="nav-link" href="login.jsp">Login</a>
					
		<% 		}%> 
		 
	</ul>
	
  </div>
</nav>

<div class="container">

<% if (session.getAttribute("success") != null) {%>

<div class="alert aler-success alert-warning alert-dismissible fade show" role="alert">
	  <%= session.getAttribute("success")%>
	  <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close">
	  <span aria-hidden="true">&times;</span>
	  </button>
</div>

<% session.removeAttribute("success"); %>

<% }%>

<% if (session.getAttribute("danger") != null) {%>

<div class="alert alert-danger alert-warning alert-dismissible fade show" role="alert">
	  <%= session.getAttribute("danger")%>
	  <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close">
	  <span aria-hidden="true">&times;</span>
	  </button>
</div>

<% session.removeAttribute("danger"); %>

<% }%>
