package ssn.sort;

import java.awt.Graphics;
import java.awt.Panel;
import java.awt.Toolkit;

import javax.swing.JPanel;

public class Uroon {
  
}

class Mypanel extends JPanel {
	
	public void paint(Graphics g){
		super.paint(g);
		System.out.println("Paint has been taken");
		g.drawOval(10, 10, 40, 60);
		
		Image im=Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/image1.png"));
		g.drawimage(im, 90, 90, 200, 150, this);
	}
}
