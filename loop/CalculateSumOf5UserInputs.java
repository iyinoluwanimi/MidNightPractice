import java.util.Scanner;

public class CalculateSumOf5UserInputs {

	public static void main (String... args) {
		
		int index = 5;
		int sumOfNumbers = 0;
		while (index >= 1) {
		  Scanner input = new Scanner(System.in);
		  System.out.println("Enter a Number:");
		  int userInput = input.nextInt();
		  sumOfNumbers = sumOfNumbers + userInput;
			index--;
		
		}
		System.out.printf("The Sum Of all the Number is : %d",sumOfNumbers);
		System.out.println();
	}

}
