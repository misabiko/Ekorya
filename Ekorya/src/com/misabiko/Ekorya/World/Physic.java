package com.misabiko.Ekorya.World;
import com.misabiko.Ekorya.Core.KeyHandler;
import com.misabiko.Ekorya.Entities.Entities;

public class Physic {

	public static void friction(Entities e, KeyHandler k) { //
		e.vY += World.gravity;
		if (k.aIsHeld == k.dIsHeld) {
			if (!e.isJumping())
				e.vX = 0;
			else {
				if (e.vX > 0)
					e.vX = e.speedX/1.25;
				else if (e.vX < 0)
					e.vX = -e.speedX/1.25;
			}
		}
	}

	public static void accel(Entities e, KeyHandler k) {
		if (!(k.aIsHeld && k.dIsHeld)) {
			if (k.aIsHeld && !e.isJumping()) {
				e.vX = -e.speedX;
			} else if (k.aIsHeld && e.vX >= 0) {
				e.vX = -e.speedX / 2;
			}

			if (k.dIsHeld && !e.isJumping()) {
				e.vX = e.speedX;
			} else if (k.dIsHeld && e.vX <= 0) {
				e.vX = e.speedX / 2;
			}
		}
	}

	public static void movement(Entities e) {
		e.x += e.vX;
		e.y += e.vY;
	}

	public static void collisionCheck(Entities e) {
		if (e.getFeet() > World.ground) {
			// e.vY = 3-e.vY; //For bouncy floor
			e.vY = 0;
			e.y = World.ground - e.height;
		}
	}
}
