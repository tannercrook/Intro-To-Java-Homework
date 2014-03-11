

import java.util.Scanner;

public class A14dot3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = new int[100];
		
		// MAKE
		array = makeArray();
		
		// TRY
		getArrayNumber(array);
		

	}
	
	public static int[] makeArray()
	{
		int[] array = new int[100];
		
		for(int i = 0; i < 100; i++)
		{
			array[i] = 1 + (int)(Math.random()*199);
		}
		
		return array;
	}
	
	public static void getArrayNumber(int[] array)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an index[0-99] to get data: ");
		int pick = input.nextInt();
		int data = 0;
		
		try{
			data = array[pick];
			System.out.println("The number at [" + pick + "] is: " + data);
		}
		catch (ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("OUT OF BOUNDS");
		}
	}

}
