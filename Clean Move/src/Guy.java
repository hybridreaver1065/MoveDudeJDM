import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;

public class Guy extends JComponent {
	private Rectangle arm, armR, leg, legR, bodhi; 	
	private Ellipse2D.Double head;
	private int length = 10;
	
	private int dx = 0, dy= 0;

	public Guy(int x, int y) {
		
		
		head = new Ellipse2D.Double(2*length,0*length,1*length,1*length);
		
		bodhi = new Rectangle(1*length, 3*length);
		
		arm = new Rectangle(2*length, 1*length);
		armR = new Rectangle(2*length, 1*length);
		leg = new Rectangle(1*length, 2*length);
		legR = new Rectangle(1*length, 2*length);
		
		this.setLocation(x,y);
		this.setSize(5*length+1,6* length+1);
		
		arm.setLocation(0, length);
		armR.setLocation(3*length, length);
		leg.setLocation(1*length, 3*length);
		legR.setLocation(3* length, 3* length);
		
		bodhi.setLocation(2*length, length);
		
		
		
		
	}
	
	
	public void setdx(int x){
		dx =+ x;
	}
	
	public void setdy(int y) {
		dy =+ y;
	}
	
	public int getdy() {
		return dy;
	}
	
	public int getdx() {
		return dx;
	}
	
	public void update(){
		this.setLocation(getX() + dx, getY() + dy);
	}
		

	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		g2.fill(arm);
		g2.fill(armR);
		g2.fill(leg);
		g2.fill(legR);
		g2.fill(bodhi);
		g2.fill(head);
		}


	}

