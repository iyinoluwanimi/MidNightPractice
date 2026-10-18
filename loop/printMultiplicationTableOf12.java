public class printMultiplicationTableOf12 {

	public static void main (String... args) {
		
		int index = 1;
		while (index <= 12) {
			int multiplication = 12 * index;
			System.out.printf("12 * %d = %d",index,multiplication);
			System.out.println();
			index++;
		
		}
		
	}

}
