package appointment;
import java.sql.* ;
import java.sql.Date;
import java.util.*;
import appointment.Appointment;

public class AppointmentModel {
	private Statement statement;
	private PreparedStatement ps;
	private Connection connection;
	
	public AppointmentModel() {
	}
	
	public void initJDBC () throws ClassNotFoundException, SQLException {
	        
			//Load the JDBC driver
			Class.forName("com.mysql.jdbc.Driver");
			// Connect to a database
			connection = DriverManager.getConnection("jdbc:mysql://localhost/clinictanglin","root","");
	}
	
	//ViewUpcoming
	public ArrayList<Appointment> viewAppointment() throws ClassNotFoundException, SQLException{
		
		initJDBC();
		ArrayList<Appointment> apList = null;
		
		try {
			apList = new ArrayList<Appointment>();
			
			// Create statement to get query
			statement = connection.createStatement();
			
			// Execute a query
			ResultSet rs = statement.executeQuery("SELECT * FROM appointment");
			
			//Extract data from result set
			while (rs.next()){
				Appointment ap = new Appointment();
				ap.setId (rs.getInt("id"));
				ap.setIc (rs.getString("ic"));
				ap.setName (rs.getString("name"));
				ap.setService(rs.getString("service"));
				ap.setDetail(rs.getString("detail"));
				ap.setDateApp(rs.getDate("dateApp"));
				ap.setSlot(rs.getString("slot"));
				
				apList.add(ap);
			}
			
			connection.close();
		}
		catch (Exception ex) {
			System.out.println("viewAppointment(): " + ex);
			ex.printStackTrace();
		}
		return apList;	
	}
	
	//View Complete
	public ArrayList<Appointment> completeAppointment() throws ClassNotFoundException, SQLException{
		
		initJDBC();
		ArrayList<Appointment> comList = null;
		
		try {
			comList = new ArrayList<Appointment>();
			
			// Create statement to get query
			statement = connection.createStatement();
			
			// Execute a query
			ResultSet rs = statement.executeQuery("SELECT * FROM complete");
			
			//Extract data from result set
			while (rs.next()){
				Appointment com = new Appointment();
				com.setId (rs.getInt("id"));
				com.setIc (rs.getString("ic"));
				com.setName (rs.getString("name"));
				com.setService(rs.getString("service"));
				com.setDetail(rs.getString("detail"));
				com.setDateApp(rs.getDate("dateApp"));
				com.setSlot(rs.getString("slot"));
				
				comList.add(com);
			}
			
			connection.close();
		}
		catch (Exception ex) {
			System.out.println("completeAppointment(): " + ex);
			ex.printStackTrace();
		}
		return comList;	
	}
		
		//add appointment
	public void addAppointment (Appointment ap) throws ClassNotFoundException, SQLException{
		initJDBC();
		try{
			
			//Create a Statement
			String insert = "INSERT INTO appointment(ic, name, service, detail, dateApp, slot) VALUES(?,?,?,?,?,?)";
			//Create statement to get query
			 ps = connection.prepareStatement(insert);
	          
			 //Store a appointment record to the database
		      ps.setString (1, ap.getIc());
		      ps.setString (2, ap.getName());
		      ps.setString (3, ap.getService());
		      ps.setString (4, ap.getDetail());
		      ps.setDate(5, new Date(ap.getDateApp().getTime()));
		      ps.setString(6, ap.getSlot());
			  		      
		      //execute prepared statement
		      ps.executeUpdate();
		      System.out.println("A record inserted successfully ");
			  connection.close();		
		}
		catch (Exception ex){
			System.out.println("addAppointment(): " + ex);
			ex.printStackTrace();
		}		
	}
			//retrieved record 
		   public Appointment getAppointmentById (int id) throws ClassNotFoundException, SQLException{
		   initJDBC();
		   Appointment ap = new Appointment();
		try{ 
			
			 // Create statement 
			 statement = connection.createStatement();
						
			 // Select Statement	
			 String selectbyid = "SELECT * FROM appointment WHERE id = " + id ;
			 ResultSet rs = statement.executeQuery(selectbyid);
             
			    rs.next();
			    
				ap.setId(rs.getInt("id"));
				ap.setIc(rs.getString("ic"));
				ap.setName(rs.getString("name"));
				ap.setService(rs.getString("service"));
				ap.setDetail(rs.getString("detail"));
				ap.setDateApp(rs.getDate("dateApp"));
				ap.setSlot(rs.getString("slot"));
				
			connection.close();
		}
		catch (Exception ex){
			System.out.println("getAppointmentById(): " + ex);
			ex.printStackTrace();
		}
	 return ap;
	}
		   
	//select the update appointment
		   public void updateAppointment(Appointment ap) throws ClassNotFoundException, SQLException{
				
				initJDBC();
				java.util.Date utilDate = ap.getDateApp();
				Date sqlDate = new java.sql.Date(utilDate.getTime());
				try {
					
				String sql = "UPDATE appointment SET ic = ?,name = ?,service = ?,detail =?, dateApp = ?,slot = ? WHERE id = ?";
					ps = connection.prepareStatement(sql);
					
					ps.setString(1, ap.getIc());
					ps.setString(2, ap.getName()); 
					ps.setString(3, ap.getService());
					ps.setString(4, ap.getDetail());
					ps.setDate(5,  sqlDate); 
					ps.setString(6, ap.getSlot());
					ps.setInt(7, ap.getId());
					System.out.println(ap.getId());
					
					ps.executeUpdate();
						            
		            System.out.println("Database updated successfully ");
		            System.out.println(sqlDate + " in sql");
				}
				catch (Exception ex) {
					System.out.println("updateAppointment()" + ex);
					ex.printStackTrace();
				}
			}
		 //delete upcoming appointment  
		   public void deleteAppointmentById(int id)  throws ClassNotFoundException, SQLException{
				
				try {	
					
					this.initJDBC();
					String sql = ("DELETE from appointment WHERE  id = ?");
					PreparedStatement ps = connection.prepareStatement(sql);
					ps.setInt(1, id);
					
					ps.executeUpdate();
					System.out.println("Record deleted successfully");
				}
				catch (Exception ex) {
					System.out.println("deleteAppointmentById(): "+ ex);
					ex.printStackTrace();
				}
			}
		 //delete complete appointment  
		   public void deleteComAppointmentById(int id)  throws ClassNotFoundException, SQLException{
				
				try {	
					
					this.initJDBC();
					String sql = ("DELETE from complete WHERE  id = ?");
					PreparedStatement ps = connection.prepareStatement(sql);
					ps.setInt(1, id);
					
					ps.executeUpdate();
					System.out.println("Record deleted successfully");
				}
				catch (Exception ex) {
					System.out.println("deleteComAppointmentById(): "+ ex);
					ex.printStackTrace();
				}
			}
	}
		

		  

	   