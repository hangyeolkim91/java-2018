package com.class5;

/*
 *  �߻� Ŭ����
 *  �޸��� ���� ���� Ŭ������ �̸� ����
 *  �޼ҵ带 ������ �ؼ� ���
 */

abstract class ShapeClass{
	
	abstract void draw();
	
}

class Circle extends ShapeClass{
	
	@Override
	public void draw() {
		System.out.println("Drawing Circle");
		
	}
}

class Rectangle extends ShapeClass{
	
	@Override
	void draw() {
		System.out.println("Drawing Rectangle");
	}
}

class Triangle extends ShapeClass{
	
	@Override
	void draw() {
		System.out.println("Drawing Triangle");
	}
}


public class Test7 {

	public static void main(String[] args) {

		ShapeClass s = new Circle();
		ShapeClass s1 = new Rectangle();
		ShapeClass s2 = new Triangle();
		
		s.draw();
		s1.draw();
		s2.draw();
		
		Circle c = new Circle();
		Rectangle r = new Rectangle();
		Triangle t = new Triangle();
		
		c.draw();
		r.draw();
		t.draw();
	}

}
