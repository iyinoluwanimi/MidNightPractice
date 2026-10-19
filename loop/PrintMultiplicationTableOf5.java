public class PrintMultiplicationTableOf5 {

	public static void main(String [] args) {
	
		int index = 1;
		do {
		    
		    int multiplication = 5 * index;
		    System.out.printf("5 * %d = %d",index,multiplication);
		    System.out.println();
		    index++;
		
		}while(index <= 12);
	
	}

}
