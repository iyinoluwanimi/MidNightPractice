import java.util.Scanner;
public class SimpleLoginSimulation {

	public static void main(String [] args) {
	
		String userName = "iyinoluwa";
		String userPassword = "123456789";
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter The Username:");
		String userNameInput = input.next();
		System.out.print("Enter Password:");
		String userPasswordInput = input.next();
		
		do {
		    System.out.println("Incorrect Login Details !!!");
		    System.out.print("Enter The Username:");
		    userNameInput = input.next();
		    System.out.print("Enter Password:");
		    userPasswordInput = input.next();
		}while (!userNameInput.equals(userName) && !userPasswordInput.equals(userPassword) );
		System.out.println("Login Successful !!!");
	
	}

}
