package com.addressbooksystem;

import java.util.ArrayList;

public class AddressBookList {
	
	String userInputBookName;
	ArrayList<Contact_info> contact;

	
	// constructor
	public AddressBookList(String userInputBookName) {
		this.userInputBookName = userInputBookName;
		this.contact = new ArrayList<Contact_info>();
	}

	// getters and methods.
	public String getUserInputBookName() {
		return userInputBookName;
	}

	public void setUserInputBookName(String userInputBookName) {
		this.userInputBookName = userInputBookName;
	}
	
	
	public ArrayList<Contact_info> getContact() {
		return contact;
	}

	public void setContact(ArrayList<Contact_info> contact) {
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "Address Book name :- " + userInputBookName + "\n" + "Contacts :- " + contact;
	}
}
