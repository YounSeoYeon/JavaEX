package com.newlecture.game.ui;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import com.newlecture.game.item.Fighter;

public class GameCanvas extends Canvas {
	
	private Fighter fighter;
	private static GameCanvas instance;
	public static GameCanvas getInstance() {
		if(instance == null)
			instance = new GameCanvas();
		return instance;
	}

	private GameCanvas() {
		fighter = new Fighter(200,500);

		this.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
				
				fighter.move(x,y);
				repaint();
			}
		});

		this.addKeyListener(new KeyAdapter() {
			
			@Override
			public void keyPressed(KeyEvent e) {
				switch(e.getKeyCode()) {
				case KeyEvent.VK_LEFT:
					fighter.moveBy(Fighter.LEFT);
					break;
				case KeyEvent.VK_UP:
					fighter.moveBy(Fighter.UP);
					break;
				case KeyEvent.VK_RIGHT:
					fighter.moveBy(Fighter.RIGHT);
					break;
				case KeyEvent.VK_DOWN:
					fighter.moveBy(Fighter.DOWN);
					break;	
				}
				
				repaint();

			}
		});
	}
	
	@Override
	public void update(Graphics g) {
		paint(g); // 오버라이드후 호출안하면 paint로 안넘어감
	}

	@Override
	public void paint(Graphics g) {
		
		Image buf = createImage(getWidth(), getHeight());
		Graphics g2 = buf.getGraphics();
		fighter.draw(g2);
		
		g.drawImage(buf, 0, 0, this);
	}

}
