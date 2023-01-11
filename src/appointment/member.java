package appointment;

public class member {
	private String ic; 
	private String name;
	private String gender; 
	private String email; 
	private String birthDate;
	private String phoneNum;
	private String address;
	private String postcode; 
	private String area; 
	private String state; 

	
	public member() {
		super();
	}

	/**
	 * @param ic
	 * @param name
	 * @param gender
	 * @param email
	 * @param birthDate
	 * @param telNo
	 * @param address
	 * @param postcode
	 * @param area
	 * @param state
	 */
	public member(String ic, String name, String gender, String email, String birthDate, String phoneNum, String address,
			String postcode, String area, String state) {
		this.ic = ic;
		this.name = name;
		this.gender = gender;
		this.email = email;
		this.birthDate = birthDate;
		this.phoneNum = phoneNum;
		this.address = address;
		this.postcode = postcode;
		this.area = area;
		this.state = state;
	}

	/**
	 * @return the icNo
	 */
	public String getIc() {
		return ic;
	}

	/**
	 * @param icNo the icNo to set
	 */
	public void setIc(String ic) {
		this.ic = ic;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the birthDate
	 */
	public String getBirthDate() {
		return birthDate;
	}
	
	/**
	 * @param birthDate the birthDate to set
	 * 
	 */
	public void setBirthDate(String birthDate) {
		this.birthDate= birthDate;
	}

	/**
	 * @return the telNo
	 */
	public String getPhoneNum() {
		return phoneNum;
	}

	/**
	 * @param telNo the telNo to set
	 */
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the postcode
	 */
	public String getPostcode() {
		return postcode;
	}

	/**
	 * @param postcode the postcode to set
	 */
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	/**
	 * @return the area
	 */
	public String getArea() {
		return area;
	}

	/**
	 * @param area the area to set
	 */
	public void setArea(String area) {
		this.area = area;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
}
