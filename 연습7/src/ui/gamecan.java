package ui;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import item.Back;
import item.Button;
import item.Fighter;
import item.Mis;

public class gamecan extends Canvas implements Runnable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Fighter fighter;
	private Back back;
	private Mis[] mis;
	private Button button;
	private int misindex;
	private int mismax;
	private boolean isfire;
	private int direction;
	private Thread gameth;
	private int inter;

	private static gamecan instance;

	public static gamecan getinstance() {
		if (instance == null)
			instance = new gamecan();
		return instance;
	}

	private gamecan() {

		fighter = new Fighter(200, 500);
		back = new Back();
		direction = 0;
		mis = new Mis[30];
		misindex = 0;
		mismax = 30;
		isfire = false;
		inter = 0;
		button = new Button(400-50,600-50);

		this.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
				
				if(button.point(x,y)) {
					isfire = true;
					button.click(true);
					return;
					}

				fighter.move(x, y);
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
				
				if(button.point(x,y)) {
					isfire = false;
					button.click(false);
					return;
					}
			}
		});

		this.addMouseMotionListener(new MouseAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
				
				if(button.point(x,y))
					return;

				fighter.move(x, y);
			}
		});

		this.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				switch (e.getKeyCode()) {
				case KeyEvent.VK_UP:
					direction |= Fighter.UP;
					break;
				case KeyEvent.VK_RIGHT:
					direction |= Fighter.RIGHT;
					break;
				case KeyEvent.VK_DOWN:
					direction |= Fighter.DOWN;
					break;
				case KeyEvent.VK_LEFT:
					direction |= Fighter.LEFT;
					break;
				case KeyEvent.VK_SPACE:
					isfire = true;
					break;
				}
				fighter.moveby(direction);
			}

			@Override
			public void keyReleased(KeyEvent e) {
				switch (e.getKeyCode()) {
				case KeyEvent.VK_UP:
					direction &= ~Fighter.UP;
					break;
				case KeyEvent.VK_RIGHT:
					direction &= ~Fighter.RIGHT;
					break;
				case KeyEvent.VK_DOWN:
					direction &= ~Fighter.DOWN;
					break;
				case KeyEvent.VK_LEFT:
					direction &= ~Fighter.LEFT;
					break;
				case KeyEvent.VK_SPACE:
					isfire = false;
					break;
				}
				fighter.moveby(direction);
			}
		});

		gameth = new Thread(this);
		gameth.start();
	}

	@Override
	public void update(Graphics g) {
		paint(g);
	}

	@Override
	public void paint(Graphics g) {
		Image buf = createImage(getWidth(), getHeight());
		Graphics g2 = buf.getGraphics();
		back.draw(g2);
		fighter.draw(g2);
		for(int i=0; i<misindex; i++)
			mis[i].draw(g2);
		button.draw(g2);
		g.drawImage(buf, 0, 0, this);
	}

	@Override
	public void run() {
		while (true) {
			back.update();
			fighter.update();
			for(int i=0; i<misindex; i++)
				mis[i].update();
			
			//미사일갯수줄이기
			for(int i=0; i<misindex; i++)
				if(mis[i].getout()) {
					for(int j=0; j<misindex-i-1; j++) 
						mis[i+j] = mis[i+j+1];
						misindex--;
						break;
					}
			
			
			//미사일쏘기
			if(isfire) {
				if(inter == 0) {
				Mis missile = fighter.fire();
				
				if(misindex>mismax-1) {
					Mis[] temp = new Mis[misindex+mismax];
					for(int i=0; i<misindex; i++)
						temp[i] = mis[i];
					mis = temp;
					}
				
				mis[misindex]=missile;
				misindex++;
				}
				inter ++;
				inter %= 10;
				}
			
			repaint();

			System.out.println("스레드");
			System.out.printf("%d\n", misindex);
			
			try {
				Thread.sleep(1000 / 60);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
