public class printNumbersDivisibleBy8From1To200 {

	public static void main (String... args) {
		
		int index = 1;
		while (index <= 200) {
		
			if (index % 8 == 0) {
				System.out.print(index + " ");
			}
			index++;
		
		}
		
	}

}
