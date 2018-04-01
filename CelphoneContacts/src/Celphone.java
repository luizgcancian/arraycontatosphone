import java.util.ArrayList;
import java.util.Scanner;

public class Celphone {
	public static Scanner read = new Scanner(System.in);
	
//Array Contacts//
	ArrayList<Contact> contacts = new ArrayList();
	
	//Methods//
	//Find Contact//
	public boolean findContact(String name) {
		
		for (int i = 0; i < this.contacts.size(); i++) {
			if (contacts.get(i).getName().equalsIgnoreCase(name)) {
				return true;
			}
			
		}
		return false;
		
	}
	//AddContact//
	public void addContact(String name,int age, long number) {
		if (findContact(name)==true) {
			System.out.println("Contact name already exists.");
		}
		else {
			this.contacts.add(new Contact(name, age,number));
			System.out.println("Contact "+name+" was added.");
			
		}
	}
	// Remove Contact//
	public void removeContact(String name) {
		if (findContact(name)==false) {
			System.out.println("Contact name doesn't exist");
		}
		else {
			int ind = this.contacts.indexOf(name);
			this.contacts.remove(ind);
			System.out.println("Contact "+name+ "was removed");
		}
	}
     //Show Contacts//
		public void showContacts() {
			if (this.contacts.size()== 0) {
				System.out.println("Your Contact List is Empty");
			}
			else {
		for (int i = 0; i < this.contacts.size(); i++) {
			
			
	 System.out.println("Contact ["+(i+1)+"] : "+contacts.get(i).getName()+"\tAge: "+contacts.get(i).getAge()+"\tNumber: "+contacts.get(i).getNumber());
		
		}
			     }
			
		}
		
	
	//ShowOPTIONS//
	public void showOptions() {
		System.out.println("1 - Show Contacts");
		System.out.println("2 - Add Contact");
		System.out.println("3 - Remove Contact");
		System.out.println("4 - Exit");
	}

}
