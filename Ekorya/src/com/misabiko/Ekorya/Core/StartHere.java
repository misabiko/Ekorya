package com.misabiko.Ekorya.Core;

import javax.swing.JFrame;

import com.misabiko.Ekorya.Entities.Entities;
import com.misabiko.Ekorya.Player.Player;
import com.misabiko.Ekorya.World.Physic;

public class StartHere extends JFrame{
	
//	TODO Add comments EVERYWHERE
	private static final long serialVersionUID = 1L;
	public static JFrame frame = new JFrame("Bobventure");
	public static Display panel = new Display();
	public static KeyHandler h = new KeyHandler();
	public static final int WIDTH = 800;
	public static final int HEIGHT = 600;
	
	public static void main(String args[]) {
		start();
		run();
		
	}

	public static boolean running = false;

	public static void start() {
		running = true;
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setSize(WIDTH, HEIGHT);
		frame.add(panel);
		
		Player.spawn();
		
		frame.addKeyListener(h);
	}

	public static void run() {
		long lastTime = System.nanoTime();
		double nsPerTick = 1000000000D / 60D;

//		int renders = 0;
//		int updates = 0;

		long lastTimer = System.currentTimeMillis();
		double delta = 0;

		while (running) {
			long now = System.nanoTime();
			delta += (now - lastTime) / nsPerTick;
			lastTime = now;
			boolean shouldRender = false;

			while (delta >= 1) {
//				updates++;
				update();

				delta -= 1;
				shouldRender = true;
			}

			if (shouldRender) {
//				renders++;
				render();
			}

			if (System.currentTimeMillis() - lastTimer >= 1000) {
				lastTimer += 1000;
//				System.out.println(renders + ", " + updates);
//				renders = 0;
//				updates = 0;
			}

		}
	}

	public static void render() {
		panel.repaint();
	}

	public static void update() {
		for (Entities e : Entities.Ents) {
			Physic.accel(e, h);
			Physic.friction(e,h);
			Physic.movement(e);
			Physic.collisionCheck(e);
			
			
		}
		
	}
}
