package com.misabiko.Ekorya.Core;
import javax.swing.JPanel;

import com.misabiko.Ekorya.Entities.Entities;
import com.misabiko.Ekorya.Resources.Sprites.Animation;
import com.misabiko.Ekorya.Resources.Sprites.Sprite;
import com.misabiko.Ekorya.Resources.Sprites.SpriteSheet;

import java.awt.*;

public class Display extends JPanel {
	
	private static final long serialVersionUID = 1L;
	
	public Sprite bg = new Sprite("bg");
	public SpriteSheet tiles_spritesheet = new SpriteSheet("Tiles\\tiles_spritesheet",".xml");
	public SpriteSheet p1_spritesheet = new SpriteSheet("Player\\p1_spritesheet",".txt");
	public Animation playerWalking = new Animation( 3, 5, 15, p1_spritesheet);
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		this.setBackground(Color.WHITE);
		g.drawImage(bg.img,0,0,this.getWidth(),this.getHeight(),null);
		
		for (int i=0;i <= 11;i++) {
			g.drawImage(tiles_spritesheet.sprites[82],i*tiles_spritesheet.sprites[82].getWidth(null),this.getHeight()-tiles_spritesheet.sprites[82].getHeight(null),null);
		}
		
		this.drawPlayer(g);
	}
	
	public void drawPlayer(Graphics g) {
//		TODO Find a way to reference player shortly instead of Entities.Ents.get(0), maybe by making it static?
		if (Entities.Ents.get(0).isJumping()) {
			if (Entities.Ents.get(0).getDirection() == 0) {
				playerWalking.reset();
				g.drawImage(p1_spritesheet.sprites[3],Entities.Ents.get(0).x+p1_spritesheet.sprites[3].getWidth(),Entities.Ents.get(0).y,-p1_spritesheet.sprites[3].getWidth(),p1_spritesheet.sprites[3].getHeight(),null);
			}else {
				playerWalking.reset();
				g.drawImage(p1_spritesheet.sprites[3],Entities.Ents.get(0).x,Entities.Ents.get(0).y,null);
			}
		}else {
			switch (Entities.Ents.get(0).getDirection()) {
			case 0:
				playerWalking.reset();
				g.drawImage(p1_spritesheet.sprites[9],Entities.Ents.get(0).x+p1_spritesheet.sprites[9].getWidth(),Entities.Ents.get(0).y,-p1_spritesheet.sprites[9].getWidth(),p1_spritesheet.sprites[9].getHeight(),null);
				break;
			case 1:
				playerWalking.draw(g,Entities.Ents.get(0).x,Entities.Ents.get(0).y);
				break;
			default:
				playerWalking.reset();
				g.drawImage(p1_spritesheet.sprites[1],Entities.Ents.get(0).x,Entities.Ents.get(0).y,null);
				break;
			}
		}
	}
	
	public void drawFlip(Graphics g,Image img,int x,int y) {
//		TODO Make drawFlip method
		
	}
}
