package com.misabiko.Ekorya.GameObjects.Interactables.Collidables;

import java.util.ArrayList;

import com.misabiko.Ekorya.GameObjects.Interactables.Interactable;
import com.misabiko.Ekorya.Resources.Sprites.SpriteSheet;

public class Collidable extends Interactable{
	
	public static ArrayList<Collidable> Collidables = new ArrayList<Collidable>();
	public static boolean DetectionAreaVisible = true;
	
	public DetectionArea topDA,bottomDA,leftDA,rightDA
	,topLeftDA,topRightDA,bottomLeftDA,bottomRightDA
	;
	
	public Collidable(int x, int y,SpriteSheet sheet, int spriteIndex) {
		super(x, y, sheet, spriteIndex);
		Collidables.add(this);
		
		topDA = new DetectionArea(			x+1,		y,			x2()-1,		y+10	);
		bottomDA = new DetectionArea(		x+1,		y2()-10,	x2()-1,		y2()	);
		leftDA = new DetectionArea(			x,			y+1,		x+10,		y2()-1	);
		rightDA = new DetectionArea(		x2()-10,	y+1,		x2(),		y2()-1	);
		
		topLeftDA = new DetectionArea(		x+5,		y+5,		x+10,		y+10	);
		topRightDA = new DetectionArea(		x2()-10,	y+5,		x2()-5,		y+10	);
		bottomLeftDA = new DetectionArea(	x+5,		y2()-10,	x+10,		y2()-5	);
		bottomRightDA = new DetectionArea(	x2()-10,	y2()-10,	x2()-5,		y2()-5	);
	}
}
