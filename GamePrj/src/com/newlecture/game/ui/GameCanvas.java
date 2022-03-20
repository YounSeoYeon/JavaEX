//package com.newlecture.game.ui;
//
//import java.awt.Canvas;
//import java.awt.Graphics;
//import java.awt.event.MouseAdapter;
//import java.awt.event.MouseEvent;
//
//import com.newlecture.game.item.Fighter;
//
//public class GameCanvas extends Canvas {
//	
//	// 여기까지 하면 그림그리는 기반을 만들어 놓은것임.
////	
////	private Image fighterImg;
////	private int fighterX;
////	private int fighterY;
//// ↓
//	private Fighter fighter;
//	
//	
//	public GameCanvas() {
//		
////		fighterX = 200;
////		fighterY = 500;
////		
////		fighterImg = Toolkit.getDefaultToolkit().getImage("res/image/fighter1.png");
//// ↓
//		fighter = new Fighter(200,500);
//		
//		this.addMouseListener(new MouseAdapter() {
//			public void mouseClicked(MouseEvent e) {
//				int x = e.getX();
//				int y = e.getY();
//				
////				fighterX = x;
////				fighterY = y;
////↓
//				
//				fighter.move(x,y);
//				
//				repaint();
//				}
//		});
//		
////		this.addKeyListener(new KeyAdapter() {
////			@Override
////			public void keyPressed(KeyEvent e) {
////				//System.out.println(e.getKeyCode());
////				
////				switch(e.getKeyCode()) {
////				case 37 : 
////					fighterX -=2;
////					break;
////				case 38 : 
////					fighterY -=2;
////					break;
////				case 39 : 
////					fighterX +=2;
////					break;
////				case 40 : 
////					fighterY +=2;
////					break;
////				}
////				
////				repaint();
////			}
////		});
//	
//	}
//			//익명클래스 사용한것
//			//MouseAdapter() 이거는 인터페이스를 빈블럭으로 구현하고 있는 클래스임! 
//			//자바에서 기본으로 제공하고 있는거 
//	
//	
//	// 위에꺼랑 밑에꺼 순차적으로 진행되는거 아님. 동시에 진행됨.
//	private static int index=0;
//	
//	@Override
//	public void paint(Graphics g) {
//		System.out.printf("%d : paint\n", ++index);
//		
//		//g.drawLine(0, 0, 100, 100);
////		g.drawImage(fighterImg,fighterX,fighterY,this); // this는 도화지임.캔버스. 
//		//여기 이미지가 호출될때마다 this에 통보를 함. 통보를 해줘야 이미지를 그려줌???
//		//페인트를 여러번 호출함. 동시에 진행되서??
//		//다 로드가 되었으면 옵저버에 통보 안해도 되서 null로 해도됨.
//// ↓
//		fighter.draw(g);
//	
//	
//	}
//	
//	// 여기에 있는 모든 this는 GameCanvas객체를 가리킴.
//
//}
