public class printOddNumbersFrom1To100 {

	public static void main (String... args) {
	
		for (int index = 1; index <= 100; index++) 	{
			if (index % 2 == 1)
				System.out.print(index + " "); 
		}
	
	}

}
