package hibernate_mapping.one_to_one_xml;

public class Employee7 {
	private int employeeId;
	private String name, email;
	private Address7 address;

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Address7 getAddress() {
		return address;
	}

	public void setAddress(Address7 address) {
		this.address = address;
	}

}
