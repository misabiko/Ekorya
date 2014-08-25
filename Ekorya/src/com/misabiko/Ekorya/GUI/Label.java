package com.misabiko.Ekorya.GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import com.misabiko.Ekorya.Resources.Resources;

public class Label {
	public String str;
	public Color color;
	public Font font;
	public int x;
	public int y;
	
	public Label(String str, int x, int y, Color color, Font font, int fontSize, int fontType) {
		this.str = str;
		this.color = color;
		this.font = font.deriveFont(fontType,fontSize);
		this.x = x;
		this.y = y;
	}
	
	public Label(String str, int x, int y, Color color, Font font, int fontSize) {
		this(str,x,y,color,font, fontSize, Font.TRUETYPE_FONT);
	}
	
	public Label(String str, int x, int y, Color color, Font font) {
		this(str,x,y,color,font, 12, Font.TRUETYPE_FONT);
	}
	
	public Label(String str, int x, int y, Color color) {
		this(str,x,y,color,Resources.kenvector_future.font, 12, Font.TRUETYPE_FONT);
	}
	
	public Label(String str, int x, int y, Font font) {
		this(str, x, y, Resources.gray, font, 12, Font.TRUETYPE_FONT);
	}
	
	public Label(String str, int x, int y) {
		this(str, x, y, Resources.gray, Resources.kenvector_future.font, 12, Font.TRUETYPE_FONT);
	}
	
	public Label(String str) {	//You'll have to use the second draw method instead
		this(str, 0, 0, Resources.gray, Resources.kenvector_future.font, 12, Font.TRUETYPE_FONT);
	}
	
	public Label(String str, Color color) {	//You'll have to use the second draw method instead
		this(str, 0, 0, color, Resources.kenvector_future.font, 12, Font.TRUETYPE_FONT);
	}
	
	public void draw(Graphics g) {
		g.setFont(font);
		g.setColor(color);
		g.drawString(str, x, y);
	}
	
	public void draw(Graphics g,int x,int y) {
		g.setFont(font);
		g.setColor(color);
		g.drawString(str, x, y);
	}
}
