package com.AutoWiringUsingXML;

public class Emp {

	private String name;
	private Address address;
	
	@Override
	public String toString() {
		return "Emp [name=" + name + ", address=" + address + "]";
	}
	public Emp(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

}
