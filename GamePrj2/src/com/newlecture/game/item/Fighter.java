package com.newlecture.game.item;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import com.newlecture.game.ui.GameCanvas2Fighter;

public class Fighter {
	
	public static final int move_up = 1;
	public static final int move_right = 2;
	public static final int move_down = 4;
	public static final int move_left = 8;
	public static final int move_none=0;

	private Image img;
	private double x;
	private double y;
	private int imgIndexDuration; // 인덱스가 변화하는데 딜레이되는정도(자연스럽게 변화하도록)
	private double vx; // 움직이는 값. 애니메이션
	private double vy;
	private double dx; // 목적지
	private double dy;
	private int distance; // 이거 초기값1로해야함. 왜냐면 나눌거라서. 움직이는값나누는용도
	private int speed;
	private int direction;
	private int imgIndex;

	public Fighter(int x, int y) {
		
		this.x = x;
		this.y = y;
		dx = dy = vx = vy = 0; // 이거 안써도 초기값0으로 자동세팅됨.
		distance = 1; // 꼭해줘야함
		speed = 3;
		direction = move_none;
		img = Toolkit.getDefaultToolkit().getImage("res/image/fighter.png");
		imgIndex = 3;
		imgIndexDuration = 0;

	}

	//↓이거는 메인스레드에서 실행되는거임 / 메인에서 어디로 움직이라고 변수들 건들여줌.
	public void move(int x, int y) {
//		this.x = x;
//		this.y = y;
		
		//distance += 15; → 이거로 쓰면 멀던 가깝던 똑같은 시간내에 도착해서 속도가 다다름
		
		double w = (dx-this.x);
		double h = (dy-this.y);
		
		//distance가 0이 되는거 방지하기위해서
		if((this.x-speed<x && x<this.x+speed) &&
				(this.y-speed<y && y<this.y+speed))
			return;
		
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
		
		if((vx<0)||(direction & move_left) == move_left && imgIndex>0 && imgIndexDuration==0)
			imgIndex--;
		
		else if((vx>0)||(direction & move_right) == move_right && imgIndex<6 && imgIndexDuration==0)
			imgIndex++;
		
		else if(vx ==0 && direction==0)
			imgIndex = 3;
		
		imgIndexDuration ++;
		imgIndexDuration %= 5; // 0-1-2-3-4-0-1-2...(계속반복하게끔) 숫자 커질수록 인덱스 바뀌는속도 느림
		
		//버튼누르자마자 바로 움직이도록하게 이쪽에 옮김. 건들이자마자
		if((direction & move_left) == move_left)
			x -= speed;
		if((direction & move_up) == move_up)
			y -= speed;
		if((direction & move_right) == move_right)
			x += speed;		
		if((direction & move_down) == move_down)
			y += speed;
		
		System.out.println(Integer.toBinaryString(direction));
		
		//↓조건보다 먼저 실행되어야함. 안그러면 전투기 가는게 한번 들가는거임(실행되는게 한번적어짐)
		x += vx;
		y += vy;

		//if(distance <= 1) {
		
		//도착지에서 스피드박스 영역 안에 들어왔다면 벡터 0으로 만들어줌
		if((this.x-speed<x && x<this.x+speed) &&
				(this.y-speed<y && y<this.y+speed))		
		{
			vx = vy = 0;
			return; // 0이 되면 밑에꺼가 실행이 안되도록 이거 안쓰면 계속 distance깎임.
		}
		
		//distance -= speed;
	}
	
	// ↓repaint호출함으로써 이거도(게임스레드)보조스레드에서 실행되는거임.
	public void draw(Graphics g) {
		
		// GameCanvas2Fighter canvas = new GameCanvas2Fighter();
		GameCanvas2Fighter canvas = GameCanvas2Fighter.getInstance(); // 이거 새로 써줌. 보정할때
		int x = (int) this.x;
		int y = (int) this.y;
		
		int w = img.getWidth(canvas)/7; // 전투기중심부로 보정하는거
		int h = img.getHeight(canvas);
		
		int offx = w/2;
		int offy = h/2;
		
		int dx1 = x-offx;
		int dy1 = y-offy;
		int dx2 = dx1+w;
		int dy2 = dy1+h;
		
		int sx1 = 0+w*imgIndex;
		int sy1 = 0;
		int sx2 = sx1+w;
		int sy2 = sy1+h;
		
		System.out.println(offx+", "+offy);
		
		//g.drawImage(img,x,y,null); // 여기서 this는 게임캔버스가 아님. null로 먼저 씀 
		//g.drawImage(img, x-offx, y-offy, canvas);
		g.drawImage(img, 
				dx1,dy1,dx2,dy2, 
				sx1,sy1,sx2,sy2,
				canvas);
		g.drawRect(x-offx, y-offy, 64, 64); // 이미지그려지는구역확인하려고
	}
	
	public Missile fire() {
		return new Missile(x,y-32);
	}


	public void moveBy(int direction) {
		//direction에 move_up이 있나?
		this.direction=direction;
		}
		
	}

