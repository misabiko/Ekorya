package com.misabiko.Ekorya.Controls;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener {
	public boolean dIsHeld, aIsHeld, spaceTyped = false;
	
	@Override
	public void keyPressed(KeyEvent e) {
		switch (e.getKeyCode()) {
		case KeyEvent.VK_D:
			dIsHeld = true;
			break;
		case KeyEvent.VK_A:
			aIsHeld = true;
			break;
		case KeyEvent.VK_SPACE:
			spaceTyped = true;
			break;
		default:
			break;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		switch (e.getKeyCode()) {
		case KeyEvent.VK_D:
			dIsHeld = false;
			break;
		case KeyEvent.VK_A:
			aIsHeld = false;
			break;
		default:
			break;
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}
}
