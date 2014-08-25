package com.misabiko.Ekorya.GameObjects.Interactables.Collidables.Movables.Entities;

import com.misabiko.Ekorya.GameObjects.Interactables.Collidables.Movables.Movable;
import com.misabiko.Ekorya.Resources.Sprites.SpriteSheet;

public class Entity extends Movable{
	
	private double jumpStrength = 10;
	
	public Entity(int x, int y, SpriteSheet sheet, int spriteIndex) {
		super(x, y, sheet, spriteIndex);
	}
	
	protected void jump() {
		vY = -jumpStrength;
	}
	
	public void update() {
		super.update();
	}
}
