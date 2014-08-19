package com.misabiko.Ekorya.Resources.Sprites;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Sprite {
	public String resPath = "C:\\Users\\Misabiko\\Documents\\Documents\\Programming\\Java\\workspace\\Bobventure\\src\\com\\misabiko\\Ekorya\\Resources\\res\\";
	public String path;
	public BufferedImage img;
	
	public Sprite(String path) {
		this.path = resPath+path+".png";
		
		try {
			img = ImageIO.read(new File(this.path));
		} catch (IOException e) {
		}
	}
	
	public BufferedImage getImg() {
		return img;
	}
}
