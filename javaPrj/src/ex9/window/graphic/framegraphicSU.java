package ex9.window.graphic;

import java.awt.Canvas;
import java.awt.Graphics;

import javax.swing.JFrame;

public class framegraphicSU {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		Canvas canvas = new GameCanvasSU();
		frame.add(canvas);
		// frame.setSize(?,?); // 사이즈조절 // 너비높이
		frame.setBounds(100,10,700,500); // 사이즈조절,x,y,너비,높이 / 위에꺼 플러스 위치까지조정
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 끄면 콘솔종료되는거
		frame.setVisible(true);
		
		// 캔버스에 그림그리기
		Graphics g = canvas.getGraphics(); // 그림그리는 도구불러오는거임
		g.drawLine(10, 10, 100, 100);
		
		// 위에꺼 그림 열심히 그린거 // 윈도우는 다시그려지는 환경임!
		// canvas.paint(g); setVisicle()/repaint() - update() - paint() 이런 루틴으로 
		// 그린거 지워지고 다시 그려짐
	}

}
