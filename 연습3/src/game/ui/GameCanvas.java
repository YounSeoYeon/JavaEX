package game.ui;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import game.item.Back;
import game.item.Button;
import game.item.Fighter;
import game.item.Missile;

public class GameCanvas extends Canvas implements Runnable {
	private Fighter fighter;
	private Back back;
	private Missile[] mis;
	private int misindex;
	private int mismax;
	private boolean isfiring;
	private Button button;
	private Thread gameth;
	private int direction;
	private int fireinterval;

	private static GameCanvas instance;

	public static GameCanvas getinstance() {
		if (instance == null)
			instance = new GameCanvas();
		return instance;
	}

	private GameCanvas() {

		fighter = new Fighter(200, 500);
		back = new Back();
		direction = 0;
		mis = new Missile[30];
		misindex = 0;
		mismax=30;
		button = new Button(400-50, 600-50);
		isfiring = false;
		fireinterval = 0;

		this.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mousePressed(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
								
				if(button.pointin(x,y)) {
					isfiring = true;
					button.press(true);
					return;
					}

				fighter.move(x, y);
			}
			
			@Override
			public void mouseReleased(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
								
				if(button.pointin(x,y)) {
					isfiring = false;
					button.press(false);
					return;
					}
			}
			
		});
			
			
		this.addMouseMotionListener(new MouseAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
				
				if(button.pointin(x,y))
					return;

				fighter.move(x, y);
			}
		});

		this.addKeyListener(new KeyAdapter() {

			@Override
			public void keyReleased(KeyEvent e) {
				switch (e.getKeyCode()) {
				case KeyEvent.VK_LEFT:
					direction &= ~Fighter.LEFT;
					break;
				case KeyEvent.VK_UP:
					direction &= ~Fighter.UP;
					break;
				case KeyEvent.VK_RIGHT:
					direction &= ~Fighter.RIGHT;
					break;
				case KeyEvent.VK_DOWN:
					direction &= ~Fighter.DOWN;
					break;
				case KeyEvent.VK_SPACE:
					isfiring = true;
					break;
				}
				fighter.moveby(direction);
			}

			@Override
			public void keyPressed(KeyEvent e) {
				switch (e.getKeyCode()) {
				case KeyEvent.VK_LEFT:
					direction |= Fighter.LEFT;
					break;
				case KeyEvent.VK_UP:
					direction |= Fighter.UP;
					break;
				case KeyEvent.VK_RIGHT:
					direction |= Fighter.RIGHT;
					break;
				case KeyEvent.VK_DOWN:
					direction |= Fighter.DOWN;
					break;
				case KeyEvent.VK_SPACE:
					isfiring = false;
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
		button.draw(g2);
		for (int i = 0; i < misindex; i++)
			mis[i].draw(g2);
		g.drawImage(buf, 0, 0, this);
	}

	@Override
	public void run() {
		while (true) {
			back.update();
			fighter.update();
			for (int i = 0; i < misindex; i++)
				mis[i].update();
			if (isfiring) {
				if(fireinterval == 0){
				Missile missile = fighter.fire();
				if(misindex>mismax-1) {
					Missile[] temp = new Missile[mismax+30];
					for(int i=0; i<misindex; i++)
					temp[i] = mis[i];
					
				mis = temp;	
				mismax += 30;
				}
					
				mis[misindex] = missile;
				misindex++;
				}
				
				fireinterval ++;
				fireinterval %= 10;
			}
			
			System.out.printf("%d\n", misindex);

			repaint();
			System.out.println("게임스레드");
			try {
				Thread.sleep(1000 / 60);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
