package com.misabiko.Ekorya.GameObjects.Interactables.Collidables;

public class DetectionArea {
	public int x,y,x2,y2;
	public DetectionArea(int x, int y, int x2, int y2) {
		this.x = x;
		this.y = y;
		this.x2 = x2;
		this.y2 = y2;
	}
	
	public void move(int x, int y, int x2, int y2) {
		this.x = x;
		this.y = y;
		this.x2 = x2;
		this.y2 = y2;
	}
	
	public boolean checkOverlapping(DetectionArea da) {
		if (y > da.y && y < da.y2) {	//y is inside da
			if (x > da.x && x < da.x2) {	//x is inside da
				return true;
			}else if (x2 > da.x && x2 < da.x2) {	//x2 is inside da
				return true;
			}else if (x < da.x && x2 > da.x2) {	//da x is inside this x
				return true;
			}else if (x > da.x && x2 < da.x2) {	// this x is inside da x
				return true;
			}
		}else if (y2 > da.y && y2 < da.y2) {	//y2 is inside da
			if (x > da.x && x < da.x2) {	//x is inside da
				return true;
			}else if (x2 > da.x && x2 < da.x2) {	//x2 is inside da
				return true;
			}else if (x < da.x && x2 > da.x2) {	//da x is inside this x
				return true;
			}else if (x > da.x && x2 < da.x2) {	// this x is inside da x
				return true;
			}
		}else if (y < da.y && y2 > da.y2) {	//da y is inside this y
			if (x > da.x && x < da.x2) {	//x is inside da
				return true;
			}else if (x2 > da.x && x2 < da.x2) {	//x2 is inside da
				return true;
			}else if (x < da.x && x2 > da.x2) {	//da x is inside this x
				return true;
			}else if (x > da.x && x2 < da.x2) {	// this x is inside da x
				return true;
			}
		}else if (y > da.y && y2 < da.y2) {	//this y is inside da y
			if (x > da.x && x < da.x2) {	//x is inside da
				return true;
			}else if (x2 > da.x && x2 < da.x2) {	//x2 is inside da
				return true;
			}else if (x < da.x && x2 > da.x2) {	//da x is inside this x
				return true;
			}else if (x > da.x && x2 < da.x2) {	// this x is inside da x
				return true;
			}
		}
		return false;
	}
}
