package com.foxmula.assignments.problem3;

public class Problem3 {

	public static void main(String... args) {
		Square sq = new Square(0, 0, 5, 5, 0, 5, 5, 0);
		System.out.println("Area of square is " + sq.getArea());

		Rectangle rec = new Rectangle(14, 12, 15, 4, 56, 5, 6, 4);
		System.out.println("Area of the rectangle is " + rec.getArea());

		Trapezoid trap = new Trapezoid(2, 45, 7, 5, 6, 12, 10, 14, 2);
		System.out.println("Area of the trapezoid is " + trap.getArea());

		Parallelogram parll = new Parallelogram(0, 0, 1, 6, 0, 5, 5, 5, 5);
		System.out.println("Area of the parallelogram is " + parll.getArea());

	}

}
