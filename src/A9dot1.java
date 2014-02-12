import javax.swing.JOptionPane;


public class A9dot1 {

	public static void main(String[] args) {
		// This program checks Social Security Numbers
		
		SSN temp = new SSN();
		
		
		boolean valid = false;
		valid = temp.validate(temp);
		
		JOptionPane.showMessageDialog(null, "The SSN is valid: " + valid);
		
	}
	 

}

class SSN {
	int fT = 000;
	int sT = 00;
	int tT = 0000;
	
	SSN(int first, int second, int third) {
		fT = first;
		sT = second;
		tT = third;
	}
	
	SSN() {
		String firstSoc;
		firstSoc = JOptionPane.showInputDialog("Enter a SSN to be validated: ");
		String firstS = firstSoc.substring(0, 3);
		String secondS = firstSoc.substring(3, 5);
		String thirdS = firstSoc.substring(5);
		
		// Convert String to int
		int first = Integer.parseInt(firstS);
		int second = Integer.parseInt(secondS);
		int third = Integer.parseInt(thirdS);
		
		// DEBUGGING
		
		
		// Create the object
		fT = first;
		sT = second;
		tT = third;
	}
	
	
	boolean validate(SSN temp) {
		boolean valid = false;
		if(temp.fT > 001 && temp.fT < 999) {
			if(temp.sT > 00 && temp.sT < 99) {
				if(temp.tT > 001 && temp.tT < 9999) {
					valid = true;
				}
				
			}
		}
		
		
		else {
			valid = false;
		}
		
		return valid;
	}
	
	
}
