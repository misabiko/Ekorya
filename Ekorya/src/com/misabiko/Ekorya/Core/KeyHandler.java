package com.misabiko.Ekorya.Core;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import com.misabiko.Ekorya.Entities.Entities;


public class KeyHandler implements KeyListener{
	public boolean aIsHeld;
	public boolean dIsHeld;
	
	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_SPACE && !Entities.Ents.get(0).isJumping()) {
			Entities.Ents.get(0).vY = -7;	//TODO Make an actual jump method in the Physic class instead
		}
		if (e.getKeyCode() == KeyEvent.VK_D) {
			dIsHeld = true;
		}else if (e.getKeyCode() == KeyEvent.VK_A) {
			aIsHeld = true;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_D) {
			dIsHeld = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_A) {
			aIsHeld = false;
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
	}

}
