import java.util.Scanner;

public class WhileUserNumberNotZero {
	public static void main(String... args) {
  
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a Number: ");
    int userInput = input.nextInt();
    
    while(userInput != 0 ) {
    
    System.out.print("Enter a Number: ");
    userInput = input.nextInt();
  
  }

}
}
