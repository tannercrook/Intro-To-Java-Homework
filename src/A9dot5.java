import javax.swing.JOptionPane;


public class A9dot5 {

	public static void main(String[] args) {
		
		// GET INPUT
		String input = JOptionPane.showInputDialog("Please enter a string:");
		
		// CALL FUNCTION AND DO WORK
		int [] counts = new int[input.length()];
		counts = count(input);
		
		// OUTPUT INFO TO CONSOLE
		for (int i = 0; i < input.length(); i++) {
			System.out.println("Counts["+i+"] is: " + counts[i]);
		}

	}
	
	// COUNT METHOD TO COUNT THE OCCURANCES PER CHARACTER
	public static int[] count(String s) {
		int[] counts = new int[s.length()];
		char[] stringChar = s.toCharArray();
		System.out.println(s.toCharArray());
		
		
		// DO CALCULATIONS AND FILL COUNTS
		for (int i = 0; i < s.length(); i ++) {
			for(int j = 0; j < s.length(); j ++){
				if (stringChar[i] == stringChar[j]){
					counts[i] += 1;
				}
			}
		}
		
		return counts;
	}

}
