package flightsql;


import java.util.ArrayList;
import java.util.List;

public class UserDetails {
	private String name,mobileNumber,dob,emailId,password;
	private List<Travels> travels = new ArrayList<>();
	public UserDetails(String name, String mobNum,String dob, String email, String password) {
		super();
		this.name = name;
		this.mobileNumber = mobNum;
		this.dob = dob;
		this.emailId = email;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobNum() {
		return mobileNumber;
	}

	public void setMobNum(String mobNum) {
		this.mobileNumber = mobNum;
	}
	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return emailId;
	}

	public void setEmail(String email) {
		this.emailId = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Travels> getFlightBookings() {	
		return travels;
	}

	public void setFlightBookings(Travels journey) {
		this.travels.add(journey);
	}
	
	}