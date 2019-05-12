package dk.code.expense;

public class Department {

	private String name;
	private String registrationNumber;
	
	public Department(String name, String registrationNumber) {
		super();
		this.name = name;
		this.registrationNumber = registrationNumber;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRegistrationNumber() {
		return registrationNumber;
	}
	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}
	
	
	
	
	
}
