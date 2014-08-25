package com.misabiko.Ekorya.GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import com.misabiko.Ekorya.Resources.Resources;
import com.misabiko.Ekorya.Resources.Sprites.SpriteSheet;

public class Button extends Clickable{
	public BufferedImage off;
	public BufferedImage on;
	public BufferedImage icon;
	public Label label;
	public int width;
	public int height;
	
	public Button(SpriteSheet img, int spriteIndex, int x, int y, int width, int height, BufferedImage icon) {
		super(x, y, x+width, y+height);
		
		off = img.sprites[spriteIndex];
		on = img.sprites[spriteIndex+1];
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		
		this.icon = icon;
	}
	
	public Button(SpriteSheet img, int spriteIndex, int x, int y, BufferedImage icon) {
		this(img,spriteIndex,x, y, img.sprites[spriteIndex].getWidth(), img.sprites[spriteIndex].getHeight(),icon);
	}
	
	public Button(SpriteSheet img, int spriteIndex, int x, int y, int width, int height) {
		this(img,spriteIndex,x,y,width,height,null);
	}
	
	public Button(SpriteSheet img, int spriteIndex, int x, int y) {
		this(img,spriteIndex,x, y, x+img.sprites[spriteIndex].getWidth(), y+img.sprites[spriteIndex].getHeight(),null);
	}
	
	public void draw(Graphics g) {
		if (state) {
			g.drawImage(on, x, y,width,height, null);
		}else {
			g.drawImage(off, x, y,width,height, null);
		}
		if (icon != null) {
			g.drawImage(icon, x+off.getHeight()/3, y+off.getHeight()/4, null);
		}
		if (label != null) {
			
			int labelW = g.getFontMetrics(Resources.kenvector_future.font.deriveFont(Font.TRUETYPE_FONT,12)).stringWidth(label.str);
			int labelH = g.getFontMetrics(Resources.kenvector_future.font.deriveFont(Font.TRUETYPE_FONT,12)).getHeight();
			
			label.draw(g,(x+width/2)-labelW/2,(y+height/2)+labelH/4);
		}
	}
	
	public void addLabel(String str) {
		label = new Label(str);
	}
	
	public void addLabel(String str, Color color) {
		label = new Label(str,color);
	}
}
