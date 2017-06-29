import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class G extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	G(){
		setTitle ("Geometry Dash");
		setSize (1920,720);
		MyPanel p = new MyPanel();
		add(p);
			setVisible (true);
}
	public static void main (String[]args){
		new G();
	}
	private class MyPanel extends JPanel{
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public void paintComponent (Graphics g){
			g.setColor(Color.ORANGE);
			g.fillOval(50, 10, 100, 100);
			g.setColor(Color.ORANGE);
			g.fillOval(50, 100, 100, 200);
			g.setColor(Color.BLACK);
			g.fillOval(85, 30, 10, 10);
			g.setColor(Color.BLACK);
			g.fillOval(115, 30, 10, 10);
			g.setColor(Color.BLACK);
			g.fillOval(100, 180, 10, 10);
			g.setColor(Color.BLACK);
			g.fillOval(100, 150, 10, 10);
			g.setColor(Color.BLACK);
			g.fillOval(100, 210, 10, 10);
			g.setColor(Color.ORANGE);
			g.fillRect(10,130,70,30);
			g.setColor(Color.ORANGE);
			g.fillRect(120, 130, 70, 30);
			g.setColor(Color.ORANGE);
			g.fillRect(60, 250, 30, 150);
			g.setColor(Color.ORANGE);
			g.fillRect(110,250,30,150);
			g.setColor(Color.BLACK);
			g.drawArc(70, 60, 60, 40, 180, 180);
		}
	}
}