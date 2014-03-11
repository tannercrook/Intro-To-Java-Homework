

import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class A14dot2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		int x;
		int y;
		boolean cont = true;
		
		do
		{
			try{
				System.out.println("Enter two integers to be summed: ");
				x = input.nextInt();
				y = input.nextInt();
				int sum = x + y;
				System.out.println("Sum: " + sum);
				cont = false;
				
			}
			catch (InputMismatchException ex){
				System.out.println("Invalid input: Integer Expected!");
				input.nextLine();
			}
		} while(cont);
		
		

	}

}
