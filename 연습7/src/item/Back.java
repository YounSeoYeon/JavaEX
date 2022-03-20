package item;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import ui.gamecan;

public class Back {
	private int y1;
	private int y2;
	private Image img;
	private int w;
	private int h;
	
	public Back() {
		img = Toolkit.getDefaultToolkit().getImage("res/image/space.jpg");
		w = 500;
		h = 500*1200/360;
		y1 = -(h-700);
		y2 = y1-h;
	}

	public void draw(Graphics g) {	
		g.drawImage(img, 0, y2, w, h, gamecan.getinstance());
		g.drawImage(img, 0, y1, w, h, gamecan.getinstance());
	}

	public void update() {		
		y2++;
		y1++;
		
		if(y2>=700)
			y2 = -(h-700)-h;
		if(y1>=700)
			y1 = -(h-700)-h;
		
		System.out.printf("%d,%d\n",y2,y1);
	}
}
