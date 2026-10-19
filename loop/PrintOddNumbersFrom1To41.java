public class PrintOddNumbersFrom1To41 {

	public static void main(String [] args) {
	
	    int index = 1;
	    do {
	    
	        if (index % 2 == 1) {
	            System.out.print(index + " ");
	        }
	        index++;
	    
	    }while(index <= 41);
	
	}

}
