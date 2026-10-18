public class printNumbersFrom1To100ExcludingMultiplesOf4 {

	public static void main (String... args) {
	
		
		for (int index = 1; index <= 100; index++) 	{
		    
		    if (index % 4 == 0) {
		        continue;
		    }
		    else {
		        System.out.print(index + " "); 
		    }
		    
		}
	
	}

}
