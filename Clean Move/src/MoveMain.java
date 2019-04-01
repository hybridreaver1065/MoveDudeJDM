import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Array;
import java.util.ArrayList;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.Timer;

public class MoveMain {

	public static void main(String[] args) {
		//
		
		
	 Guy moveBro = new Guy(0, 0);
	 
	
	 JFrame frame = new FrameMan();
	 
	 
	 frame.add(moveBro);
	System.out.print(frame.getWidth());
	System.out.print(frame.getHeight());
	ArrayList<Ball> balls = new ArrayList<Ball>();
	 
	 frame.addKeyListener(new KeyListener() {
		 
	
		  
		  
		  
		 public void keyPressed(KeyEvent e) {
			
		 if (e.getKeyCode() == KeyEvent.VK_RIGHT && moveBro.getLocation().getX() + moveBro.getdx() + moveBro.getWidth() < frame.getWidth()) {
			//if i am pressing right, make dx = 10
			 // if the guy shouldn't be allowed to move set dx = 0
			 moveBro.setdx(10);
			
			}
		
			else if (e.getKeyCode() == KeyEvent.VK_DOWN && moveBro.getLocation().getY() + moveBro.getHeight() + moveBro.getdy() < frame.getHeight()) {
				moveBro.setdy(10);
	
			}
		
			else if (e.getKeyCode() == KeyEvent.VK_UP && moveBro.getLocation().getY() +  moveBro.getdy() > 10) {
				moveBro.setdy(-10);
		
			}
			
			else if (e.getKeyCode() == KeyEvent.VK_LEFT && moveBro.getLocation().getX() + moveBro.getdx() > 10) {
				moveBro.setdx( -10);
			
			}
		 
		// if (e.getKeyCode() == KeyEvent.VK_1) {
				
		//	Ball ball = new Ball((int) (moveBro.getLocation().getX()),(int) (moveBro.getLocation().getY()), 10);
		//	balls.add(ball);
		//	frame.add(ball);
		//	System.out.print("1");
		//	}
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
				moveBro.setdx(0);
		
				}
			
				else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
					moveBro.setdy(0);
		
				}
			
				else if (e.getKeyCode() == KeyEvent.VK_UP) {
					moveBro.setdy(0);
			
				}
				
				else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
					moveBro.setdx( 0);
				
				}

		}
		
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			if (e.getKeyCode() == KeyEvent.VK_SPACE) {
				balls.add(new Ball());
			}
			
		}
	 
	 });
	 
	 Timer t1 = new Timer(100, new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if (moveBro.getLocation().getX() + moveBro.getdx() + moveBro.getWidth() > frame.getWidth()) {moveBro.setdx(0);}//right
			 	if (moveBro.getLocation().getY() + moveBro.getHeight() + 20 + moveBro.getdy() > frame.getHeight()){moveBro.setdy(0);}// down
				if(moveBro.getLocation().getY() +  moveBro.getdy() < 10) {moveBro.setdy(0);}//up
				if(moveBro.getLocation().getX() + moveBro.getdx() < 10) {moveBro.setdx(0);}// left
				//check to see if the guy should not be moving
				//if his dx is positive and he is at end of screen make dx = 0
				moveBro.update();
				for (int i = 0; balls.size() > i; i++) {
					balls.get(i).update();
				}
			
			}
		});
		
		t1.start();
	 
		//
	}
	
}
