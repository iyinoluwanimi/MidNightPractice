public class PrintNumbersFrom1To100ExcludeMultiplesOf6 {

	public static void main (String... args) {
		
		int index = 1;
		while (index <= 100) {
		
			if (index % 6 == 0) {
			  index++;
				continue;
			}
			else {
        System.out.print(index + " ");
        index++;
  }
		}
		
	}

}
