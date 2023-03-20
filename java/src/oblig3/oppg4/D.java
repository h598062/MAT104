package oblig3.oppg4;
public class D {
	public static void main(String[] args) {
		// f(x) = 2x tanx + 4
		// gjør numerisk integrasjon ved hjelp av 25 punkter
		double startPunkt    = 0;
		double sluttPunkt    = Math.PI / 4;
		int    antallPunkter = 25;

		double intervall = (sluttPunkt - startPunkt) / (antallPunkter - 1);

		System.out.println("Intervall: " + intervall);
		System.out.println();

		double[] punkter = new double[antallPunkter];
		punkter[0] = startPunkt;
		for (int i = 1; i < punkter.length; i++) {
			punkter[i] = punkter[i - 1] + intervall;
		}
		System.out.println("Alle punkter:");
		for (int i = 0; i < punkter.length; i++) {
			System.out.print(punkter[i]);
			if (i != 0 && i % 4 == 0) {
				System.out.println();
			} else {
				System.out.print(", ");
			}
		}
		System.out.println();

		double sum = 0;
		for (int i = 0; i < punkter.length - 1; i++) {
			double mp = (punkter[i + 1] + punkter[i]) / 2.0;
			double a = intervall * f(mp);
			System.out.println("Areal for stolpe " + (i + 1) + ": " + a);
			sum += a;
		}

		System.out.println("Sum for numerisk integrasjon er " + sum);
		// Sum for numerisk integrasjon er 3.5129323670421053
	}

	private static double f(double x) {
		return (2 * x * Math.tan(x)) + 4;
	}
}
