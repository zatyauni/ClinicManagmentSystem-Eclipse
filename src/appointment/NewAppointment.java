package appointment;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import appointment.Appointment;
import appointment.AppointmentModel;


/**
 * Servlet implementation class NewAppointment
 */
@WebServlet("/NewAppointment")
public class NewAppointment extends HttpServlet {
		private static final long serialVersionUID = 1L;
	       
	    /**
	     * @see HttpServlet#HttpServlet()
	     */
	    public NewAppointment() {
	        super();
	        // TODO Auto-generated constructor stub
	    }

		/**
		 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
		 */
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
			response.getWriter().append("Served at: ").append(request.getContextPath());
		}

		/**
		 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
		 */
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			//read form fields
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			
			System.out.println(request.getParameter("dateApp"));	
			
	        String ic = request.getParameter("ic");
	        String name = request.getParameter("name");
	        String service = request.getParameter("service");
	        String detail = request.getParameter("detail");

	        SimpleDateFormat format = new SimpleDateFormat("dd/mm/YYYY");
	        Date dateApp = null;
	        try{
	        	dateApp = format.parse(request.getParameter("dateApp"));
	        }
			catch(ParseException e){
				e.printStackTrace();
			}

	        String slot = request.getParameter("slot");
	 
	        Appointment ap = new Appointment();
			ap.setIc(ic);
			ap.setName(name);
			ap.setService(service);
			ap.setDetail (detail);
			ap.setDateApp(dateApp);
			ap.setSlot(slot);
				
			try{  
			  AppointmentModel am = new AppointmentModel ();
			  am.addAppointment(ap);
			  out.println("<b>Successfully Inserted"
	                  + "</b>");
		      out.println( ap.getIc() + ap.getName() + ap.getService() + ap.getDetail()+  ap.getDateApp() + ap.getSlot());
			}
			catch (ClassNotFoundException | SQLException e){
				e.printStackTrace();
			}
			response.sendRedirect("upcoming.jsp");
		}		
	}

