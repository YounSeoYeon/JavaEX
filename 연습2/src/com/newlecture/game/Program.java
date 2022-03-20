package com.newlecture.game;

import java.awt.Canvas;
import java.awt.Graphics;

import javax.swing.JFrame;

import com.newlecture.game.ui.GameCanvas;

public class Program {

	public static void main(String[] args) {
		
		JFrame win = new JFrame();
		win.setVisible(true);
		win.setSize(500, 700);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Canvas canvas = GameCanvas.getInstance();
		win.add(canvas);
		canvas.requestFocus();
	}

}
