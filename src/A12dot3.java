import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;


public class A12dot3 extends JFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// MAKE COMPONENTS
		JFrame frame = new JFrame();
		JButton b1 = new JButton();
		JButton b2 = new JButton();
		JButton b3 = new JButton();
		JButton b4 = new JButton();
		JButton b5 = new JButton();
		JButton b6 = new JButton();
		
		// SET TEXT OF BUTTONS
		b1.setText("aButton");
		b2.setText("aButton");
		b3.setText("aButton");
		b4.setText("aButton");
		b5.setText("aButton");
		b6.setText("aButton");
		
		// ADD BUTTONS TO FRAME
		frame.add(b1);
		frame.add(b2);
		frame.add(b3);
		frame.add(b4);
		frame.add(b5);
		frame.add(b6);
		
		// SET FRAMES
		frame.setSize(300, 150);
		frame.setTitle("A12dot3");
		frame.setLayout(new GridLayout(2, 3));
		frame.setVisible(true);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		

	}

}
