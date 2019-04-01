import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;

public class Ball extends JComponent{
	private Ellipse2D.Double ball;
	
	private int dx= 0, dy=0;
	
	public Ball() {
		ball = new Ellipse2D.Double(20, 20, 10, 10);
		this.setSize(10,10);
	}
	
	public Ball(int x, int y, int sped) {
		ball = new Ellipse2D.Double(20, 20, 10, 10);
		this.setSize(10,10);
		this.setLocation(x, y);
		this.setdx(sped);
	}
	
	
	public void setdx(int x){
		dx = x;
	}
	
	public void setdy(int y) {
		dy = y;
	}
	
	public int getdy() {
		return dy;
	}
	
	public int getdx() {
		return dx;
	}
	
	public void update() {
		setLocation(this.getX() + dx, this.getY());
	}

	public void paintComponent(Graphics g) {
	Graphics2D g2 = (Graphics2D) g;
	g2.draw(ball);
}

}
