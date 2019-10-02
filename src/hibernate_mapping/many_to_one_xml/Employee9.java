package hibernate_mapping.many_to_one_xml;

public class Employee9 {
	private int employeeId;
	private String name, email;
	private Address9 address;

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

	public Address9 getAddress() {
		return address;
	}

	public void setAddress(Address9 address) {
		this.address = address;
	}

}
