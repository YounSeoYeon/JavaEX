package item;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import ui.gamecan;

public class Back implements Item{
	private Image img;
	private int h;
	private int w;
	private double y1;
	private double y2;
	
	public Back() {
		img = Toolkit.getDefaultToolkit().getImage("res/image/space.jpg");
		w= 500;
		h= 500*1200/360;
		y1= -(h-700);
		y2= y1-h;
	}

	public void draw(Graphics g) {
		int y1 = (int)this.y1;
		int y2 = (int)this.y2;
		
		g.drawImage(img, 0, y2, w, h, gamecan.getinstance());
		g.drawImage(img, 0, y1, w, h, gamecan.getinstance());
	}

	public void update() {
		y2++;
		y1++;
		
		if(y1>=700)
			y1 = -(h-700)-h;
		if(y2>=700)
			y2 = -(h-700)-h;
	}

	@Override
	public boolean indout() {
		// TODO Auto-generated method stub
		return false;
	}

}
