import java.util.Scanner;


public class A6dot8 {

	public static void main(String[] args) {
		// The program deals with overloaded functions
		
		Scanner input = new Scanner(System.in);
		
		// make array
		double[] array = new double[10];
		
		System.out.println("Please enter 10 doubles: ");
		
		for(int i = 0; i < array.length; i++) {
			array[i] = input.nextDouble();
		}
		
		double average = average(array);
		
		System.out.println("The average is: " + average);

	}
	
	// GETS AVERAGE OF DOUBLE ARRAY
	public static double average(double[] array) {
		
		double total = 0;
		
		for (int i = 0; i < array.length; i++) {
			total = array[i] + total;
		}
		double average = total / array.length;
		
		// RETURN AVERAGE
		
		return average;
	}
	
	// GETS AVERAGE OF INT ARRAY
	public static int average(int[] array) {
		
		int total = 0;
		
		for (int i = 0; i < array.length; i++) {
			total = array[i] + total;
		}
		int average = total / array.length;
		
		return average;
	}

}
