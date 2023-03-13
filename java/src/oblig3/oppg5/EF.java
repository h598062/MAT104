package oblig3.oppg5;

import java.util.Arrays;

public class EF {
	/*
	Bruk Newtons metode for å løse ligningen f(x) = 0

	Newtons metode formel:
	xn+1 = xn - ( f(xn) / f'(xn) )

	f(x)  = 2x^3 + 9x^2 - 24x + 1
	f'(x) = 6x^2 + 18x - 24

	bruker -7, 0 og 2 som startverdier

	resurser brukt:
	https://no.wikipedia.org/wiki/Newtons_metode
	https://snl.no/Newtons_metode

	 */

	private static final double NØYAKTIGHET = 0.0000000001;

	public static void main(String[] args) {

		int[] startverdier = {-7, 0, 2};
		System.out.println("Beregner nullpunkter for startverdier " + Arrays.toString(startverdier) +
		                   " med nøyaktighet " + NØYAKTIGHET);
		for (int x : startverdier) {
			System.out.println("Beregner nullpunkt for startverdi " + x + ":");
			double np = newtonsMetode(x);
			System.out.println("Fant nullpunkt (" + x + ", " + String.format("%.10f", np) + ")\n");
		}
		/*
		programmet fant verdiene:
			(-7, -6.3901383512)
			( 0,  0.0423454197)
			( 2,  1.8477929315)
		 */
	}

	private static double newtonsMetode(double x) {
		// variabel h blir en delta, denne kan vi bruke til å regne nøyaktigheten.
		// hver iterasjon blir også printet ut, slik at vi kan følge med på
		// hvor fort riktige desimaler blir funnet
		double h   = f(x) / fDerivert(x);
		x = x - h;
		System.out.println("\t * " + x);
		if (Math.abs(h) < NØYAKTIGHET) {
			return x;
		} else {
			return newtonsMetode(x);
		}
	}

	private static double f(double x) {
		return 2 * Math.pow(x, 3) + 9 * Math.pow(x, 2) - 24 * x + 1;
	}

	private static double fDerivert(double x) {
		return 6 * Math.pow(x, 2) + 18 * x - 24;
	}

}
