package ex9.window.graphic;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class gameCanvasEX1 extends Canvas {
	
	Image img;
	public gameCanvasEX1() {
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		img = tk.getImage("C:\\education\\workspace\\2.jpg");
		
	}
	
	public void paint(Graphics g) {
		
		g.drawImage(img, 0, 0, 700, 500, this);
	}
	
	


}
