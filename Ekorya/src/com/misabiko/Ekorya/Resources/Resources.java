package com.misabiko.Ekorya.Resources;

import java.awt.Color;
import java.awt.image.BufferedImage;

import com.misabiko.Ekorya.Resources.Sprites.Sprite;
import com.misabiko.Ekorya.Resources.Sprites.SpriteSheet;

public abstract class Resources {
	public static final String resPath = System.getProperty("user.dir")	+ "\\src\\com\\misabiko\\Ekorya\\Resources\\res\\";
	
	public static final BufferedImage bg = new Sprite("Kenney's Platformer Complete Pack\\Base pack\\bg").getImg(800, 600);
	
	public static final SpriteSheet tiles_spritesheet = new SpriteSheet("Kenney's Platformer Complete Pack\\Base pack\\Tiles\\tiles_spritesheet", ".xml");
	
	public static final SpriteSheet p1_spritesheet = new SpriteSheet("Kenney's Platformer Complete Pack\\Base pack\\Player\\p1_spritesheet", ".txt");
	
	public static final SpriteSheet p2_spritesheet = new SpriteSheet("Kenney's Platformer Complete Pack\\Base pack\\Player\\p2_spritesheet", ".txt");
	
	public static final SpriteSheet p3_spritesheet = new SpriteSheet("Kenney's Platformer Complete Pack\\Base pack\\Player\\p3_spritesheet", ".txt");
	
	public static final SpriteSheet items_spritesheet = new SpriteSheet("Kenney's Platformer Complete Pack\\Base pack\\Items\\items_spritesheet", ".xml");
	
	public static final SpriteSheet greySheet = new SpriteSheet("Kenney's UI Pack\\Spritesheet\\greySheet",".xml");
	
	public static final SpriteSheet blueSheet = new SpriteSheet("Kenney's UI Pack\\Spritesheet\\blueSheet",".xml");
	
	public static final SpriteSheet greenSheet = new SpriteSheet("Kenney's UI Pack\\Spritesheet\\greenSheet",".xml");
	
	public static final SpriteSheet redSheet = new SpriteSheet("Kenney's UI Pack\\Spritesheet\\redSheet",".xml");
	
	public static final SpriteSheet yellowSheet = new SpriteSheet("Kenney's UI Pack\\Spritesheet\\yellowSheet",".xml");
	
	public static final nFont kenvector_future_thin = new nFont("Kenney's UI Pack\\Font\\kenvector_future_thin");
	
	public static final nFont kenvector_future = new nFont("Kenney's UI Pack\\Font\\kenvector_future");
	
	public static final Color gray = new Color(160,160,160);
	
	public static final Color light_gray = new Color(211,211,211);
}
