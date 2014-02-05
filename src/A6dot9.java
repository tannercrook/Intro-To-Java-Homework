import java.util.Scanner;


public class A6dot9 {

	public static void main(String[] args) {
		// This program finds the smallest element in an array
		
		// create scanner
		Scanner input = new Scanner(System.in);
		
double[] array = new double[10];
		
		System.out.println("Please enter 10 doubles: ");
		
		for(int i = 0; i < array.length; i++) {
			array[i] = input.nextDouble();
		}
		
		double smallest = min(array);
		
		System.out.println("The minimum number is: " + smallest);
		

	}
	public static double min(double[] array) {
		
		double smallest = array[0];
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] < smallest) {
				smallest = array[i];
			}
		}
		// RETURN THE SMALLEST
		return smallest;
	}
	
	

}
