public class FactorialOf5 {

	public static void main (String... args) {
		
		int index = 1;
		int factorial = 1;
		while (index <= 5) {
		
			factorial = factorial * index;
			index++;
		
		}
		System.out.print(factorial);
	}

}
