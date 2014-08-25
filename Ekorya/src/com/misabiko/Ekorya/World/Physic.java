package com.misabiko.Ekorya.World;

import com.misabiko.Ekorya.GameObjects.Interactables.Collidables.Collidable;
import com.misabiko.Ekorya.GameObjects.Interactables.Collidables.Movables.Movable;

public class Physic {
	
	private static void gravity(Movable obj) {
		if (obj.vY + World.gravity > World.maxVY) {
			obj.vY = World.maxVY;
		}else {
		obj.vY += World.gravity;
		}
	}
	
	private static void checkCollision(Movable obj) {
		for (Collidable c : Collidable.Collidables) {
			if (obj.bottomDA.checkOverlapping(c.topDA)) {
				if (obj.rightDA.checkOverlapping(c.leftDA)) {
					
				}
				obj.vY = 0;
				obj.y = c.y-obj.height;
			}else if (obj.topDA.checkOverlapping(c.bottomDA)) {
				obj.vY = 0;
				obj.y = c.y2();
			}else if (obj.rightDA.checkOverlapping(c.leftDA)) {
				obj.x = c.x-obj.width;
			}else if (obj.leftDA.checkOverlapping(c.rightDA)) {
				obj.x = c.x2();
			}
			
//			else if (obj.bottomLeftDA.checkOverlapping(c.topRightDA)) {
//				obj.x = c.x2();
//			}else if (obj.bottomRightDA.checkOverlapping(c.topLeftDA)) {
//				obj.x = c.x-obj.width;
//			}else if (obj.topLeftDA.checkOverlapping(c.bottomRightDA)) {
//				obj.x = c.x2();
//			}else if (obj.topRightDA.checkOverlapping(c.bottomLeftDA)) {
//				obj.x = c.x-obj.width;
//			}
		}
	}
	
	public static void update(Movable obj) {
		gravity(obj);
		checkCollision(obj);
	}
}
