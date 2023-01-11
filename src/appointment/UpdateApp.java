package appointment;

import java.io.IOException;
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
 * Servlet implementation class UpdateApp
 */
@WebServlet("/UpdateApp")
public class UpdateApp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateApp() {
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
		// read form fields
				response.setContentType("text/html");
				
				int id = Integer.parseInt(request.getParameter("id"));
		        String ic = request.getParameter("ic");
		        String name = request.getParameter("name");
		        String service = request.getParameter("service");
		        String detail = request.getParameter("detail");
		        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		        Date dateApp = null;
		        try{
		        	
		        	dateApp = format.parse(request.getParameter("dateApp"));
		             	
		        }
				catch(ParseException e){
					e.printStackTrace();
				}
		                
		        String slot = request.getParameter("slot");
		        
		        Appointment ap = new Appointment();
		        ap.setId(id);
				ap.setIc(ic);
				ap.setName(name);
				ap.setService(service);
				ap.setDetail(detail);
				ap.setDateApp(dateApp);
				ap.setSlot(slot);
				
				AppointmentModel am = new AppointmentModel();
				try{
				  am.updateAppointment(ap);
				}
				catch (ClassNotFoundException | SQLException e){
					e.printStackTrace();
				}
				response.sendRedirect("upcoming.jsp");
			}
		}
