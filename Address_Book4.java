package com.addressbooksystem;

import java.util.*;

public class AddressBook {
	static Scanner input = new Scanner(System.in);
	static ArrayList<Contact_info> contactBook = new ArrayList<>(); // creating array list of class Contact_info

	// building add contact feature
	public void addContact() {
		System.out.print("\nEnter First Name:- ");
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

	// displaying all existing contacts
	public void displayContacts() {
		System.out.println("\n---------------Contacts in Address Book----------------");
		for (Contact_info person : contactBook) {
			System.out.println(person.toString());
		}
	}

	// Building edit contact feature
	public void editContact() {
		System.out.println("\nEnter first name to edit :- ");
		String name = input.next();

		for (Contact_info person : contactBook) {
			if (name.equals(person.first_Name)) {
				System.out.print("\nSelect option to edit..." + " 1.First_name." + " 2.Last_name." + " 3.Address."
						+ " 4.City" + " 5.State" + " 6.Zip_code" + " 7.Phone_number" + " 8.Email :- ");
				int option = input.nextInt();
				switch (option) {
				case 1:
					System.out.print("Enter new first name :- ");
					String newFirstName = input.next();
					person.setFirst_Name(newFirstName);
					System.out.println("First name is updated.");
					break;

				case 2:
					System.out.print("Enter new last name :- ");
					String newLastName = input.next();
					person.setLast_Name(newLastName);
					System.out.println("Last name is updated.");
					break;

				case 3:
					System.out.print("Enter new Address :- ");
					String newAddress = input.next();
					person.setAddress(newAddress);
					System.out.println("Address is updated.");
					break;

				case 4:
					System.out.print("Enter new city name :- ");
					String newCity = input.next();
					person.setCity(newCity);
					System.out.println("City is updated.");
					break;

				case 5:
					System.out.print("Enter new state name :- ");
					String newState = input.next();
					person.setState(newState);
					System.out.println("State is updated.");
					break;

				case 6:
					System.out.print("Enter new Zip code :- ");
					int newZip = input.nextInt();
					person.setZip_code(newZip);
					System.out.println("Zip code is updated.");
					break;

				case 7:
					System.out.print("Enter new phonr number :- ");
					long newPhone = input.nextLong();
					person.setPhone_number(newPhone);
					System.out.println("Phone number is updated.");
					break;

				case 8:
					System.out.print("Enter new email :- ");
					String newEmail = input.next();
					person.setEmail(newEmail);
					System.out.println("Email is updated.");
					break;

				default:
					System.out.println("Please enter a number between 1 to 8 only...");

				}
			} else {
				continue;
			}
		}
	}

	// adding deleting contact by name feature
	public void deleteContact() {
		System.out.print("Enter first name to delete contact:- ");
		String deleteByName = input.next();

		for (int i = 0; i < contactBook.size(); i++) {
			String Finding_name_in_arrayList = contactBook.get(i).getFirst_Name();

			if (deleteByName.equals(Finding_name_in_arrayList)) {
				contactBook.remove(i);
				System.out.println("\nSelected contact deleted successfully.");
				break;
			} else {
				continue;
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("--------------------Welcome To Address Book Program-----------------------");
		AddressBook obj = new AddressBook();
		obj.addContact(); // adding first contact
		obj.addContact(); // adding second contact
		obj.displayContacts(); // displaying contacts
		obj.deleteContact(); // deleting contact
		obj.displayContacts(); // displaying contacts after edited
	}
}
