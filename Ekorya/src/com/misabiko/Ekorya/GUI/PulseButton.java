package com.misabiko.Ekorya.GUI;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import com.misabiko.Ekorya.Controls.MouseHandler;
import com.misabiko.Ekorya.Resources.Sprites.SpriteSheet;

public class PulseButton extends Button{
	
	public int frameSkip;
	public int skipIndex = 0;
	
	public PulseButton(SpriteSheet img, int spriteIndex, int frameSkip, int x, int y, int width, int height, BufferedImage icon) {
		super(img, spriteIndex, x, y, width, height,icon);
		
		this.frameSkip = frameSkip;
	}
	
	public PulseButton(SpriteSheet img, int spriteIndex, int frameSkip, int x, int y, int width, int height) {
		this(img, spriteIndex, frameSkip,x, y, width, height,null);
	}
	
	public PulseButton(SpriteSheet img, int spriteIndex, int frameSkip, int x, int y, BufferedImage icon) {
		super(img, spriteIndex, x, y, icon);
		
		this.frameSkip = frameSkip;
	}
	
	public PulseButton(SpriteSheet img, int spriteIndex, int frameSkip, int x, int y) {
		this(img, spriteIndex,frameSkip, x, y, null);
	}
	
	public void draw(Graphics g) {
		super.draw(g);
		
		if (state) {
			if (frameSkip == skipIndex) {
				state = false;
				skipIndex = 0;
				System.out.println("Setting it back to false");
			}else {
				skipIndex++;
			}
		}
	}
	
	public void update(MouseHandler h) {
		if (h.isInside(this)) {
			System.out.println("Click");
			state = true;
		}
	}
}
