package appointment;

import java.util.Date;

public class Appointment {
	int id;
	String ic; 
	String name;
	String service;
	String detail;
	Date dateApp;
	String slot;
		
	public Appointment(){	
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIc() {
		return ic;
	}

	public void setIc(String ic) {
		this.ic = ic;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public Date getDateApp() {
		return dateApp;
	}

	public void setDateApp(Date dateApp) {
		this.dateApp = dateApp;
	}

	public String getSlot() {
		return slot;
	}

	public void setSlot(String slot) {
		this.slot = slot;
	}
	

}
