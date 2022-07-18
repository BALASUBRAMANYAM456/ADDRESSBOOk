package com.addressbooksystem;

import java.util.*;

public class AddressBook {
	static Scanner input = new Scanner(System.in);
	static ArrayList<Contact_info> contactBook = new ArrayList<>();

	public void addContact() {
		System.out.print("Enter First Name:- ");
		String first = input.next();

		System.out.print("Enter Last Name:- ");
		String last = input.next();

		System.out.print("Enter Address:- ");
		String add = input.next();

		System.out.print("Enter City:- ");
		String city = input.next();

		System.out.print("Enter State:- ");
		String state = input.next();

		System.out.print("Enter Zip Code:- ");
		int zip = input.nextInt();

		System.out.print("Enter Phone Number:- ");
		long phone = input.nextLong();

		System.out.print("Enter E-mail:- ");
		String email = input.next();

		Contact_info contact = new Contact_info(first, last, add, city, state, zip, phone, email);
		contactBook.add(contact);

		System.out.println("\nContact added Successfully.");
	}

	public void displayContacts() {
		System.out.println("\n---------------Contacts in Address Book----------------");
		for (Contact_info person : contactBook) {
			System.out.println(person.toString());
		}
	}

	public static void main(String[] args) {
		System.out.println("--------------------Welcome To Address Book Program-----------------------");
		AddressBook obj = new AddressBook();
		obj.addContact();
		obj.displayContacts();

	}
}
