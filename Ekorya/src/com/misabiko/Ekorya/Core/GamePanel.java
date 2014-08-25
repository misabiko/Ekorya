package com.misabiko.Ekorya.Core;

import javax.swing.JPanel;

import com.misabiko.Ekorya.GameObjects.GameObject;
import com.misabiko.Ekorya.GameObjects.Interactables.Collidables.Collidable;
import com.misabiko.Ekorya.GameObjects.Interactables.Collidables.DetectionArea;
import com.misabiko.Ekorya.GameScenes.GameScene;

import java.awt.*;
import java.util.ArrayList;

public class GamePanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private Graphics g;
	private GameScene scene;
	
	public GamePanel(GameScene scene) {
		this.scene = scene;
		
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		super.setBackground(Color.WHITE);
		this.g = g;
		
		draw(scene.gameObjs);
	}
	
	private void draw(GameObject obj) {
		g.drawImage(obj.sprite, obj.x, obj.y, null);
		
		if (Collidable.DetectionAreaVisible && obj instanceof Collidable) {
			draw(((Collidable)obj).topDA);
			draw(((Collidable)obj).bottomDA);
			draw(((Collidable)obj).leftDA);
			draw(((Collidable)obj).rightDA);
			draw(((Collidable)obj).topLeftDA);
			draw(((Collidable)obj).topRightDA);
			draw(((Collidable)obj).bottomLeftDA);
			draw(((Collidable)obj).bottomRightDA);
		}
	}
	
	private void draw(DetectionArea da) {
		g.setColor(new Color(0,0,255,100));
		g.fillRect(da.x,da.y,da.x2-da.x,da.y2-da.y);
	}
	
	private void draw(ArrayList<GameObject> objs) {
		for (GameObject obj : objs) {
			if (obj.visible) {
				draw(obj);
			}
		}
	}

//	private void drawFlip(BufferedImage img, int x, int y) {	//Draws images flipped horizontally
//		g.drawImage(img, x + img.getWidth(), y, -img.getWidth(), img.getHeight(), null);
//	}
}
