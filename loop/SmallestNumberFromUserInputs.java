import java.util.Scanner;

public class SmallestNumberFromUserInputs {
	public static void main(String... args) {
  
	  Scanner input = new Scanner(System.in);
	  System.out.print("Enter a Number: ");
	  int userInput = input.nextInt();
	  
	  int smallestNumber = userInput;
	  
	  int index = 1;
	  while(index < 5 ) {
  
	  System.out.print("Enter a Number: ");
	  int newInput = input.nextInt();
	  if (newInput < smallestNumber) {
	    smallestNumber = newInput;
	  }
    index++;
  }
    System.out.printf("The Smallest Number is %d",smallestNumber);
}
}
