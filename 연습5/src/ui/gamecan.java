package ui;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import item.Fig;

public class gamecan extends Canvas implements Runnable{
	
	private Fig fig;
	private int direction;
	private Thread sub;
	
	private static gamecan instance;
	public static gamecan getinstance() {
		if(instance == null)
			instance = new gamecan();
		return instance;
	}	
	
	public gamecan() {		
		
		fig = new Fig(200,500);
		direction = 0;
		
		this.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
				
				fig.move(x, y);
			}
		});
		
		this.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				switch(e.getKeyCode()) {
				case KeyEvent.VK_UP :
					direction |= Fig.UP;
					break;
				case KeyEvent.VK_RIGHT :
					direction |= Fig.RIGHT;
					break;
				case KeyEvent.VK_DOWN :
					direction |= Fig.DOWN;
					break;
				case KeyEvent.VK_LEFT :
					direction |= Fig.LEFT;
					break;
				}
				fig.moveby(direction);
				}
			
			@Override
			public void keyReleased(KeyEvent e) {
				switch(e.getKeyCode()) {
				case KeyEvent.VK_UP :
					direction &= ~Fig.UP;
					break;
				case KeyEvent.VK_RIGHT :
					direction &= ~Fig.RIGHT;
					break;
				case KeyEvent.VK_DOWN :
					direction &= ~Fig.DOWN;
					break;
				case KeyEvent.VK_LEFT :
					direction &= ~Fig.LEFT;
					break;
			}
				fig.moveby(direction);
			}});
		
		sub = new Thread(this);
		sub.start();
		
	}
		
	
	@Override
	public void update(Graphics g) {
		paint(g);
	}
	
	public void paint(Graphics g) {
		Image buf = createImage(getWidth(),getHeight());
		Graphics g2 = buf.getGraphics();		
		fig.draw(g2);		
		g.drawImage(buf, 0, 0, this);
	}

	@Override
	public void run() {
		while(true) {
		fig.update();
		repaint();
		
		try {
			Thread.sleep(1000/20);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

}
