import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ge extends JFrame{
	ge(){
		setTitle ("Geometry Dash");
		setSize (1920,720);
		MyPanel p = new MyPanel();
		add(p);
			setVisible (true);
}
	public static void main (String[]args){
		new ge();
	}
	private class MyPanel extends JPanel{
		public void paintComponent (Graphics g){
			g.drawLine(50, 50, 350, 200);
			g.drawLine(350, 50, 50, 200);
			g.drawLine(50, 50, 200, 350);
			g.drawLine(350, 50, 200, 350);
			g.drawLine(50,350,350,200);
			g.drawLine(350, 350, 50, 200);
			g.drawLine(50, 350, 200, 50);
			g.drawLine(350, 350, 200, 50);
			g.drawOval(50, 50, 300, 300);
			//draw rectangle
			g.setColor(Color.RED);
			g.fillRect(1000, 60, 50, 80);
			//draw ellipse
			g.setColor(Color.BLUE);
			g.fillOval(1100, 80, 80, 50);
			//drak arc
			g.setColor(Color.ORANGE);
			g.drawArc(1050, 150, 60, 40, 180, 180);
		}
	}
}