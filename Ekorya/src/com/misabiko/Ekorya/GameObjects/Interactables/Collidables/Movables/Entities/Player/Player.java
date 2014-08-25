package com.misabiko.Ekorya.GameObjects.Interactables.Collidables.Movables.Entities.Player;

import com.misabiko.Ekorya.Controls.KeyHandler;
import com.misabiko.Ekorya.GameObjects.Interactables.Collidables.Movables.Entities.Entity;
import com.misabiko.Ekorya.Resources.Resources;

public class Player extends Entity{
	
	private KeyHandler h;
	
	public Player(KeyHandler h, int x,int y) {	//TODO Find way to choose spritesheet
		super(x,y,Resources.p1_spritesheet, 1);
		this.h = h;
	}
	
	public void update() {
		if (h.aIsHeld && h.dIsHeld) {
			stop(1);
		}else if (h.dIsHeld) {
			accel(1);
		}else if (h.aIsHeld) {
			accel(3);
		}else {
			stop(1);
		}
		
		if (h.spaceTyped) {
			jump();
			h.spaceTyped = false;
		}
		
		super.update();
	}
}
