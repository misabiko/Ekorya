package com.misabiko.Ekorya.GUI;

import com.misabiko.Ekorya.Resources.Resources;

public class PauseMenu extends GUI{

	public PauseMenu() {
		super("Pause",100,100, 300,200);
		
		Buttons.add(new PulseButton(Resources.blueSheet,3,60,centerX-Resources.blueSheet.sprites[3].getWidth()/2,y+50));
		Buttons.get(0).addLabel("Resume game", Resources.light_gray);
	}
}
