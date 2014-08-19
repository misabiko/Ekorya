package com.misabiko.Ekorya.Resources.Sprites;

import java.awt.image.BufferedImage;

public class SpriteSheet extends Sprite{
	
	public BufferedImage[] sprites;
	
	public SpriteSheet(String sPath, String fExtension) {
		super(sPath);
		
		readFile spriteSheet = new readFile(resPath+sPath,fExtension);
		
		sprites = new BufferedImage[spriteSheet.data.size()];
		
		for (int i = 0;i<spriteSheet.data.size();i++) {
			sprites[i] = img.getSubimage(
					spriteSheet.data.get(i)[0],
					spriteSheet.data.get(i)[1],
					spriteSheet.data.get(i)[2],
					spriteSheet.data.get(i)[3]
			);
		}
	}
	
	public SpriteSheet(String sPath, String fPath, String fExtension) {
		super(sPath);
		
		readFile spriteSheet = new readFile(resPath+fPath,fExtension);
		
		sprites = new BufferedImage[spriteSheet.data.size()];
		
		for (int i = 0;i<spriteSheet.data.size();i++) {
			sprites[i] = img.getSubimage(
					spriteSheet.data.get(i)[0],
					spriteSheet.data.get(i)[1],
					spriteSheet.data.get(i)[2],
					spriteSheet.data.get(i)[3]
			);
		}
	}
}
