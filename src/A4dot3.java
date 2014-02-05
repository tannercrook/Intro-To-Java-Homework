// Tanner Crook

/* PSUEDO CODE
 * --------------------------------------------------------------
 * declare final CONVERT = 2.2
 * Output table headings
 * for 199 {
 * 	double pounds = count * CONVERT
 * 	output formatted (count pounds)
 * }
 * 
 * 
 * 
 */

public class A4dot3 {

	public static void main(String[] args) {
		// KILO TO LB TABLE OUTPUTTER
		
		final double CONVERT = 2.2;
		

		// TABLE HEADINGS
		System.out.printf("Kilograms");
		System.out.printf("%15s", "Pounds");
		System.out.println();
		
		for (int count = 1; count < 200; count+=2) {
			double pounds = count * CONVERT;
			System.out.printf("%-10s", count);
			System.out.printf("%14.1f", pounds);
			System.out.println();
		}
		
		

	}

}
