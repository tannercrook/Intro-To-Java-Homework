import javax.swing.JOptionPane;


public class A9dot5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = JOptionPane.showInputDialog("Enter a String");
		
		int[] counts = count(s);
		
		// Display Results
		for (int i = 0; i < s.length(); i++) {
			if (counts[i] != 0)
			{
				System.out.println((char) ('0' + i) + " appears " +
						counts[i] + ((counts[i] == 1) ? " time": " times"));
			}
		}

	}
	
	public static int[] count(String s)
	{
		int[] counts = new int[10];
		
		for(int i = 0; i < s.length(); i++)
		{
			
			if (Character.isDigit(s.charAt(i)))
			{
				counts[s.charAt(i) - '0']++;
			}
				
		}
		
		return counts;
	}

}
