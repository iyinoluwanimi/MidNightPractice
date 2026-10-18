public class printEvenNumbersFrom2To50 {

	public static void main (String... args) {
		
		int index = 2;
		while (index <= 50) {
			if (index % 2 == 0) {
				System.out.print(index + " ");
			}
			index++;
		
		}
		
	}

}
