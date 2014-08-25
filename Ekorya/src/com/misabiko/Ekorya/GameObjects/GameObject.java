package com.misabiko.Ekorya.GameObjects;

import java.awt.image.BufferedImage;

import com.misabiko.Ekorya.Resources.Sprites.SpriteSheet;

public abstract class GameObject {
	
	public boolean visible = true;
	public BufferedImage sprite;
	public int x, y, width, height;
	public GameObject(int x, int y,SpriteSheet sheet, int spriteIndex) {
		this.x = x;
		this.y = y;
		sprite = sheet.sprites[spriteIndex];
		this.width = sheet.sprites[spriteIndex].getWidth();
		this.height = sheet.sprites[spriteIndex].getHeight();
	}
	
	public GameObject(int x, int y,BufferedImage sprite) {
		this.x = x;
		this.y = y;
		this.sprite = sprite;
		this.width = sprite.getWidth();
		this.height = sprite.getHeight();
	}
	
	public int x2() {
		return x + width;
	}
	
	public int y2() {
		return y + height;
	}
}
