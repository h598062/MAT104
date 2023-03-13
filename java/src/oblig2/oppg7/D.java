package oblig2.oppg7;

public class D {
	public static void main(String[] args) {
		double start     = 1;
		double slutt     = 2;
		double startsvar = ligning(start);
		double sluttsvar = ligning(slutt);
		double svar      = 0;
		while (startsvar > 0 && sluttsvar < 0) {
			double median  = (start + slutt) / 2;
			double medsvar = ligning(median);
			if (medsvar < 0.000001 && medsvar > -0.0000001) {
				svar = median;
				break;
			}
			if (medsvar > 0) {
				start     = median;
				startsvar = medsvar;
			} else {
				slutt     = median;
				sluttsvar = medsvar;
			}
		}
		System.out.println(svar); // 1.4329923391342163
	}

	public static double ligning(double x) {
		return 2 + (7 * x) - (Math.pow(x, 2)) - (6 * Math.pow(x, 3)) + (2 * Math.pow(x, 4)) - (Math.pow(x, 5) / 8);
	}
}
