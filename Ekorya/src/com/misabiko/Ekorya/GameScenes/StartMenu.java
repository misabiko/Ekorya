package com.misabiko.Ekorya.GameScenes;

import com.misabiko.Ekorya.Core.GameFrame;
import com.misabiko.Ekorya.Data.GeneralFinalData;
import com.misabiko.Ekorya.GUI.GUI;
import com.misabiko.Ekorya.GUI.Panel;
import com.misabiko.Ekorya.GameObjects.Background;
import com.misabiko.Ekorya.GameObjects.Interactables.Collidables.Grass;

public class StartMenu extends GameScene{
	private Panel gui;
	
	public StartMenu(GameFrame frame) {
		super(frame);
		
		gameObjs.add(new Background());

		for (int i = 0; i*GeneralFinalData.tileSize<GeneralFinalData.frameWidth ;i++) {
			gameObjs.add(new Grass(i*70,500));
		}
		
		GUI gui = new GUI("Foo",100,100,400,400);
		
	}
	
	protected void render() {
		super.render();
	}
}
