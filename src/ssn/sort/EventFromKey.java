package ssn.sort;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class EventFromKey extends JFrame{
	MyPanel mp = null;

	public static void main(String[] args) {
		
       EventFromKey efk = new EventFromKey();
	}
	//Constructor adding event listeners
	public EventFromKey(){
		mp = new MyPanel();
		
		this.add(mp);
		
		this.addKeyListener(mp);
		
		this.setSize(400, 300);
		this.setVisible(true);
	}

}

//Implements all events
class MyPanel extends JPanel implements KeyListener{
	int x =0;
	int y = 0;
	
	public void paint(Graphics g){
		super.paint(g);
		
		g.fillOval(x, y, 20, 20);
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}
		

	@Override
	public void keyPressed(KeyEvent e) {
		//System.out.println((char)e.getKeyCode());
		if(e.getKeyCode() == KeyEvent.VK_DOWN){
			y+= 2;
		}else if(e.getKeyCode() == KeyEvent.VK_UP){
			y -= 2;
		}else if(e.getKeyCode() == KeyEvent.VK_LEFT){
			x -= 2;
		}else if(e.getKeyCode() == KeyEvent.VK_RIGHT){
			x += 2;
		}
		
		this.repaint();
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
		
	}
	
	
}