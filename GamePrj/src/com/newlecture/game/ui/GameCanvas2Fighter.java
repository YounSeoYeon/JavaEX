package com.newlecture.game.ui;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import com.newlecture.game.item.Fighter;

public class GameCanvas2Fighter extends Canvas implements Runnable {

	private Fighter fighter;
	private static GameCanvas2Fighter instance;
	private Thread gameThread; // ����⿡ �ش��ϴ� �������ϳ��� �����

	public static GameCanvas2Fighter getInstance() {
		if (instance == null)
			instance = new GameCanvas2Fighter();

		return instance;
	}

	private GameCanvas2Fighter() {

		fighter = new Fighter(200, 500);

		this.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
				fighter.move(x, y);
				// repaint(); // �����忡�� �׸���!!
			}
		});
		
		//�� ���콺�巹���ϸ鼭 ���̿����̴� �̺�Ʈ
		this.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
				fighter.move(x, y);
			}
		});
		
		
		

		this.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				switch (e.getKeyCode()) {
				case KeyEvent.VK_LEFT:
					// fighterX -=2;
					fighter.moveBy(Fighter.move_left);
					break;
				case KeyEvent.VK_UP:
					fighter.moveBy(Fighter.move_up);
					break;
				case KeyEvent.VK_RIGHT:
					fighter.moveBy(Fighter.move_right);
					break;
				case KeyEvent.VK_DOWN:
					fighter.moveBy(Fighter.move_down);
					break;
				}

				// repaint(); // �����忡�� �׸���!
			}
		});

		// ����ӽ����尡 ���۵Ǵ¼����� �����Ͱ� �־��(�޸𸮿� �ö� �־��) ������ ����Ǵµ�
		// ����ӽ����尡 �����Ͱ������� ���� �����ϸ� �����Ͱ� null�� ��. �׷��� ������ ���� ����� �ְ� ���ӽ����� �����ؾ���.
		gameThread = new Thread(this);
		gameThread.start();
	}
	
	
	
	
	// �͸�Ŭ���� ����Ѱ�
	// MouseAdapter() �̰Ŵ� �������̽��� ������� �����ϰ� �ִ� Ŭ������!
	// �ڹٿ��� �⺻���� �����ϰ� �ִ°�

	@Override
	public void update(Graphics g) {
		// super.update(g);
		paint(g); // �̷��Ը� �ϸ� �ܻ���
	}

	@Override
	public void paint(Graphics g) {
		// fighter.draw(g); // �ܻ���. �����쿡 �����׸��°�

		Image buf = createImage(getWidth(), getHeight());
		Graphics g2 = buf.getGraphics();

		fighter.draw(g2);
		g.drawImage(buf, 0, 0, this); // �ܻ�ȳ���. buf�� �׷��� �����쿡 ���ΰ�.
		// �׸������� ���� ����.
	}

	@Override
	public void run() {
		while (true) {

			fighter.updates();
			repaint();

			try {
				Thread.sleep(17); // 1�ʿ� 60�� // 1000/60
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("paint");
		}

	}

}
