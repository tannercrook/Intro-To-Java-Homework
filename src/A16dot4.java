import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.InputMismatchException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

// GUI CALCULATOR
/*
 * AUTHOR: TANNER CROOK
 * DATE  : MARCH 7, 2014
 * 
 * THIS PROGRAM IS A BASIC CALCULATOR. IT IS FOR DEMONSTRATING GUI
 * COMPONENTS. I USE: 1 FRAME. 2 PANELS. BUTTONS. TEXTFIELDS. LABELS
 * 
 * PLEASE FEEL FREE TO PLAY WITH MY CODE BUT DO NOT CLAIM IT AS YOUR
 * OWN. FEEL FREE TO USE MAJOR COMPONENTS AND ADJUSTING TO YOUR NEEDS
 * BUT THE CODE MUST NOT FOLLOW THE SAME STRUCTURE.
 */
public class A16dot4 extends JFrame{
		static A16dot4 frame = new A16dot4();
		static OpPanel mathPanel = new OpPanel();
		static OpPanel inputPanel = new OpPanel();
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Build Panels
		inputPanel.buildInputPanel();
		frame.add(inputPanel);
		
		mathPanel.buildMathPanel();
		frame.add(mathPanel);
		
		// Build Frame
		frame.buildFrame();
		
		

	}
	
	public static void buildFrame()
	{
		frame.setSize(600, 100);
		frame.setTitle("Tanner's Calculator");
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setLayout(new GridLayout(2, 1));
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

}



// OPERATING PANEL
class OpPanel extends JPanel
{
	
	// BUTTONS
	static JButton sum = new JButton();
	static JButton sub = new JButton();
	static JButton mult = new JButton();
	static JButton div = new JButton();
	
	// TEXT AREAS
	static JLabel inLabel1 = new JLabel();
	static JTextField input1 = new JTextField();
	
	static JLabel inLabel2 = new JLabel();
	static JTextField input2 = new JTextField();
	
	static JLabel result = new JLabel();
	static JTextField output = new JTextField();
	
	
	// BUILD BUTTON PANELS
	public void buildMathPanel()
	{
		// SET TEXT
		sum.setText("Add");
		sub.setText("Subtract");
		mult.setText("Multiply");
		div.setText("Divide");
		
		
		// ADD COMPONENTS
		add(sum);
		add(sub);
		add(mult);
		add(div);
		
		setListeners();
		setVisible(true);
		setLayout(new GridLayout(1, 4));
		
	}
	
	public void buildInputPanel()
	{
		// TEXT AREA
		input1.setSize(200,100);
		input2.setSize(200,100);
		output.setSize(200,100);
		
		// SET LABEL TEXT
		inLabel1.setText("Number 1:");
		inLabel2.setText("Number 2:");
		result.setText("Result:");
		
		output.setEditable(false);
		
		// Number 1
		add(inLabel1);
		add(input1);
		
		// Number 2
		add(inLabel2);
		add(input2);
		
		// Result
		add(result);
		add(output);
		
		setVisible(true);
		setLayout(new GridLayout(1, 3));
	}
	
	
	// Set Listeners for Buttons
	public static void setListeners()
	{
		sum.addActionListener(
	             new ActionListener(){
	                 public void actionPerformed(
	                         ActionEvent e){
	                	 					try 
	                	 					{
	                	 						// GET INPUT
	                	 					double num1 = Double.parseDouble(input1.getText());
	                	 					double num2 = Double.parseDouble(input2.getText());
	                	 					
	                	 					// WORK
	                	 					double response = num1 + num2;
	                	 					String respString = String.valueOf(response);
	                	 					
	                	 					// FILL FIELD
	                	 					output.setText(respString);
	                	 					
	                	 					
	                	 					}
	                	 					catch (NumberFormatException ex)
	                	 					{
	                	 						JOptionPane.showMessageDialog(null, "Invalid Input");
	                	 					}
	                                       }
	                                 }
	                         );
		
		sub.addActionListener(
	             new ActionListener(){
	                 public void actionPerformed(
	                         ActionEvent e){
	                	 					try 
	                	 					{
	                	 						// GET INPUT
	                	 					double num1 = Double.parseDouble(input1.getText());
	                	 					double num2 = Double.parseDouble(input2.getText());
	                	 					
	                	 					// WORK
	                	 					double response = num1 - num2;
	                	 					String respString = String.valueOf(response);
	                	 					
	                	 					// FILL FIELD
	                	 					output.setText(respString);
	                	 					
	                	 					
	                	 					}
	                	 					catch (NumberFormatException ex)
	                	 					{
	                	 						JOptionPane.showMessageDialog(null, "Invalid Input");
	                	 					}
	                                       }
	                                 }
	                         );
		
		mult.addActionListener(
	             new ActionListener(){
	                 public void actionPerformed(
	                         ActionEvent e){
	                	 					try 
	                	 					{
	                	 						// GET INPUT
	                	 					double num1 = Double.parseDouble(input1.getText());
	                	 					double num2 = Double.parseDouble(input2.getText());
	                	 					
	                	 					// WORK
	                	 					double response = num1 * num2;
	                	 					String respString = String.valueOf(response);
	                	 					
	                	 					// FILL FIELD
	                	 					output.setText(respString);
	                	 					
	                	 					
	                	 					}
	                	 					catch (NumberFormatException ex)
	                	 					{
	                	 						JOptionPane.showMessageDialog(null, "Invalid Input");
	                	 					}
	                                       }
	                                 }
	                         );
		
		div.addActionListener(
	             new ActionListener(){
	                 public void actionPerformed(
	                         ActionEvent e){
	                	 					try 
	                	 					{
	                	 						// GET INPUT
	                	 					double num1 = Double.parseDouble(input1.getText());
	                	 					double num2 = Double.parseDouble(input2.getText());
	                	 					
	                	 					// WORK
	                	 					double response = num1 / num2;
	                	 					String respString = String.valueOf(response);
	                	 					
	                	 					// FILL FIELD
	                	 					output.setText(respString);
	                	 					
	                	 					
	                	 					}
	                	 					catch (NumberFormatException ex)
	                	 					{
	                	 						JOptionPane.showMessageDialog(null, "Invalid Input");
	                	 					}
	                                       }
	                                 }
	                         );
	}
}
