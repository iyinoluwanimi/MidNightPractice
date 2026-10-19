public class PrintEvenNumbersFrom2To40 {

	public static void main(String [] args) {
	
		int index = 2;
		do {
		
		  if (index % 2 == 0) {
		    System.out.print(index + " ");
		  }
		  index++;
		
		}while(index <= 40);
	
	}

}
