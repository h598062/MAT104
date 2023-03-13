package oblig1.oppg4;

public class B {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0; i < 3000; i++) {
			if (i % 3 == 0 || i % 7 == 0) {
				sum += i;
			}
		}
		System.out.println("Sum er: " + sum);
		// Sum er: 1927929
	}
}
