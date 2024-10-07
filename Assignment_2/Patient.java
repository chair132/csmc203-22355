
public class Patient {

	private String firstName;
	private String middleName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private int zipCode;
	private String patientPhoneNumber;
	private String emergencyName;
	private String emergencyPhoneNumber;
	
	public Patient() {
		firstName = "John";
		middleName = "B";
		lastName = "Vu";
		address = "117 Golden Hill";
		city = "Potomac";
		state = "MD";
		zipCode = 20661;
		patientPhoneNumber = "301-222-1234";
		emergencyName = "Matt";
		emergencyPhoneNumber = "240-123-5431";
	}
	
	public Patient(String first, String middle, String last) {
		firstName = first;
		middleName = middle;
		lastName = last;
		address = "117 Golden Hill";
		city = "Potomac";
		state = "MD";
		zipCode = 20661;
		patientPhoneNumber = "301-222-1234";
		emergencyName = "Matt";
		emergencyPhoneNumber = "240-123-5431";
	}
	
	public Patient(String first, String middle, String last, String address, String city, String state, int zipCode, String patientPhoneNumber, String emergencyName, String emergencyPhoneNumber) {
		firstName = first;
		middleName = middle;
		lastName = last;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.patientPhoneNumber = patientPhoneNumber;
		this.emergencyName = emergencyName;
		this.emergencyPhoneNumber = emergencyPhoneNumber;
	}
	
	
	public String getFirstName(){
		return firstName;
	}

	public String getMiddleName() {
		return middleName;
	}
	
	public String getLastName() {
		return lastName;
	}

	public String getAddress() {

		return address;
	}

	public String getCity() {
		return city;
	}

	

	public String getState() {
		return state;
	}

	public int getZipCode() {

		return zipCode;
	}

	public String getPatientPhoneNumber() {

		return patientPhoneNumber;
	}

	public String getEmergencyName() {

		return emergencyName;
	}

	public String getEmergencyPhoneNumber() {
		return emergencyPhoneNumber;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	

	public void setAddress(String address) {
		this.address = address;
	}


	public void setCity(String city) {
		this.city = city;
	}

	public void setState(String state) {
		this.state = state;
	}


	public void setZipCode(int zipCode) {

		this.zipCode = zipCode;
	}

	public void setPatientPhoneNumber(String patientPhoneNumber) {
		this.patientPhoneNumber = patientPhoneNumber;
	}

	

	public void setEmergencyName(String emergencyName) {
		this.emergencyName = emergencyName;
	}


	public void setEmergencyPhoneNumber(String emergencyPhoneNumber) {
		this.emergencyPhoneNumber = emergencyPhoneNumber;
	}

	


	public String buildFullName() {
		return firstName + " " + middleName + " " + lastName;
	}

	

	public String buildAddress() {
		return address + " " + city + " " + state + " " + zipCode;
	}

	

	public String buildEmergencyContact() {
		return emergencyName + " " + emergencyPhoneNumber;
	}

	

	public String toString() {
		return " Name: "+ buildFullName()+ "\n Address: " + buildAddress() + "\n EmergencyContact: " + buildEmergencyContact();
	}


	

}
