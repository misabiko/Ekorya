package com.misabiko.Ekorya.Player;

import com.misabiko.Ekorya.Entities.Entities;

public class Player extends Entities{
	
	public Player() {
		super(100,100);
	}
	
	public static void spawn() {
		new Player();
	}
}
