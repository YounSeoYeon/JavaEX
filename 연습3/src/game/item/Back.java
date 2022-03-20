package game.item;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import game.ui.GameCanvas;

public class Back {
	
	private double y1;
	private double y2;
	private int w;
	private int h;
	private Image img;
	private int speed;
	
	public Back() {
		img = Toolkit.getDefaultToolkit().getImage("res/image/space.jpg");
		speed = 1;
		w= 500;
		h= 500*1200/360;

		y1= -(h-700);
		y2=  y1-h; // 이게먼저시작
	}

	public void draw(Graphics g) {
		int y1 = (int) this.y1;
		int y2 = (int) this.y2;
		
		g.drawImage(img, 0, y2, w, h, GameCanvas.getinstance());
		g.drawImage(img, 0, y1, w, h, GameCanvas.getinstance());
	}

	public void update() {
		y1++;
		y2++;
		
		if(y1>=700)
			y1 = -(h-700)-h;
		if(y2>=700)
			y2 = -(h-700)-h;
	}

}
