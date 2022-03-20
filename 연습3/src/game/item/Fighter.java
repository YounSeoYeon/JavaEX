package game.item;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import game.ui.GameCanvas;

public class Fighter {

	private Image img;
	private int imgindex;
	private double x;
	private double y;
	private double dx;
	private double dy;
	private double vx;
	private double vy;
	private int distance;
	private int speed;
	private int dire;

	public final static int NONE = 0;
	public final static int UP = 0b0001;
	public final static int RIGHT = 0b0010;
	public final static int DOWN = 0b0100;
	public final static int LEFT = 0b1000;

	public Fighter(int x, int y) {
		this.x = x;
		this.y = y;
		distance = 1;
		speed = 5;
		dire = NONE;
		img = Toolkit.getDefaultToolkit().getImage("res/image/fighter.png");
		imgindex = 3;

	}

	public void draw(Graphics g) {

		GameCanvas can = GameCanvas.getinstance();
		int x = (int) this.x;
		int y = (int) this.y;
		int w = img.getWidth(can) / 7;
		int h = img.getHeight(can);
		int offx = w / 2;
		int offy = h / 2;
		int dx1 = x - offx;
		int dy1 = y - offy;
		int dx2 = x + w - offx;
		int dy2 = y + h - offy;
		int sx1 = w * imgindex;
		int sy1 = 0;
		int sx2 = w * imgindex + w;
		int sy2 = h;

		g.drawImage(img, dx1, dy1, dx2, dy2, sx1, sy1, sx2, sy2, can);
		g.drawRect(x, y, 64, 64);
	}

	public void move(int x, int y) {

		if ((this.x - speed < x && x < this.x + speed) && (this.y - speed < y && y < this.y + speed)) {
			return;
		}

		dx = x;
		dy = y;

		double w = (dx - this.x);
		double h = (dy - this.y);
		distance = (int) Math.sqrt(w * w + y * y);

		vx = w / distance* speed;
		vy = h / distance* speed;
	}

	public void moveby(int direction) {
		this.dire = direction;
	}

	public void update() {

		if ((dire & UP) == UP)
			y -= speed;
		if ((dire & RIGHT) == RIGHT)
			x += speed;
		if ((dire & DOWN) == DOWN)
			y += speed;
		if ((dire & LEFT) == LEFT)
			x -= speed;

		x += vx;
		y += vy;

		if ((dx - speed < x && x < dx + speed) && (dy - speed < y && y < dy + speed)) {
			vx = vy = 0;
			return;
		}

		distance -= speed;
	}

	public Missile fire() {
		return new Missile(x,y-32);
	}


	// draw , move , moveby

}
