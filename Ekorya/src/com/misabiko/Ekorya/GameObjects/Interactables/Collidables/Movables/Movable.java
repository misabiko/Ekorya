package com.misabiko.Ekorya.GameObjects.Interactables.Collidables.Movables;

import com.misabiko.Ekorya.GameObjects.Interactables.Collidables.Collidable;
import com.misabiko.Ekorya.Resources.Sprites.SpriteSheet;

public class Movable extends Collidable{
	
	public double vX;
	public double vY;
	private double speed = 5;
	
	public Movable(int x, int y, SpriteSheet sheet, int spriteIndex) {
		super(x, y, sheet, spriteIndex);
	}
	
	protected void move() {
		x += vX;
		y += vY;
		
		topDA.move(			x+1,		y,			x2()-1,		y+10	);
		bottomDA.move(		x+1,		y2()-10,	x2()-1,		y2()	);
		leftDA.move(		x,			y+1,		x+10,		y2()-1	);
		rightDA.move(		x2()-10,	y+1,		x2(),		y2()-1	);
		
		topLeftDA.move(		x+5,		y+5,		x+10,		y+10	);
		topRightDA.move(	x2()-10,	y+5,		x2()-5,		y+10	);
		bottomLeftDA.move(	x+5,		y2()-10,	x+10,		y2()-5	);
		bottomRightDA.move(	x2()-10,	y2()-10,	x2()-5,		y2()-5	);
	}
	
	protected void accel(int direction) {
		switch (direction) {
		case 0:	//Up
			vY = speed;
			break;
		case 1:	//Right
			vX = speed;
			break;
		case 2:	//Down
			vY = -speed;
			break;
		case 3:	//Left
			vX = -speed;
			break;
		default:
			break;
		}
	}
	
	protected void stop(int axis) {
		switch (axis) {
		case 0:	//Y
			vY = 0;
			break;
		case 1: //X
			vX = 0;
			break;
		default:
			break;
		}
	}
	
	public void update() {
		move();
		
	}
}
