package com.misabiko.Ekorya.GUI;

import java.awt.Font;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;

import com.misabiko.Ekorya.Resources.Resources;

public class GUI extends JPanel{
	public Panel panel;
	public Panel titlePanel;
	public String titleStr;
	public Label title;
	public ArrayList<Button> Buttons = new ArrayList<Button>();
	public int x;
	public int y;
	public int width;
	public int height;
	public int centerX;
	public int centerY;
	
	public GUI(int x, int y, int w, int h) {
		this.x = x;
		this.y = y;
		width = w;
		height = h;
		panel = new Panel(width,height);
	}
	
	public GUI(String title,int x, int y,  int w, int h) {
		this.x = x;
		this.y = y;
		width = w;
		height = h;
		this.titleStr = title;
		titlePanel = new Panel(width,50,0);
		panel = new Panel(width,height);
	}
	
	public void draw(Graphics g) {
		if (titlePanel != null) {
			titlePanel.drawPanel(x, y-40);
			
			int titleW = g.getFontMetrics(Resources.kenvector_future.font.deriveFont(Font.TRUETYPE_FONT,12)).stringWidth(titleStr);
			int titleH = g.getFontMetrics(Resources.kenvector_future.font.deriveFont(Font.TRUETYPE_FONT,12)).getHeight();
			
			title = new Label(titleStr, (x+width/2)-titleW/2,(y-10)-titleH/2,Resources.light_gray);
			
			title.draw(g);
//			addText(g,title,(x+width/2)-titleW/2,(y-10)-titleH/2, Resources.light_gray);
		}
		panel.drawPanel(x, y);	//TODO	 Add sliders, exit button and everything
		
		for (Button b : Buttons) {
			System.out.println(b.state);
			b.draw(g);
		}
	}
}
