import javax.swing.JOptionPane;


public class A9dot11 {

	public static void main(String[] args) {
		// THiS PROGRRAM SORTS STRINGS ALPHABETICALLY
		
		String s = JOptionPane.showInputDialog("Enter a String: ");
		String sortie = sort(s);
		JOptionPane.showMessageDialog(null, "Your sorted string is: " + sortie);

	}
	public static String sort(String s) {
		String sorted;
		char[] string = s.toCharArray();
		char temp;
		
		for (int i = 0; i < s.length()-1; i++)
		{
			for (int j = 0; j < s.length() - i - 1; j++)
			{
				if (string[j] > string[j+1])
				{
					temp = string[j];
					string[j] = string[j+1];
					string[j+1] = temp;
				}
			}
		}
		sorted = new String(string);
		return sorted;
	}

}
