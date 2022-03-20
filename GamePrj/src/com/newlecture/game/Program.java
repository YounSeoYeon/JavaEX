package com.newlecture.game;

import java.awt.Canvas;
import java.awt.Graphics;

import javax.swing.JFrame;

import com.newlecture.game.ui.GameCanvas2Fighter;

public class Program {

	public static void main(String[] args) {
		
		//1. JFrame 형식의 객체 win을 생성하고 
		// 화면출력을 위해 setvisible() 메소드에 true값을 넣어서 호출하시오

		JFrame win = new JFrame();
		win.setVisible(true);

		//2. win 객체의 초기상태가 맘에 안들어서 크기를 변경하는 setSize메소드를 통해서
		// 크기를 너비500, 높이 700으로 설정하자.
		// 닫기버튼을 누르면 바로 프로세스를 종료할수 있도록 setDefaultCloseOperation 메소드를 통해서
		// JFrame.EXIT_ON_CLOSE를 설정하자.
		
		win.setSize(500, 700);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		
		//3. Canvas 객체 canvas를 생성하고 그것을 win객체의 add()메소드를 통해서
		// win객체의 구성으로 포함시키자.
		
		//Canvas canvas = new Canvas();
		Canvas canvas = GameCanvas2Fighter.getInstance();
		win.add(canvas); // 프레임영역에 캔버스가 위로 붙은거임
		canvas.requestFocus(); // 이거해줘야 키보드로 바로 하는거 콘솔창에서 먹음.
		
		//4. canvas객체의 화면에 그림을 그리기 위해서 canvas의 getGraphics() 메소드를 통해서
		// 그림을 그리는 도구를 얻도록하자. 반환된 Graphics객체의 이름은 g로 하고 g객체의 drawLine() 메소드를
		// 통해서 (0,0)~(100,100) 위치의 선을 그리자
				
//		Graphics g = canvas.getGraphics(); // = 대입하다!! canvas.getGraphics()이 객체의 반환된 값을 g에 대입함.
//		g.drawLine(0, 0, 100, 100);
		
		//5. 왜 선이 보이지 않는걸까? 그 이유는 그림그리는 절차를 이해해야한다.
		//setVisible() -> update() -> paint(); // update는 화면을 지움
		//repaint() -> update() -> paint();
		//Min=>Max -> update() -> paint();
		//resize() -> update() -> paint();
		// .. 기타등등 -> update() -> paint();
		
		// 내가 그린그림이 안지워지고 계속 유지하고 싶을떄
		// paint() 메소드 안에서 그림을 그려야함.
		// ?? Canvas에 있는 paint 메소드??
		// -> Canvas 상속한 클래스에서 재정의하는 방식으로 paint메소드를 마련하고 거기에서 그림을 그리면 됨.
		
		//5. 그럼 paint메소드 오버라이드를 위해서 Canvas클래스를 is a 상속하는 GameCanvas를 정의하고 
		//3번 코드블록에서 Canvas객체를 생성하는 대신 GameCanvas 객체를 생성하시오.
		//GameCanvas에서 paint 메소드를 오버라이드하고 그 안에서 인자로 전달되는 g객체를 이용해서 
		//drawLine() 메소드로 선을 그리는 코드를 작성하시오.
		
		
		
	}

}
