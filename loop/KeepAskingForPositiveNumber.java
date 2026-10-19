import java.util.Scanner;

public class KeepAskingForPositiveNumber {

	public static void main(String...args) {
	    Scanner input = new Scanner(System.in);
	    System.out.println("Enter a Positive Number: ");
	    int userInput = input.nextInt();
	    
	    do {
	    
	        System.out.println("Enter a Positive Number: ");
	        userInput = input.nextInt();
	        
	        
	    }while(userInput < 1);
	
	}

}
