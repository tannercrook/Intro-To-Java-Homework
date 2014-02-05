import java.util.Scanner;


public class A6dot10 {

	public static void main(String[] args) {
		// This program finds the smallest element in array and outputs its index.
		
		Scanner input = new Scanner(System.in);
		
		double[] array = new double[10];
				
				System.out.println("Please enter 10 doubles: ");
				
				for(int i = 0; i < array.length; i++) {
					array[i] = input.nextDouble();
				}
				
				int smallest = indexOfSmallestElement(array);
				
				System.out.println("The index of the minimum number is: " + smallest);
				

}

	
	// Get the index of the smallest
		public static int indexOfSmallestElement(double[] array) {
			
			// initialize smallest
			double smallest = array[0];
			int indexOfSmallest = 0;
			
			for(int i = 0; i < array.length; i++) {
				if(array[i] < smallest) {
					smallest = array[i];
					indexOfSmallest = i;
				}
			}
			// RETURN THE INDEX OF SMALLEST
			return indexOfSmallest;
		}

}
