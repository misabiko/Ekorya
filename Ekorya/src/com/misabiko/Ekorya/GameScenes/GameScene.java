package com.misabiko.Ekorya.GameScenes;

import java.util.ArrayList;

import com.misabiko.Ekorya.Core.GameFrame;
import com.misabiko.Ekorya.Core.GamePanel;
import com.misabiko.Ekorya.GameObjects.GameObject;
import com.misabiko.Ekorya.GameObjects.Interactables.Collidables.Collidable;
import com.misabiko.Ekorya.World.Physic;

public abstract class GameScene {
	protected boolean running;
	protected GamePanel panel;
	public ArrayList<GameObject> gameObjs = new ArrayList<GameObject>();
	
	public GameScene(GameFrame frame) {
		panel = new GamePanel(this);
		
		frame.add(panel);
	}
	
	public void init() {
		running = true;
	}
	
	protected void stop() {
		running = false;
	}
	
	public void run() {
		long lastTime = System.nanoTime();
		double nsPerTick = 1000000000D / 60D;

		// int renders = 0;
		// int updates = 0;

		long lastTimer = System.currentTimeMillis();
		double delta = 0;

		while (running) {
			long now = System.nanoTime();
			delta += (now - lastTime) / nsPerTick;
			lastTime = now;
			boolean shouldRender = false;

			while (delta >= 1) {
				// updates++;
				update();

				delta -= 1;
				shouldRender = true;
			}

			if (shouldRender) {
				// renders++;
				render();
			}

			if (System.currentTimeMillis() - lastTimer >= 1000) {
				lastTimer += 1000;
				// System.out.println(renders + ", " + updates);
				// renders = 0;
				// updates = 0;
			}

		}
	}

	protected void render() {
		panel.repaint();
	}

	protected void update() {
		
	}
}
