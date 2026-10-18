public class printSumOfNumbersFrom1To50 {

	public static void main (String... args) {
		
		int index = 1;
		int sumOfNumbers = 0;
		while (index <= 50) {
			sumOfNumbers = sumOfNumbers + index;
			index++;
		
		}
		System.out.println(sumOfNumbers);
	}

}
