package game;

import java.awt.Canvas;
import java.awt.Graphics;

import javax.swing.JFrame;

import game.ui.GameCanvas;

public class project {

	public static void main(String[] args) {
		
		// 1. JFrame 형식의 객체 win을 생성하고
		// 화면출력을 위해 setvisible() 메소드에 true값을 넣어서 호출하시오.
		
		// 2. win 객체의 초기상태가 맘에 안들어서 크기를 변경하는 setSize메소드를 통해서
		// 크기를 너비500, 높이 700으로 설정하자.
		// 닫기버튼을 누르면 바로 프로세스를 종료할수 있도록 setDefaultCloseOperation 메소드를 통해서
		// JFrame.EXIT_ON_CLOSE를 설정하자.
		// 3. Canvas 객체 canvas를 생성하고 그것을 win객체의 add()메소드를 통해서 win객체의 구성으로 포함시키자.
		// 4. canvas객체의 화면에 그림을 그리기 위해서 canvas의 getGraphics() 메소드를 통해서
		// 그림을 그리는 도구를 얻도록하자. 반환된 Graphics객체의 이름은 g로 하고 g객체의 drawLine() 메소드를
		// 통해서 (0,0)~(100,100) 위치의 선을 그리자
		// 5. 그럼 paint메소드 오버라이드를 위해서 Canvas클래스를 is a 상속하는 GameCanvas를 정의하고
		// 3번 코드블록에서 Canvas객체를 생성하는 대신 GameCanvas 객체를 생성하시오.
		// GameCanvas에서 paint 메소드를 오버라이드하고 그 안에서 인자로 전달되는 g객체를 이용해서
		// drawLine() 메소드로 선을 그리는 코드를 작성하시오.
		
		JFrame win = new JFrame();
		win.setVisible(true);
		win.setSize(500, 700);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Canvas canvas = new GameCanvas();
		win.add(canvas);
		Graphics g = canvas.getGraphics();
		g.drawLine(0, 0, 100, 100);
		
		

				

	}

}
