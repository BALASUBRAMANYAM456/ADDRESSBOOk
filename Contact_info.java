package com.addressbooksystem;

public class Contact_info {
	
	String first_Name;
	String last_Name;
	String address;
	String city;
	String state;
	int zip_code;
	int phone_number;
	String email;

	public Contact_info(String fn, String ln, String add, String city, String state, int zip, int ph, String email) {

		this.first_Name = fn;
		this.last_Name = ln;
		this.address = add;
		this.city = city;
		this.state = state;
		this.zip_code = zip;
		this.phone_number = ph;
		this.email = email;
	}

	public String toString() {
		return String.format(first_Name + " " + last_Name + " " + address + " " + city + " " + state + " " + zip_code
				+ " " + phone_number + " " + email);
	}
}
