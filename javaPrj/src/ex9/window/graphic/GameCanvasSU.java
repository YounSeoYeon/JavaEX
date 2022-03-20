package ex9.window.graphic;

import java.awt.Canvas;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class GameCanvasSU extends Canvas {

	
	Image img;
	int dy=0; // 지역변수 안에있으면 구분되서 사용이 안되서 밖으로 뺌
	
	/*
	int[] xs = new int[4];
	int[] ys = new int[4];
	int[] ws = new int[4];
	int[] hs = new int[4];
	*/
	
	Puzzle[] puzzles = new Puzzle[4]; // Puzzle은 x,y,width,height
	
	public GameCanvasSU() {
		// TODO Auto-generated constructor stub
		Toolkit tk = Toolkit.getDefaultToolkit(); // 이미지 불러오는거
		img = tk.getImage("C:\\education\\workspace\\22.png");

		Puzzle puzzle = new Puzzle(); // 위에 배열만 만들어짐.퍼즐객체 만들어야함
		
		// 화면에 출력할 위치/크기 데이터
		puzzle.x = 0;
		puzzle.y = 0;
		puzzle.width = 150;
		puzzle.height = 150; 
		
		// 이미지의 위치/크기 데이터
		
		puzzle.sX = 0;
		puzzle.sY = 0;
		puzzle.sWidth = 150;
		puzzle.sHeight = 150; 
		
		puzzles[0] = puzzle;
		
		// 첫퍼즐이 어떤영역에 위치할것인지 정의해놓음 
		// 밑에 있는거보다 보기쉽고 퍼즐정리하기가 쉬움
	
	} // 이미지를 여기서 띄어놔서 밑에서 쓸때마다 로드하는거 아님
	//그냥 이대로 있는거임
	
	
	// 캔버스의 기능을 수정함
	// 마우스 클릭하면 저절로 실행되는 함수 (mouseDown)
	public boolean mouseDown(Event evt, int x, int y) {
		// System.out.printf("(%d, %d)\n",x,y);
		
		// dy += 10; // 캔버스에 그림을 다시 그리는 함수 써야 바뀐게 적용됨(이대로만 하면 그림창 바꿔야지만 바뀐거적용)
		
		if(150<=x && x<=300 && 0<=y && y<=150) // 소스부분 클릭할때만 움직이도록 
			dy += 150;
		repaint();
		
		return true;
	}
	
	
	public void paint(Graphics g) {
			
		g.drawLine(10, 10, 100, 100);
		// g.drawImage(img,0,0,this); // 인자적게쓰는거임. 
		// g.drawImage(img, 0, 0, 700, 500, this);
		
		/* g.drawImage(img,
				200,200,200+200,200+200,
				200,200,200+200,200+200,this);
				*/
		/* g.drawImage(img,
				0,0,500,200,
				0,dy,0+500,dy+200,this);
				*/
		
		// 소스1 - 2번에 디스플레이
		/*g.drawImage(img,
				150,dy,150+150,0+150,// 디스플레이 좌표
				0,0,0+150,0+150,this); // 소스 좌표
		*/
		// 소스2 - 3번에 디스플레이
		/*g.drawImage(img,
				0,150,0+150,150+150,
				150,0,150+150,0+150,this);
		*/
		
		// for문 이용해서 디스플레이하기

	}
	
}
