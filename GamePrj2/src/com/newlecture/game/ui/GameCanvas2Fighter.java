package com.newlecture.game.ui;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import com.newlecture.game.item.Background;
import com.newlecture.game.item.Fighter;
import com.newlecture.game.item.FireButton;
import com.newlecture.game.item.Missile;

public class GameCanvas2Fighter extends Canvas implements Runnable {

	private Fighter fighter;
	private Background background;
	private FireButton firebutton;
	private Missile[] missiles;
	private int missileIndex;
	

	private static GameCanvas2Fighter instance;
	private Thread gameThread; // 영사기에 해당하는 스레드하나를 만든거
	private int direction;

	public static GameCanvas2Fighter getInstance() {
		if (instance == null)
			instance = new GameCanvas2Fighter();

		return instance;
	}

	private GameCanvas2Fighter() {

		direction = 0;
		fighter = new Fighter(200, 500);
		background = new Background();
		firebutton = new FireButton(400-50, 600-50);
		missiles = new Missile[30];
		missileIndex = 0;
		
		this.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
				fighter.move(x, y);
				// repaint(); // 스레드에서 그리기!!
			}
		});

		// ↓ 마우스드레그하면서 같이움직이는 이벤트
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
					// direction += Fighter.move_left; 이렇게 쓰면 밑에꺼랑 연산결과가 다름
					direction |= Fighter.move_left;
					break;
				// 디렉션에 방향을 더하는거임. 8방향으로 가려고
				case KeyEvent.VK_UP:
					direction |= Fighter.move_up;
					break;
				case KeyEvent.VK_RIGHT:
					direction |= Fighter.move_right;
					break;
				case KeyEvent.VK_DOWN:
					direction |= Fighter.move_down;
					break;
				}

				// repaint(); // 스레드에서 그리기!
				fighter.moveBy(direction);
			}

			// 키보드 떼면 그방향으로 움직이는거 멈추는거
			@Override
			public void keyReleased(KeyEvent e) {
				switch (e.getKeyCode()) {
				case KeyEvent.VK_LEFT:
					// 키보드떼면 그 방향으로 가던거 멈춘방향으로 가도록 비트연산자를 빼줘야함
					// direction -= Fighter.move_left;
					direction &= ~Fighter.move_left;
					break;
				case KeyEvent.VK_UP:
					direction &= ~Fighter.move_up;
					break;
				case KeyEvent.VK_RIGHT:
					direction &= ~Fighter.move_right;
					break;
				case KeyEvent.VK_DOWN:
					direction &= ~Fighter.move_down;
					break;
				case KeyEvent.VK_SPACE:
					Missile missile= fighter.fire();
					missiles[missileIndex] = missile;
					missileIndex++;
					
					break;
				}
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

		background.draw(g2); // 배경을 먼저 그리고 전투기를 그려야 전투기가 안없어짐 순서 중요
		firebutton.draw(g2);
		fighter.draw(g2);
		for(int i=0; i<missileIndex; i++)
			missiles[i].draw(g2);

		g.drawImage(buf, 0, 0, this); // 잔상안남음. buf에 그려서 윈도우에 붙인것.
		// 그릴때마다 새로 붙임.
	}

	@Override
	public void run() {
		while (true) {

			fighter.updates();
			background.update();
			for(int i=0; i<missileIndex; i++)
				missiles[i].update();
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
