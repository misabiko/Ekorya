package com.misabiko.Ekorya.GUI;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

import com.misabiko.Ekorya.Resources.Resources;
import com.misabiko.Ekorya.Resources.Sprites.SpriteSheet;

public class Panel extends JPanel{

	private static final long serialVersionUID = 1L;
	private BufferedImage greyPanel = Resources.greySheet.sprites[29];
	private BufferedImage bluePanel = Resources.blueSheet.sprites[20];
	private BufferedImage greenPanel = Resources.greenSheet.sprites[20];
	private BufferedImage redPanel = Resources.redSheet.sprites[20];
	private BufferedImage yellowPanel = Resources.yellowSheet.sprites[20];
	public int width;
	public int height;
	public int color;
	
	public Panel(int width,int height,int color) {
		setPreferredSize(new Dimension(width,height));
		setOpaque(false);
		
		this.color = color;
	}
	
	public Panel(int width,int height) {
		this(width, height, 4);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		
		
//		drawExtended(Resources.greySheet,29);
		
		g.drawImage(Resources.greySheet.sprites[29+1],0,0,33,33,null);
		g.drawImage(Resources.greySheet.sprites[29+2],33,0,width-66,33,null);
		g.drawImage(Resources.greySheet.sprites[29+3],width-33,0,33,33,null);
		
		g.drawImage(Resources.greySheet.sprites[29+4],0,33,33,height-66,null);
		g.drawImage(Resources.greySheet.sprites[29+5],33,33,width-66,height-66,null);
		g.drawImage(Resources.greySheet.sprites[29+6],width-33,33,33,height-66,null);
		
		g.drawImage(Resources.greySheet.sprites[29+7],0,height-33,33,33,null);
		g.drawImage(Resources.greySheet.sprites[29+8],33,height-33,width-66,33,null);
		g.drawImage(Resources.greySheet.sprites[29+9],width-33,height-33,33,33,null);
	}
	
	public void drawPanel(int x,int y) {
		
		if ((width > greyPanel.getWidth())||(height > greyPanel.getHeight())) {
			switch (color) {
			case 0:
				drawExtended(Resources.blueSheet,20);
				break;
			case 1:
				drawExtended(Resources.greenSheet,20);
				break;
			case 2:
				drawExtended(Resources.redSheet,20);
				break;
			case 3:
				drawExtended(Resources.yellowSheet,20);
				break;
			default:
				drawExtended(Resources.greySheet,29);
				break;
			};
		}else {
//			switch (color) {
//			case 0:
//				g.drawImage(bluePanel,x,y,width,height,null);
//				break;
//			case 1:
//				g.drawImage(greenPanel,x,y,width,height,null);
//				break;
//			case 2:
//				g.drawImage(redPanel,x,y,width,height,null);
//				break;
//			case 3:
//				g.drawImage(yellowPanel,x,y,width,height,null);
//				break;
//			default:
//				g.drawImage(greyPanel,x,y,width,height,null);
//				break;
//			}
		}
	}
	
	public void drawExtended(SpriteSheet sheet, int spriteIndex) {
//		g.drawImage(sheet.sprites[spriteIndex+1],0,0,33,33,null);
//		g.drawImage(sheet.sprites[spriteIndex+2],33,0,width-66,33,null);
//		g.drawImage(sheet.sprites[spriteIndex+3],width-33,0,33,33,null);
//		
//		g.drawImage(sheet.sprites[spriteIndex+4],0,33,33,height-66,null);
//		g.drawImage(sheet.sprites[spriteIndex+5],33,33,width-66,height-66,null);
//		g.drawImage(sheet.sprites[spriteIndex+6],width-33,33,33,height-66,null);
//		
//		g.drawImage(sheet.sprites[spriteIndex+7],0,height-33,33,33,null);
//		g.drawImage(sheet.sprites[spriteIndex+8],33,height-33,width-66,33,null);
//		g.drawImage(sheet.sprites[spriteIndex+9],width-33,height-33,33,33,null);
	}
}
