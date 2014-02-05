/*-----------------------------------------------
 * 	AUTHOR: TANNER CROOK
 * ----------------------------------------------
 * 
 * PSUEDO CODE
 * ----------------------------------
 * for 100 - 1000 {
 * 	int count = 100 (in loop declaration)
 * 		if (count%5 ==0 && count%6 == 0) {
 * 			Output the number formatted
 * 		}
 * 	if (i == 10){
 * 		i = 0;
 * 		println
 * 	}
 * 
 */
public class A4dot10 {

	public static void main(String[] args) {
		// DISPLAYS NUMBERS BETWEEN 100 - 1000s THAT CAN DIVIDE BY 5 & 6

		// Declare per line counter (10)
		int i = 0;

		// MAIN LOOP
		for (int count = 100; count < 1001; count++){



			// TEST DIVISION
			if (count%5 == 0 && count%6 == 0){
				System.out.printf("%4d", count);
				i++;
			}

			// CHECK FOR NEW LINE
			if (i == 10){
				System.out.println();
				i = 0;
			}
		}
	}
}
