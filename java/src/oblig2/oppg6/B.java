package oblig2.oppg6;

public class B {
	public static void main(String[] args) {
		double vesktfaktor = 1.025;
		int mnd = 0;
		double y = 5000;
		double sluttverdi = 15000;

		for (int i = 0; i < 100; i++) {
			y *= vesktfaktor;
			++mnd;
			if (y > sluttverdi) {
				break;
			}
		}
		System.out.println("Etter " + mnd + " måneder blir lånebeløpet " + y);
		// Etter 45 måneder blir lånebeløpet 15189.51639445015
	}
}
