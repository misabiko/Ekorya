package com.misabiko.Ekorya.Controls;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import com.misabiko.Ekorya.GUI.Clickable;

public class MouseHandler implements MouseListener, MouseMotionListener{
	
	public int x, y, xPos, yPos;
	
	@Override
	public void mouseClicked(MouseEvent e) {
		x = e.getX();
		y = e.getY();
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
	}
	
	public boolean isInside(Clickable c) {
		boolean isInside = false;
		if (x >= c.x && x <= c.x2) {
			if (y >= c.y && y <= c.y2) {
				isInside = true;
			}
		}
		x = -1;
		y = -1;
		return isInside;
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		xPos = e.getX();
		yPos = e.getY();
	}
}
