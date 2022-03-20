package game.ui;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GameCanvas extends Canvas {
	
	private Image img;
	private int fighterX;
	private int fighterY;
	
	public GameCanvas() {
		fighterX=200;
		fighterY=500;
		img=Toolkit.getDefaultToolkit().getImage("res/image/fighter1.png");
		
		this.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
				
				fighterX=x;
				fighterY=y;
				
				repaint();
			}
		});
		
		this.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				switch(e.getKeyCode()) {
				case 37:
					fighterX -=2;
					break;
				case 38:
					fighterY -=2;
					break;
				case 39:
					fighterX +=2;
					break;
				case 40:
					fighterY +=2;
					break;			
				}
				repaint();
			}
		
		});
	}
	
	public void paint(Graphics g) {
		g.drawImage(img, fighterX, fighterY, this);	
	}

}
