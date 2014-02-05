

/*	TANNER CROOK
 * 
 * 	PSUEDO CODE
 * ---------------------------------------------------------
 * futureInvestmentValue (amount, rate, year)
 * 	calculate annual rate rate*12
 * 	calculate futureValue Math.pow(amount*(1+rate), year)
 * 	return futurValue
 * 
 * Main Function
 * 	Prompt for user input
 * 		amount
 * 		rate (in percent eg 8%)
 * 	turn rate into decimal
 * 	for 1 - 31
 * 		futureValue = futureInvestmentValue(amount, rate, year)
 * 		Output year, futurValue
 * 
 * 
 */

import java.util.Scanner;

public class A5dot7 {

	// MAIN METHOD
	public static void main(String[] args) {
		// This program calculates and displays a future value of investment over 30 years
		
		// Prompt for user input
		Scanner input = new Scanner(System.in);
		System.out.println("Total amount invested: ");
		double amount = input.nextDouble();
		System.out.println("Annual Interest Rate: ");
		double rate = input.nextDouble();
		
		// change rate to decimal
		rate = rate / 100/12;
		
		System.out.printf("Year");
		System.out.printf("%15s", "Future Value");
		System.out.println();
		// Main Loop (30)
		for (int year = 1; year < 31; year++) {
			// Call method
			double futureValue = futureInvestmentValue(amount, rate, year);
			
			// Output formatted results
			System.out.printf("%-10d", year);
			System.out.printf("%1.2f", futureValue);
			System.out.println();
		}
		

	}
	
	public static double futureInvestmentValue(double amount, double rate, int year) {
		// Reset Value for safety & initialization
		double futureValue = 0;

		// Do math
		
		double firstCalc = Math.pow((1+rate), year*12);
		futureValue = firstCalc * amount;
		
		// Return futureValue
		return futureValue;
	}

}

