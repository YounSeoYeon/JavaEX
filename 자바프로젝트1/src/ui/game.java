package ui;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import item.Back;
import item.Dog;
import item.Pat;

public class game extends Canvas implements Runnable {

	private static game instance;

	public static game getinstance() {
		if (instance == null)
			instance = new game();
		return instance;
	}

	private Thread th;
	private Pat[] pat;
	private int max;
	private int patidx;
	private int inter;
	private Back back;
	private Dog dog;

	private game() {

		back = new Back();
		pat = new Pat[30];
		dog = new Dog();
		max = 30;
		patidx = 0;
		inter = 0;

		th = new Thread(this);
		th.start();
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
		for (int i = 0; i < patidx; i++) {
			pat[i].draw(g2);
		}

		g.drawImage(buf, 0, 0, this);
	}

	@Override
	public void run() {
		while (true) {
			back.update();
			// °´Ã¼¿òÁ÷ÀÓ
			for (int i = 0; i < patidx; i++)
				pat[i].update();

			// °´Ã¼»ç¶óÁü
			for (int i = 0; i < patidx; i++) {
				if (pat[i].getout()) {
					for (int j = 0; j < patidx - i - 1; j++)
						pat[i + j] = pat[i + j + 1];
					patidx--;
					break;
				}
			}

			// °´Ã¼»ý±è
			if (inter == 0) {
				Pat pt = new Pat();
				if (patidx > max - 1) {
					Pat[] t = new Pat[patidx + max];
					for (int i = 0; i < patidx; i++)
						t[i] = pat[i];
					pat = t;
				}
				pat[patidx] = pt;
				patidx++;
			}
			inter++;
			inter %= 20;

			System.out.printf("%d,½º·¹µå\n", patidx);
			repaint();

			try {
				Thread.sleep(1000 / 60);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
