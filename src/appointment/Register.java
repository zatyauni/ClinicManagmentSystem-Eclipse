package appointment;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
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
		
	
		String ic = request.getParameter("ic");
		String name = request.getParameter("name");
		String gender = request.getParameter("gender");
		String email = request.getParameter("email");
		String birthDate = request.getParameter("birthDate");
		String phoneNum = request.getParameter("phoneNum");
		String address = request.getParameter("address");
		String postcode = request.getParameter("postcode");
		String area = request.getParameter("area");
		String state = request.getParameter("state");
		
		member m = new member(ic, name, gender, email, birthDate, phoneNum, address, postcode, area, state);
		
		RegisterDao rDao = new RegisterDao();
		String result = rDao.insert(m);
		response.getWriter().print(result);
		response.sendRedirect("searchRecord.jsp");

	}

}