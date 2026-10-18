public class printSumOfNumbersFrom1To100 {

	public static void main (String... args) {
	
		int sumOfNumbers = 0;
		for (int index = 1; index <= 100; index++) 	{
		
			sumOfNumbers = sumOfNumbers + index;

		}
		System.out.print(sumOfNumbers); 
	}

}
