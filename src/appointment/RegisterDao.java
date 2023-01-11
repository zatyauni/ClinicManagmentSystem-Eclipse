package appointment;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class RegisterDao {
	
		private String dbUrl ="jdbc:mysql://localhost/clinictanglin";
		private String dbUname = "root";
		private String dbPassword = "";
		private String dbDriver = "com.mysql.jdbc.Driver";
		
		//load Driver
		public void loadDriver(String dbDriver){
			try{
				Class.forName(dbDriver);
			}
			catch (ClassNotFoundException e){
				e.printStackTrace();
			}
		}
		
		public Connection getConnection(){
			Connection con = null;
			try{
			con = DriverManager.getConnection(dbUrl, dbUname, dbPassword);
			}
			catch (SQLException e){
				e.printStackTrace();
			}
			return con;
		}
		
		
		public String insert(member m){
			
			loadDriver(dbDriver);
			Connection con = getConnection();
			String result = "New Patient Registration Successfully";
			String sql = "INSERT INTO newpatient VALUES (?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement ps;
			try{
			ps=con.prepareStatement(sql);
			ps.setString(1, m.getIc());
			ps.setString(2, m.getName());
			ps.setString(3, m.getGender());
			ps.setString(4, m.getEmail());
			ps.setString(5, m.getBirthDate());
			ps.setString(6, m.getPhoneNum());
			ps.setString(7, m.getAddress());
			ps.setString(8, m.getPostcode());
			ps.setString(9, m.getArea());
			ps.setString(10, m.getState());
			
			ps.executeUpdate();
			} 
			catch (SQLException e){
				e.printStackTrace();
				result = "New Patient Registration Failed";
			}
			return result;
		}
}