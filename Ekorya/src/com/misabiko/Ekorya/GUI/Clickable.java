package com.misabiko.Ekorya.GUI;

import java.util.ArrayList;

import com.misabiko.Ekorya.Controls.MouseHandler;

public class Clickable {
	public static ArrayList<Clickable> Clickables = new ArrayList<Clickable>();
	public boolean visible = false;
	public boolean state = false;
	public boolean type;
	public int x;
	public int y;
	public int x2;
	public int y2;
	
	public Clickable(int x,int y, int x2, int y2) {
		Clickables.add(this);
		this.x = x;
		this.y = y;
		this.x2 = x2;
		this.y2 = y2;
	}
	
	public void update(MouseHandler h) {
		if (h.isInside(this)) {
			state = !state;
		}
	}
	
	public void action() {
		
	}
}
