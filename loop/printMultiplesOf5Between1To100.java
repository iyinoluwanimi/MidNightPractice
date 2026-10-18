public class printMultiplesOf5Between1To100 {

	public static void main (String... args) {
	
		for (int index = 1; index < 100; index++) 	{
		
			if (index % 5 == 0) {
			  System.out.print(index + " "); 
			}

		}
	}

}
