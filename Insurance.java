import java.util.*;

/**
 * 
 * @author Nico
 *
 */

public class Insurance {
	/**
	 * Prints out stars
	 * @author Nico
	 * @param starCount Number of stars printed
	 */
	private static void printStars(int starCount) {
		String starField= "";
		for (int i = 0; i < starCount; i++)
		{
			starField = starField + "*";
		}
		System.out.println(starField);
	}
	/**
	 * Prints out welcome message
	 * @author Nico
	 */
	private static void printWelcome() {
		printStars(50);
		System.out.println("	INSURANCE SCORE CARD	");
		System.out.println("This app scores a potential customer\r\n" + 
				"on various health attributes: blood\r\n" + 
				"pressure, age, height, weight, and\r\n" + 
				"family history of disease. It writes\r\n" + 
				"each member's insurance grade to a\r\n" + 
				"JSON file so that they can be easily\r\n" + 
				"shared on a web-based data exchange.");
		printStars(50);
	}
	/**
	 * Prints out menu
	 * @author Nico
	 */
	private static void showMenu() {
		System.out.print("Here are your choices: ");
		System.out.print("\n1. List members");
		System.out.print("\n2. Add a new Member");
		System.out.print("\n3. Save members");
		System.out.print("\n4. Load memebers");
		System.out.print("\n5. Assess members");
		System.out.print("\n6. Save assesments as JSON");
		System.out.print("\n7. Exit");
	}
	/**
	 * Main driver class that is used to initialize and run the program
	 * @author Nico
	 * @param args Included library
	 */
	public static void main(String[] args) {
		printWelcome();
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter name of member file: ");
		String fname = sc.nextLine();
		ArrayList<Member> members= MemberReader.readMembersFromTextFile(fname);
		int choice;
		do {
			showMenu();
			System.out.print("\nPlease enter your choice: ");
			choice= sc.nextInt();
			if (choice == 1) {
				for (Member mem: members) {
					Member.getMembersAsString(mem);
				}
			}else if (choice == 2) {
				System.out.print("Enter first and last name: ");
				sc.nextLine();
				String name = sc.nextLine();
				String[] name1 = name.split(" ");
				String firstname = name1[0];
				String lastname = name1[1];
				System.out.print("Enter age: ");
				int age= sc.nextInt();
				System.out.print("Enter height in inches: ");
				int height= sc.nextInt();
				System.out.print("Enter weight in pounds: ");
				int weight= sc.nextInt();
				System.out.print("Enter blood pressure (sys and dia): ");
				int bpsys= sc.nextInt();
				int bpdia= sc.nextInt();
				System.out.print("Has a family memeber had ... ");
				System.out.print("Cancer? ");
				String cancer= sc.next();
				System.out.print("Diabetes? ");
				String diabetes= sc.next();
				System.out.print("Alzheimers? ");
				String alzheimers= sc.next();
				Member mem = new Member(firstname, lastname, age, height, weight, bpsys, bpdia, cancer, diabetes, alzheimers);
				members.add(mem);
			}else if (choice == 3) {
				
			}else if (choice == 4) {
				
			}else if (choice == 5) {
				
			}else if (choice == 6) {
				
			}
			
		} while(choice!= 7);
	}

}
