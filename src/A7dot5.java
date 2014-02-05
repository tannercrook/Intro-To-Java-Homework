import java.util.Scanner;


public class A7dot5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Declare matrix
		double[][] a = new double[3][3];
		double[][] b = new double[3][3];
		double[][] summedUp = new double[3][3];
		
		// Fill Arrays
		a = userFillArray();
		b = userFillArray();
		
		System.out.println("Arrays Successfully Filled...");
		
		// Add Arrays
		summedUp = addMatrix(a, b);
		
		System.out.println("Arrays Successfully Added...");
		
		// OUTUPT
		output(summedUp, a, b);
		
		
		
		

	}
	
	// OUTPUT RESULTS FUNCTION
	public static void output(double[][] s, double[][] a, double[][] b) {
		System.out.println("The matricies are added as follows");
		
		// Output Results
				for (int i = 0; i < 3; i++) {
					if (i == 1) {
						System.out.printf("%2.1f, %2.1f, %2.1f   +", a[i][0], a[i][1], a[i][2]);
						System.out.printf("%6.1f, %2.1f, %2.1f   =", b[i][0], b[i][1], b[i][2]);
						System.out.printf("%6.1f, %2.1f, %2.1f", s[i][0], s[i][1], s[i][2]);
					}
					else {
							System.out.printf("%2.1f, %2.1f, %2.1f", a[i][0], a[i][1], a[i][2]); 
							System.out.printf("%10.1f, %2.1f, %2.1f", b[i][0], b[i][1], b[i][2]);
							System.out.printf("%10.1f, %2.1f, %2.1f", s[i][0], s[i][1], s[i][2]);
						}
					
						System.out.println();
					}
				
				
	}
	
	
	// ADD MATRIX METHOD
	public static double[][] addMatrix(double[][] a, double[][] b){
		double[][] summedUp = new double[3][3];
		
		for (int i = 0; i < 3; i++) {
			for (int l = 0; l < 3; l++){
				System.out.println(l + " ");
				summedUp[i][l] = a[i][l] + b[i][l];
			}
		}
		
		return summedUp;
	}
	
	
	
	// DEFAULT USER FILL ARRAY METHOD MADE BY TANNER CROOK
	public static double[][] userFillArray() {
		// TABLE SIZE
		int rows = 3;
		int cols = 3;
		
		// INPUT
		Scanner input = new Scanner(System.in);
		System.out.println("Input a " + rows + " x " + cols + " table. I will state when a new row starts.");
		
		// ROW COUNTER FOR INPUT
		int rowCount = 1;
		
		// DECLARATION OF ARRAY
		double [][] array = new double[rows][cols];
		
		for (int i = 0; i < rows; i++){
			System.out.println("Please insert row " + rowCount + ": ");
			rowCount++;
			for(int j = 0; j < cols; j++) {
				array[i][j] = input.nextDouble();
			}
		}
		
		return array;
	}

}
