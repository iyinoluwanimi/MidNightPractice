import java.util.Scanner;

public class PasswordChecker {
	public static void main(String... args) {
  
  String password = "123456789";
  
  Scanner input = new Scanner(System.in);
  System.out.print("Enter the Password: ");
  String userInput = input.nextLine();
  
  while(!userInput.equals(password) ) {
  
    System.out.println("Wrong Password");
    System.out.print("Enter the Password: ");
    userInput = input.next();
  
  }
    System.out.println();
    System.out.println("Correct Password");
}
}
