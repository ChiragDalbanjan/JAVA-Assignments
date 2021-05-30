package com.foxmula.assignments.problem3;

class Rectangle extends Quadrilateral {
	Rectangle(int x1, int x2, int x3, int x4, int y1, int y2, int y3, int y4) {
		super(x1, x2, x3, x4, y1, y2, y3, y4);
	}

	int getArea() {
		int d1 = (int) Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
		int d2 = (int) Math.sqrt((x1 - x4) * (x1 - x4) + (y1 - y4) * (y1 - y4));
		return d1 * d2;
	}

}