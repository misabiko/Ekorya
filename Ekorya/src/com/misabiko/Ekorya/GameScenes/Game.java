package com.misabiko.Ekorya.GameScenes;

import com.misabiko.Ekorya.Controls.KeyHandler;
import com.misabiko.Ekorya.Core.GameFrame;
import com.misabiko.Ekorya.Data.GeneralFinalData;
import com.misabiko.Ekorya.GameObjects.Background;
import com.misabiko.Ekorya.GameObjects.GameObject;
import com.misabiko.Ekorya.GameObjects.Interactables.Collidables.Grass;
import com.misabiko.Ekorya.GameObjects.Interactables.Collidables.Movables.Movable;
import com.misabiko.Ekorya.GameObjects.Interactables.Collidables.Movables.Entities.Player.Player;
import com.misabiko.Ekorya.World.Physic;

public class Game extends GameScene{
	
	private KeyHandler h = new KeyHandler();
	
	public Game(GameFrame frame) {
		super(frame);
		frame.addKeyListener(h);
		gameObjs.add(new Background());

		for (int i = 0; i*GeneralFinalData.tileSize<GeneralFinalData.frameWidth ;i++) {
			gameObjs.add(new Grass(i*70,500));
		}
		
		gameObjs.add(new Grass(300,425));
		
		gameObjs.add(new Player(h, 100,100));
	}

	protected void update() {
		for (GameObject obj : gameObjs) {
			if (obj instanceof Movable) {
//				System.out.println("X: "+obj.x+" Y: "+obj.y);
				((Movable) obj).update();
				Physic.update((Movable) obj);
			}
		}
	}

}
