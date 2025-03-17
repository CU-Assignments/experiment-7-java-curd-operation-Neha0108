package CRUD;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {
	
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws SQLException {
		
		while(true)
		{
			printMenu();
			int choice = sc.nextInt();
			
			switch(choice)
			{
			case 1:
                addUser();
                break;
            case 2:
                viewUser();
                break;
            case 3:
                viewAllUsers();
                break;
            case 4:
                updateUser();
                break;
            case 5:
                deleteUser();
                break;
            case 6:
                System.out.println("Exiting...");
                return;
            default:
                System.out.println("Invalid choice. Please try again.");
			}
		}		
}
	
	private static void printMenu() {
		System.out.println("\n--- User Management ---");
        System.out.println("1. Add User");
        System.out.println("2. View User");
        System.out.println("3. View All Users");
        System.out.println("4. Update User");
        System.out.println("5. Delete User");
        System.out.println("6. Exit");
        System.out.print("Enter your choice: ");
	}
	
	private static void addUser() throws SQLException {
		
		System.out.print("Enter ID: ");
		int StudentID = sc.nextInt();
		
		System.out.print("Enter name: ");
		String StudentName = sc.next();
		
		System.out.print("Enter cgpa: ");
		float StudentCgpa = sc.nextFloat();
		
		System.out.print("Entr Year: ");
		int StudentYear = sc.nextInt();
		
		User user = new User(StudentID,StudentName,StudentCgpa,StudentYear);
		
		Operations.AddUser(user);
		System.out.println("user added successfully!");
		
	}
	
	private static void deleteUser() throws SQLException {
		
		System.out.print("Enter ID: ");
		int StudentID = sc.nextInt();
		
		Operations.DeleteUser(StudentID);
		System.out.println("user deleted successfuly!");
				
	}

	private static void viewUser() throws SQLException {
		
		System.out.println("Enter ID: ");
		int StudentID = sc.nextInt();

		Operations.ViewUser(StudentID);
		System.out.println("User data fetched successfully");
	}

	private static void viewAllUsers() throws SQLException {
		
		System.out.println("Presenting all users: ");
		Operations.ViewAllUsers();
		System.out.println("Thank You ");	
	}
	
	private static void updateUser() throws SQLException {
		
		System.out.println("Updating User info: ");
		
		System.out.println("EnterID ");
		int StudentID = sc.nextInt();
		
		System.out.print("Enter name: ");
		String StudentName = sc.next();
		
		System.out.print("Enter cgpa: ");
		float StudentCgpa = sc.nextFloat();
		
		System.out.print("Entr Year: ");
		int StudentYear = sc.nextInt();
		
		User user = new User(StudentName,StudentCgpa,StudentYear);
		Operations.UpdateUser(StudentID, user);	
		System.out.println("Updated successfully");
		
	}
}
