package game.item;

import java.awt.Graphics;

public interface item {
	void draw(Graphics g);
	void update();
	boolean outsideOfBounds();

}
