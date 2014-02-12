import java.util.Date;


public class A8dot3 {

	public static void main(String[] args) {
		// This program makes a date and set its elapsed time.

		
		String date = "na";
		long last = 100000000000L;
		
		for (long i = 10000; i <= last; i*= 10) {
			Date now = new Date(i);
			date = now.toString();
			System.out.println(date);
		}
		
		
		
		
		
		
	}

}
