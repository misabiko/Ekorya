package com.misabiko.Ekorya.Entities;
import java.util.ArrayList;

import com.misabiko.Ekorya.World.World;

public class Entities {
	
	public int width;
	public int height;
	public int x;
	public int y;
	public double vX = 0;
	public double vY = 0;
	public double speedX = 5;
	
	public final int id;
	public static ArrayList<Entities> Ents = new ArrayList<Entities>();
	
	public Entities(int x,int y) {
		this.x = x;
		this.y = y;
		width = 66;
		height = 92;
		
		Ents.add(this);
		id = Ents.size();
	}
	
	public Entities(int x,int y, int w, int h) {
		this.x = x;
		this.y = y;
		width = w;
		height = h;
		
		Ents.add(this);
		id = Ents.size();
	}
	
	public static void spawn() {
		new Entities(100,100);
	}
	
	public int getFeet() {
		return y + height;
	}
	
	public int getId() {
		return id;
	}
	
	public boolean isJumping() {
		if (this.getFeet() == World.ground)
			return false;
		else
			return true;
	}
	
	public int getDirection() {
		if (vX < 0) {
			return 0; //Left
		}else if (vX > 0){
			return 1; //Right
		}else {
			return 2; //Front
		}
	}
}
