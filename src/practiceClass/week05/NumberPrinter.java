package practiceClass.week05;

//Exercise 1.3
public class NumberPrinter {
	public static void main(String[] args) {
		System.out.println("\nDivided by 3: ");
		for (int i = 1; i <= 100; i++) {
			if (i%3 == 0) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println("\n\nDivided by 5: ");
		for (int i = 1; i <= 100; i++) {
			if (i%5 == 0) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println("\n\nDivided by 3 & 5: ");
		for (int i = 1; i <= 100; i++) {
			if (i%15 == 0) {
				System.out.print(i + " ");
			}
		}
	}
}
