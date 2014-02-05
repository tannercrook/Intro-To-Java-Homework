/*	Tanner Crook
 * 
 * PSUEDO CODE
 * ---------------------------------
 * 
 * double fahrenheittoCelsius(double fahrenheit)
 * ----------------------------------------------
 * double celsius = conversion math (9.0/5) * celsius - 32)
 * return celsius
 * 
 * double celsiustoFahrenheit(double celsius)
 * -----------------------------------------------
 * double fahrenheit = conversion math (9.0/5) * celsius + 32)
 * 
 * MAIN
 * -------
 * 
 * print table headings
 * int j = 120.0;  (COUNTER FOR OTHER TABLE SIDE)
 * 
 * Table
 *-------------
 *for (40 - 31) {
 *fahrenheit = celsiustoFahrenheit(i);
 *printf celius and fahrenheit
 *printf "|"
 *celsius = fahrenheittoCelsius(j);
 *printf fahrenheit and celsius
 *j = j - 10;
 *
 */
public class A5dot8 {

	public static void main(String[] args) {
		// This application displays a table of temperature conversions.
		
		// DISPLAY TABLE HEADINGS
		
		System.out.printf("%-20s", "Celsius");
		System.out.printf("%-20s", "Fahrenheit");
		System.out.printf("%-15s", "|");
		System.out.printf("%-20s", "Fahrenheit");
		System.out.printf("%-20s", "Celsius");
		System.out.println();
		System.out.println("-----------------------------------------------------------------------------------");
		
		// INITIALIZE SECOND CONVERSION COUNTER
		double j = 120.0;
		
		// BUILD AND FILL TABLE
		for (double i = 40.0; i > 30; i--) {
			
			// CELSIUS TO FAHRENHEIT
			double fahrenheit = celsiustoFahrenheit(i);
			System.out.printf("%-20.1f", i);
			System.out.printf("%-20.1f", fahrenheit);
			// table decoration
			System.out.printf("%-15s", "|");
			
			// FAHRENHEIT TO CELSIUS
			double celsius = fahrenheittoCelsius(j);
			System.out.printf("%-20.1f", j);
			System.out.printf("%-20.2f", celsius);
			// Adjust this conversion counter for next time
			j = j -10;
			// Go to a new line
			System.out.println();
			
		}
		

	}
	
	// CONVERTS FAHRENHEIT TO CELSIUS
	public static double fahrenheittoCelsius(double fahrenheit) {
		double celsius = (5.0/ 9) * (fahrenheit - 32);
		return celsius;
	}
	
	// CONVERTS CELSIUS TO FAHRENHEIT
	public static double celsiustoFahrenheit(double celsius) {
		double fahrenheit = (9.0 / 5) * celsius + 32;
		return fahrenheit;
	}

}
