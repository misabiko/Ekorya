package com.misabiko.Ekorya.GameObjects.Interactables.Collidables;

import com.misabiko.Ekorya.Resources.Resources;

public class Grass extends Collidable{
	
	
	public Grass(int x, int y) {
		super(x,y,Resources.tiles_spritesheet,82);
	}
}
