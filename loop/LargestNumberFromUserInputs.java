import java.util.Scanner;

public class LargestNumberFromUserInputs {
	public static void main(String... args) {
  
	  Scanner input = new Scanner(System.in);
	  System.out.print("Enter a Number: ");
	  int userInput = input.nextInt();
	  
	  int largestNumber = userInput;
	  
	  int index = 1;
	  while(index < 5 ) {
  
	  System.out.print("Enter a Number: ");
	  int newInput = input.nextInt();
	  if (newInput > largestNumber) {
	    largestNumber = newInput;
	  }
    index++;
  }
    System.out.printf("The largest Number is %d",largestNumber);
}
}
