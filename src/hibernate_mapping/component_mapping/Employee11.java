package hibernate_mapping.component_mapping;

public class Employee11 {
	private int id;
	private String name;
	private Address11 address;// HAS-A

	public Employee11(String name, Address11 address) {
		this.name = name;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address11 getAddress() {
		return address;
	}

	public void setAddress(Address11 address) {
		this.address = address;
	}

}
