package oblig2.oppg6;

public class D {
	public static void main(String[] args) {
		double vesktfaktor = 1.015;
		int mnd = 0;
		double y = 5000;
		double sluttverdi = 10000;

		while (y < sluttverdi) {
			y *= vesktfaktor;
			++mnd;
		}
		System.out.println("Etter " + mnd + " måneder blir lånebeløpet " + y);
		// Etter 47 måneder blir lånebeløpet 10066.395513857045
	}
}
