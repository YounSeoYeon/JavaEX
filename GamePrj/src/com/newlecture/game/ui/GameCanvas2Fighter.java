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
	private Thread gameThread; // 영사기에 해당하는 스레드하나를 만든거

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
				// repaint(); // 스레드에서 그리기!!
			}
		});
		
		//↓ 마우스드레그하면서 같이움직이는 이벤트
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

				// repaint(); // 스레드에서 그리기!
			}
		});

		// ↓게임스레드가 시작되는순간에 파이터가 있어야(메모리에 올라가 있어야) 게임이 실행되는데
		// ↓게임스레드가 파이터가없을때 먼저 시작하면 파이터가 null이 됨. 그래서 파이터 먼저 만들어 주고 게임스레드 시작해야함.
		gameThread = new Thread(this);
		gameThread.start();
	}
	
	
	
	
	// 익명클래스 사용한것
	// MouseAdapter() 이거는 인터페이스를 빈블럭으로 구현하고 있는 클래스임!
	// 자바에서 기본으로 제공하고 있는거

	@Override
	public void update(Graphics g) {
		// super.update(g);
		paint(g); // 이렇게만 하면 잔상남음
	}

	@Override
	public void paint(Graphics g) {
		// fighter.draw(g); // 잔상남음. 윈도우에 직접그리는거

		Image buf = createImage(getWidth(), getHeight());
		Graphics g2 = buf.getGraphics();

		fighter.draw(g2);
		g.drawImage(buf, 0, 0, this); // 잔상안남음. buf에 그려서 윈도우에 붙인것.
		// 그릴때마다 새로 붙임.
	}

	@Override
	public void run() {
		while (true) {

			fighter.updates();
			repaint();

			try {
				Thread.sleep(17); // 1초에 60번 // 1000/60
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("paint");
		}

	}

}
