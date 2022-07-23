package com.addressbooksystem;


public class Contact_info {
	
	String first_Name;
	String last_Name;
	String address;
	String city;
	String state;
	int zip_code;
	long phone_number;
	String email;

	// generated constructor
	public Contact_info(String first_name, String last_name, String address, String city, String state, int zip_code,
			long phone_number, String email) {
		this.first_Name = first_name;
		this.last_Name = last_name;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip_code = zip_code;
		this.phone_number = phone_number;
		this.email = email;
	}

	// initializing getter and setters
	public String getFirst_Name() {
		return first_Name;
	}

	public void setFirst_Name(String first_Name) {
		this.first_Name = first_Name;
	}

	public String getLast_Name() {
		return last_Name;
	}

	public void setLast_Name(String last_Name) {
		this.last_Name = last_Name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZip_code() {
		return zip_code;
	}

	public void setZip_code(int zip_code) {
		this.zip_code = zip_code;
	}

	public long getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(long phone_number) {
		this.phone_number = phone_number;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	// returning contacts
	@Override
	public String toString() {
		return String.format("\nFirst_name :- " + getFirst_Name() + "\n" + "Laste_name :- " + getLast_Name() + "\n"
				+ "Address :- " + getAddress() + "\n" + "City :- " + getCity() + "\n" + "State :- " + getState() + "\n"
				+ "Zip-code :- " + getZip_code() + "\n" + "Phone-number :- " + getPhone_number() + "\n" + "Email :- "
				+ getEmail() + "\n\n");
	}
}
