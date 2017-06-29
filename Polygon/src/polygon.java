import javax.swing.JFrame;
import javax.swing.JPanel;

public class polygon {
	public static void main (String[]args){
		JFrame f = new JFrame ("Draw Line");
		f.setSize(400,300);
		MyPanel p = new MyPanel();
		f.add(p);
		f.setVisible(true);
	
	}
	public static void main (String[]args){
		new polygon();
		private class MyPanel extends JPanel{
			public void paintComponent (Grapics g){
				g.drawLine(50,50,350,50);
			}
		}
}
}
