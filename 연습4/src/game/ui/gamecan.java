package game.ui;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import game.item.Background;
import game.item.Firebutton;
import game.item.Missile;
import game.item.Plane;
import game.item.item;

public class gamecan extends Canvas implements Runnable {
	private Plane plane;
	private Firebutton firebutton;
	private int inter;
	private item[] items;
	private int itemindex;
	private int itemmax;
	private boolean isfiring;
	private Thread gamethread;
	private int direction;
	private static gamecan instance;

	public static gamecan getinstance() {
		if (instance == null)
			instance = new gamecan();
		return instance;
	}

	private gamecan() {
		plane = new Plane(200, 500);
		firebutton = new Firebutton(400 - 50, 600 - 50);
		inter = 0;
		itemmax = 30;
		items = new item[itemmax];
		itemindex = 0;
		
		items[itemindex++] = new Background();
		items[itemindex++] = plane;
		items[itemindex++] = firebutton;
		
		direction = 0;
		isfiring = false;

		this.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int x = getX();
				int y = getY();

				plane.move(x, y);
			}
		});

		this.addMouseMotionListener(new MouseAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				int x = getX();
				int y = getY();

				plane.move(x, y);
			}
		});

		this.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				switch (e.getKeyCode()) {
				case KeyEvent.VK_LEFT:
					direction |= Plane.LEFT;
					break;
				case KeyEvent.VK_UP:
					direction |= Plane.UP;
					break;
				case KeyEvent.VK_RIGHT:
					direction |= Plane.RIGHT;
					break;
				case KeyEvent.VK_DOWN:
					direction |= Plane.DOWN;
					break;
				case KeyEvent.VK_SPACE:
					isfiring = true;
					break;
				}

				plane.moveBy(direction);
			}

			@Override
			public void keyReleased(KeyEvent e) {
				switch (e.getKeyCode()) {
				case KeyEvent.VK_LEFT:
					direction &= ~Plane.LEFT;
					break;
				case KeyEvent.VK_UP:
					direction &= ~Plane.UP;
					break;
				case KeyEvent.VK_RIGHT:
					direction &= ~Plane.RIGHT;
					break;
				case KeyEvent.VK_DOWN:
					direction &= ~Plane.DOWN;
					break;
				case KeyEvent.VK_SPACE:
					isfiring = false;
					break;
				}
				plane.moveBy(direction);
			}
		});

		gamethread = new Thread(this);
		gamethread.start();

	}

	@Override
	public void update(Graphics g) {
		paint(g);
	}

	@Override
	public void paint(Graphics g) {
		Image buf = createImage(getWidth(), getHeight());
		Graphics g2 = buf.getGraphics();

		for (int i = 0; i < itemindex; i++)
			items[i].draw(g2);

		g.drawImage(buf, 0, 0, this);
	}

	@Override
	public void run() {
		while (true) {
			
			// 아이템공간부족시 늘리기
			if (itemindex > itemmax - 1) {
				item[] temp = new item[itemmax + 30];
				
				for (int i = 0; i < itemindex; i++) 
					temp[i] = items[i];
				
				items = temp;
				itemmax += 30;
			}
			
			// 돌면서 업데이트 뿐만이 아니라 아이템 제거까지 같이
			for (int i = 0; i < itemindex; i++) {
				items[i].update();			
				
				// 영역 벗어난 아이템 제거
				if (items[i].outsideOfBounds()) {
					for (int j = 0; j < itemindex - i - 1; j++)
						items[i + j] = items[i + j + 1];
					itemindex--;
					i--;
				}
			}
			// 미사일발사
			if (isfiring) {
				if (inter == 0) {
					Missile missile = plane.fire();
					items[itemindex] = missile;
					itemindex++;
				}
				inter++;
				inter %= 5;
			}
				
			firebutton.update();
			
			System.out.printf("%d\n", itemindex);
			repaint();
			
			try {
				Thread.sleep(1000/60);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
