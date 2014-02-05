/* TANNER CROOK
 * 
 * PSUEDO CODE
 * ---------------------------
 * Main {
 * make scanner
 * make array[10]
 * get input and fill array
 * call mean
 * call deviation
 * make formatted output.
 * }
 * 
 * Mean {
 * initialize variables
 * for [array length] add numbers
 * 		calculate mean by dividing by array.length
 * return mean
 * }
 * 
 * Deviation {
 * initialize variables
 * for [array length]
 * 		array[i] - mean math.pow 2
 * 		add those up into "total"
 * divide total / array.length - 1
 * square root
 * return deviation
 * }
 * 
 * 
 * 
 * 
 * 
 * AUTHOR: TANNER CROOK
 * 
 * THIS PROGRAM FILLS AN ARRAY OF 10 USER INPUTTED NUMBERS, THEN CALCULATES THE MEAN
 * AND THE DEVIATION.
 */


import java.util.Scanner;


public class A6dot11 {

	public static void main(String[] args) {
		// This program finds the mean and deviation of 10 numbers
		
		// Declare scanner
		Scanner input = new Scanner(System.in);
		
		// Declare array
		double[] x = new double[10];
		
		System.out.println("Please enter 10 doubles:");
		for (int i = 0; i < x.length; i++) {
			x[i] = input.nextDouble();
		}
		
		double mean = 0.0;
		
		mean = mean(x);
		
		System.out.printf("The mean is: %1.2f", mean);
		System.out.println();
		
		double deviation = 0.0;
		
		deviation = deviation(x);
		
		System.out.printf("The deviation is: %1.5f", deviation);
		
		

	}
	
	public static double mean(double[] x) {
		// Initialize return variable
		double mean = 0.0;
		double total = 0.0;
		
		// Insert Code Here
		for (int i = 0; i < x.length ; i++){
			total += x[i];
		}
		
		mean = total / x.length;
		
		
		return mean;
	}
	
	public static double deviation(double [] x) {
		double deviation = 0.0;
		double total = 0.0;
		double mean = 0.0;
		
		// Insert Code Here
		mean = mean(x);
		
		
		for (int i = 0; i < x.length; i++) {
			total += Math.pow((x[i] - mean), 2);
		}
		
		deviation = total / (x.length - 1);
		
		deviation = Math.sqrt(deviation);
		
		return deviation;
	}

}
