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
//	// ������� �ϸ� �׸��׸��� ����� ����� ��������.
////	
////	private Image fighterImg;
////	private int fighterX;
////	private int fighterY;
//// ��
//	private Fighter fighter;
//	
//	
//	public GameCanvas() {
//		
////		fighterX = 200;
////		fighterY = 500;
////		
////		fighterImg = Toolkit.getDefaultToolkit().getImage("res/image/fighter1.png");
//// ��
//		fighter = new Fighter(200,500);
//		
//		this.addMouseListener(new MouseAdapter() {
//			public void mouseClicked(MouseEvent e) {
//				int x = e.getX();
//				int y = e.getY();
//				
////				fighterX = x;
////				fighterY = y;
////��
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
//			//�͸�Ŭ���� ����Ѱ�
//			//MouseAdapter() �̰Ŵ� �������̽��� ������� �����ϰ� �ִ� Ŭ������! 
//			//�ڹٿ��� �⺻���� �����ϰ� �ִ°� 
//	
//	
//	// �������� �ؿ��� ���������� ����Ǵ°� �ƴ�. ���ÿ� �����.
//	private static int index=0;
//	
//	@Override
//	public void paint(Graphics g) {
//		System.out.printf("%d : paint\n", ++index);
//		
//		//g.drawLine(0, 0, 100, 100);
////		g.drawImage(fighterImg,fighterX,fighterY,this); // this�� ��ȭ����.ĵ����. 
//		//���� �̹����� ȣ��ɶ����� this�� �뺸�� ��. �뺸�� ����� �̹����� �׷���???
//		//����Ʈ�� ������ ȣ����. ���ÿ� ����Ǽ�??
//		//�� �ε尡 �Ǿ����� �������� �뺸 ���ص� �Ǽ� null�� �ص���.
//// ��
//		fighter.draw(g);
//	
//	
//	}
//	
//	// ���⿡ �ִ� ��� this�� GameCanvas��ü�� ����Ŵ.
//
//}
