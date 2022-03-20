package com.newlecture.game.item;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import com.newlecture.game.ui.GameCanvas2Fighter;

public class Fighter {
	
	public static final int move_up = 1;
	public static final int move_right = 2;
	public static final int move_down = 3;
	public static final int move_left = 4;

	private Image img;
	private double x;
	private double y;
	private double vx; // 움직이는 값. 애니메이션
	private double vy;
	private double dx; // 목적지
	private double dy;
	private int distance; // 이거 초기값1로해야함. 왜냐면 나눌거라서. 움직이는값나누는용도
	private int speed;

	public Fighter(int x, int y) {
		
		this.x = x;
		this.y = y;
		dx = dy = vx = vy = 0; // 이거 안써도 초기값0으로 자동세팅됨.
		distance = 1; // 꼭해줘야함
		speed = 2;
		img = Toolkit.getDefaultToolkit().getImage("res/image/fighter1.png");

	}

	//↓이거는 메인스레드에서 실행되는거임 / 메인에서 어디로 움직이라고 변수들 건들여줌.
	public void move(int x, int y) {
//		this.x = x;
//		this.y = y;
		
		//distance += 15; → 이거로 쓰면 멀던 가깝던 똑같은 시간내에 도착해서 속도가 다다름
		
		double w = (dx-this.x);
		double h = (dy-this.y);
		distance = (int) Math.sqrt(w*w+h*h); // 이거로 하면 속도가 똑같음.
		dx = x;
		dy = y;
		
		vx = (dx-this.x) / distance * speed; // 15대신 distance로 나눔
		vy = (dy-this.y) / distance * speed;
	}
	
	// 애니메이션으로 보이려면 밑에꺼 필수!! 
	// 함수작성하면 그게 메인스레드에서 움직이는건지 보조에서 움직이는건지 정확히 알고있어야함
	// ↓이거는 (게임스레드)보조스레드에서 실행되는거임. 스레드 만들어서 메인스레드 실행되면서 따로 또 실행되는거!!
	public void updates() {
		
		//↓조건보다 먼저 실행되어야함. 안그러면 전투기 가는게 한번 들가는거임(실행되는게 한번적어짐)
		x += vx;
		y += vy;

		if(distance <= 1) {
			vx = vy = 0;
			return; // 0이 되면 밑에꺼가 실행이 안되도록 이거 안쓰면 계속 distance깎임.
		}
		
		/*		
		x += vx;
		y += vy;
		*/
		
		distance -= speed;
	}
	
	// ↓repaint호출함으로써 이거도(게임스레드)보조스레드에서 실행되는거임.
	public void draw(Graphics g) {
		
		// GameCanvas2Fighter canvas = new GameCanvas2Fighter();
		GameCanvas2Fighter canvas = GameCanvas2Fighter.getInstance(); // 이거 새로 써줌. 보정할때
		int x = (int) this.x;
		int y = (int) this.y;
		
		int offx = img.getWidth(canvas)/2; // 전투기중심부로 보정하는거
		int offy = img.getHeight(canvas)/2;
		
		System.out.println(offx+", "+offy);
		
		//g.drawImage(img,x,y,null); // 여기서 this는 게임캔버스가 아님. null로 먼저 씀 
		g.drawImage(img, x-offx, y-offy, GameCanvas2Fighter.getInstance());
		g.drawRect(x, y, 64, 64); // 이미지그려지는구역확인하려고
	}


	public void moveBy(int direction) {
		switch(direction) {
		case move_left:
			x -= 2;
			break;
		case move_up:
			y -= 2;
			break;	
		case move_right:
			x += 2;
			break;
		case move_down:
			y += 2;
			break;				
		}
		
	}

}
