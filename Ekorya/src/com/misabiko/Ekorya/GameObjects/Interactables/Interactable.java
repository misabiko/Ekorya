package com.misabiko.Ekorya.GameObjects.Interactables;

import com.misabiko.Ekorya.GameObjects.GameObject;
import com.misabiko.Ekorya.Resources.Sprites.SpriteSheet;

public class Interactable extends GameObject{

	public Interactable(int x, int y,SpriteSheet sheet, int spriteIndex) {
		super(x, y, sheet, spriteIndex);
	}
	
	protected boolean checkOverlapse(Interactable obj) {
		if ((x > obj.x && x < obj.x2()) || (x2() > obj.x && x2() > obj.x2())) {		//Xs overlaps
			if ((y > obj.y && y < obj.y2())||(y2() > obj.y && y2() < obj.y2())) {	//Ys overlaps
				return true;
			}
		}
		return false;
	}
}
