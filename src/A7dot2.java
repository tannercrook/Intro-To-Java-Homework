import java.util.Scanner;

/*
 * Tanner Crook
 * 
 * Psuedo Code
 * ------------------
 * 
 */
public class A7dot2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double[][] m = new double[4][4];
		
		m = fillArray();
		
		double sum = 0;
		
		sum = sumMajorDiag(m);
		
		System.out.println("The sum is: " + sum);
		

	}
	
	public static double sumMajorDiag(double[][] m) {
		double sum = 0;
		
		for (int i = 0; i < 4; i++) {
			int j = i;
			sum += m[i][j];
		}
		
		return sum;
	}
	
	public static double[][] fillArray() {
		Scanner input = new Scanner(System.in);
		System.out.println("Input a 4 x 4 table. I will state when a new row starts.");
		int rowCount = 1;
		double [][] m = new double[4][4];
		
		for (int i = 0; i < 4; i++){
			System.out.println("Please insert row " + rowCount + ": ");
			rowCount++;
			for(int j = 0; j < 4; j++) {
				m[i][j] = input.nextDouble();
			}
		}
		
		return m;
	}

}
