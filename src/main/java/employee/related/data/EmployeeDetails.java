package employee.related.data;

import org.springframework.stereotype.Component;

@Component
public class EmployeeDetails {
	private int empID;
	private String fullName;
	private String address;
	
	
	public EmployeeDetails() {
	}
	
	//Parameterized constructor
	public EmployeeDetails(int empID, String fullName, String address) {
		super();
		this.empID = empID;
		this.fullName = fullName;
		this.address = address;
	}
	
	//Setter Getter Methods
	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	//Setter Getter Methods
	
	
}
