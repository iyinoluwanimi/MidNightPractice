public class printProductOfNumbersFrom1To10 {

	public static void main (String... args) {
	
		int ProductOfNumbers = 1;
		for (int index = 1; index <= 10; index++) 	{
		
			ProductOfNumbers = ProductOfNumbers * index;

		}
		System.out.print(ProductOfNumbers); 
	}

}
