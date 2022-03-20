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
import item.Fig;
import item.Item;
import item.Mis;

public class gamecan extends Canvas implements Runnable {

	
	private Item[] items;
	private Fig fig;
	private Back back;
	private Button button;
	private int itemind;
	private int itemmax;
	private boolean isfiring;
	private int inter;
	private int direction;
	private Thread sub;
	private static gamecan instance;

	public static gamecan getinstance() {
		if (instance == null)
			instance = new gamecan();
		return instance;
	}

	public gamecan() {
		
		itemind = 0;
		itemmax = 30;
		items = new Item[itemmax];
		fig = new Fig(200, 500);
		back = new Back();
		button = new Button(400-50,600-50);
		
		items[itemind++] = new Back();
		items[itemind++] = fig;
		items[itemind++] = button;
		direction = 0;
		isfiring = false;
		inter = 0;
		
		this.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mousePressed(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
				
				System.out.println(button.point(x, y));
				if(button.point(x,y)) {
					isfiring=true;
					button.press(true);
					return;
				}

				fig.move(x, y);
			}
			
			@Override
			public void mouseReleased(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
				
				if(button.point(x,y)) {
					isfiring=false;
					button.press(false);
					return;
				}

		}});
		

		this.addMouseMotionListener(new MouseAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
				if(button.point(x, y))
					return;

				fig.move(x, y);
			}
		});

		this.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				switch (e.getKeyCode()) {
				case KeyEvent.VK_UP:
					direction |= Fig.UP;
					break;
				case KeyEvent.VK_RIGHT:
					direction |= Fig.RIGHT;
					break;
				case KeyEvent.VK_DOWN:
					direction |= Fig.DOWN;
					break;
				case KeyEvent.VK_LEFT:
					direction |= Fig.LEFT;
					break;
				case KeyEvent.VK_SPACE:
					isfiring = true;					
					break;
				}
				fig.moveby(direction);
			}

			@Override
			public void keyReleased(KeyEvent e) {
				switch (e.getKeyCode()) {
				case KeyEvent.VK_UP:
					direction &= ~Fig.UP;
					break;
				case KeyEvent.VK_RIGHT:
					direction &= ~Fig.RIGHT;
					break;
				case KeyEvent.VK_DOWN:
					direction &= ~Fig.DOWN;
					break;
				case KeyEvent.VK_LEFT:
					direction &= ~Fig.LEFT;
					break;
				case KeyEvent.VK_SPACE:
					isfiring = false;
					break;
				}
				fig.moveby(direction);
			}
		});

		sub = new Thread(this);
		sub.start();
	}

	@Override
	public void update(Graphics g) {
		paint(g);
	}

	public void paint(Graphics g) {
		Image buf = createImage(getWidth(), getHeight());
		Graphics g2 = buf.getGraphics();
		
		for (int i = 0; i < itemind; i++)
			items[i].draw(g2);

		g.drawImage(buf, 0, 0, this);
	}

	@Override
	public void run() {
		while (true) {
			
			for(int i=0; i<itemind; i++) {
				items[i].update();
				if(items[i].indout()) {
					for(int j=0; j<itemind-i-1; j++)
						items[i+j]=items[i+j+1];
					itemind--;
					break;
				}
			}
			
			// 미사일쏨	
			if(isfiring) {
				if(inter == 0) {
				Item missile = fig.fire();
				if(itemind>itemmax-1) {
					Item[] temp = new Item[itemind+30];
					for(int i=0; i<itemind; i++)
						temp[i]=items[i];
					
					items=temp;
					
				}
				items[itemind] = missile;
				itemind++;
			}		

			System.out.printf("%d\n",itemind);
			inter++;
			inter%=5;
			}
			
			repaint();
			
			System.out.println("스레드");

			try {
				Thread.sleep(1000 / 60);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

