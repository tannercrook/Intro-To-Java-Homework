import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 * Build a pie chart for grades.
 */
public class A13dot15 extends JFrame {
	public A13dot15()
	{
		add(new drawPanel());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
		A13dot15 frame = new A13dot15();
		
		
		
	
		// SET FRAME
		frame.setTitle("A13dot15");
		frame.setSize(600, 400);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		

	}
	
}

class drawPanel extends JPanel
{
	@Override
	protected void paintComponent(Graphics g) 
	{
		super.paintComponent(g);
		
		int xCenter = getWidth() /2;
		int yCenter = getHeight() /2;
		int radius = (int)(Math.min(getWidth(), getHeight()) * 0.4);
		
		int x = xCenter - radius;
		int y = yCenter -radius;
		
		g.setColor(Color.RED);
		g.fillArc(x, y, 2 * radius, 2 * radius, 0, 72);
		
		g.setColor(Color.BLUE);
		g.fillArc(x, y, 2 * radius, 2 * radius, 72, 36);
		
		g.setColor(Color.GREEN);
		g.fillArc(x, y, 2 * radius, 2 * radius, 108, 108);
		
		g.setColor(Color.ORANGE);
		g.fillArc(x, y, 2 * radius, 2 * radius, 216, 144);
		
	}
}

