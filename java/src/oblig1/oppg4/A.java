package oblig1.oppg4;

public class A {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0; i < 3000; i += 7) {
			sum += i;
		}
		System.out.println("Sum er: " + sum);
		// Sum er: 642642
	}
}
