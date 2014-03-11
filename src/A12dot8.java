import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;


public class A12dot8 extends JFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame frame = new JFrame();
		JLabel b1 = new JLabel();
		JLabel b2 = new JLabel();
		JLabel b3 = new JLabel();
		JLabel b4 = new JLabel();
		JLabel b5 = new JLabel();
		JLabel b6 = new JLabel();
		
		// BACKGROUND COLOR
		b1.setBackground(Color.WHITE);
		b2.setBackground(Color.WHITE);
		b3.setBackground(Color.WHITE);
		b4.setBackground(Color.WHITE);
		b5.setBackground(Color.WHITE);
		b6.setBackground(Color.WHITE);
		
		// FOREGROUND COLOR
		b1.setForeground(Color.BLACK);
		b2.setForeground(Color.BLUE);
		b3.setForeground(Color.CYAN);
		b4.setForeground(Color.GREEN);
		b5.setForeground(Color.MAGENTA);
		b6.setForeground(Color.ORANGE);
		
		// FONT
		Font myFont = new Font("Times Roman", Font.BOLD, 20);
		b1.setFont(myFont);
		b2.setFont(myFont);
		b3.setFont(myFont);
		b4.setFont(myFont);
		b5.setFont(myFont);
		b6.setFont(myFont);
		
		// BORDER
		Border border = BorderFactory.createLineBorder(Color.YELLOW);
		b1.setBorder(border);
		b2.setBorder(border);
		b3.setBorder(border);
		b4.setBorder(border);
		b5.setBorder(border);
		b6.setBorder(border);
		
		
		b1.setText("Black");
		b2.setText("Blue");
		b3.setText("Cyan");
		b4.setText("Green");
		b5.setText("Magenta");
		b6.setText("Orange");
		
		
		b1.setToolTipText("Black");
		b2.setToolTipText("Blue");
		b3.setToolTipText("Cyan");
		b4.setToolTipText("Green");
		b5.setToolTipText("Magenta");
		b6.setToolTipText("Orange");
		
		
		frame.add(b1);
		frame.add(b2);
		frame.add(b3);
		frame.add(b4);
		frame.add(b5);
		frame.add(b6);
		
		frame.setSize(600, 400);
		frame.setTitle("A12dot8");
		frame.setLayout(new GridLayout(2, 3));
		frame.setVisible(true);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		
	}

}
