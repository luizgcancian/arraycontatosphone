import java.util.Scanner;

public class Main {
public static Scanner read = new Scanner(System.in);
	public static void main(String[] args) {
		int option;
		Celphone celphone = new Celphone();
		//Menu//
		do {
		celphone.showOptions();
		option = read.nextInt();
		read.nextLine();
		
		switch (option) {
		case 1:
			System.out.println("--Contacts List--");
			celphone.showContacts();
			break;
		case 2:
			System.out.println("Enter the name of the contact");
			String name = read.nextLine();
			System.out.println("Enter the age of the contact");
			int age = read.nextInt();
			System.out.println("Enter the celphone number of the contact");
			long number = read.nextLong();
			celphone.addContact(name, age, number);
		break;
		case 3:
			System.out.println("Enter the name of the contact you want to remove");
			name = read.nextLine();
			celphone.removeContact(name);
			break;
		case 4:
			System.out.println("Exiting...");
			break;
		default : 
			System.out.println("Invalid option, try again");
			break;
		
		
		}
		
			
			
			
		}while (option != 4);

	}

}
