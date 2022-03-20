package ex9.window.graphic;

import java.awt.Canvas;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class GameCanvasSU extends Canvas {

	
	Image img;
	int dy=0; // �������� �ȿ������� ���еǼ� ����� �ȵǼ� ������ ��
	
	/*
	int[] xs = new int[4];
	int[] ys = new int[4];
	int[] ws = new int[4];
	int[] hs = new int[4];
	*/
	
	Puzzle[] puzzles = new Puzzle[4]; // Puzzle�� x,y,width,height
	
	public GameCanvasSU() {
		// TODO Auto-generated constructor stub
		Toolkit tk = Toolkit.getDefaultToolkit(); // �̹��� �ҷ����°�
		img = tk.getImage("C:\\education\\workspace\\22.png");

		Puzzle puzzle = new Puzzle(); // ���� �迭�� �������.����ü ��������
		
		// ȭ�鿡 ����� ��ġ/ũ�� ������
		puzzle.x = 0;
		puzzle.y = 0;
		puzzle.width = 150;
		puzzle.height = 150; 
		
		// �̹����� ��ġ/ũ�� ������
		
		puzzle.sX = 0;
		puzzle.sY = 0;
		puzzle.sWidth = 150;
		puzzle.sHeight = 150; 
		
		puzzles[0] = puzzle;
		
		// ù������ ������� ��ġ�Ұ����� �����س��� 
		// �ؿ� �ִ°ź��� ���⽱�� ���������ϱⰡ ����
	
	} // �̹����� ���⼭ ������ �ؿ��� �������� �ε��ϴ°� �ƴ�
	//�׳� �̴�� �ִ°���
	
	
	// ĵ������ ����� ������
	// ���콺 Ŭ���ϸ� ������ ����Ǵ� �Լ� (mouseDown)
	public boolean mouseDown(Event evt, int x, int y) {
		// System.out.printf("(%d, %d)\n",x,y);
		
		// dy += 10; // ĵ������ �׸��� �ٽ� �׸��� �Լ� ��� �ٲ�� �����(�̴�θ� �ϸ� �׸�â �ٲ������ �ٲ������)
		
		if(150<=x && x<=300 && 0<=y && y<=150) // �ҽ��κ� Ŭ���Ҷ��� �����̵��� 
			dy += 150;
		repaint();
		
		return true;
	}
	
	
	public void paint(Graphics g) {
			
		g.drawLine(10, 10, 100, 100);
		// g.drawImage(img,0,0,this); // �������Ծ��°���. 
		// g.drawImage(img, 0, 0, 700, 500, this);
		
		/* g.drawImage(img,
				200,200,200+200,200+200,
				200,200,200+200,200+200,this);
				*/
		/* g.drawImage(img,
				0,0,500,200,
				0,dy,0+500,dy+200,this);
				*/
		
		// �ҽ�1 - 2���� ���÷���
		/*g.drawImage(img,
				150,dy,150+150,0+150,// ���÷��� ��ǥ
				0,0,0+150,0+150,this); // �ҽ� ��ǥ
		*/
		// �ҽ�2 - 3���� ���÷���
		/*g.drawImage(img,
				0,150,0+150,150+150,
				150,0,150+150,0+150,this);
		*/
		
		// for�� �̿��ؼ� ���÷����ϱ�

	}
	
}
