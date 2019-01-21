package coins;

//Importing javax.swing for JFrame and java.awt for Graphics and Color
import javax.swing.*;
import java.awt.*;

public class Circles extends JPanel {
	
	public void paint(Graphics g) {
		
		/*
		 * Using java.awt.Graphics to create circles and fill using java.awt.Color
		 * drawOval creates the circle
		 * setColor chooses a color
		 * fillOval fills the circle from the setColor
		 * drawString creates a string for the cents
		 */
		
		//Penny graphic
		g.drawOval(25, 200, 50, 50);
		g.setColor(Color.orange);
		g.fillOval(25, 200, 50, 50);
		g.setColor(Color.black);
		g.drawString("1\u00A2", 45, 230);
		
		//Nickel graphic
		g.drawOval(100, 175, 100, 100);
		g.setColor(Color.gray);
		g.fillOval(100, 175, 100, 100);
		g.setColor(Color.black);
		g.drawString("5\u00A2", 140, 230);
		
		//Dime graphic
		g.drawOval(225, 205, 40, 40);
		g.setColor(Color.gray);
		g.fillOval(225, 205, 40, 40);
		g.setColor(Color.black);
		g.drawString("10\u00A2", 235, 230);
		
		//Quarter graphic
		g.drawOval(300, 150, 150, 150);
		g.setColor(Color.gray);
		g.fillOval(300, 150, 150, 150);
		g.setColor(Color.black);
		g.drawString("25\u00A2", 365, 225);
	}
	
	public static void main(String[] args) {
		//Creating a JFrame named window
		JFrame window = new JFrame();
		
		//Setting window size
		window.setSize(800, 600);
		
		//Set title of JFrame
		window.setTitle("Coin Displayer");
		
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Create circles object named coins
		Circles coins = new Circles();
		
		//Adds circles object to window
		window.add(coins);
		
		//Sets window to visible
		window.setVisible(true);
	}
}


