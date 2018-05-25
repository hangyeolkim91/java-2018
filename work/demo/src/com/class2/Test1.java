package com.class2;

/*
 * this : ME, �ڱ��ڽ�(class �� �̸� = Circle)
 */

class Circle{
	
	private int r; // ������ ����(ĸ��ȭ)
	private final double pi = 3.14;
	
	// ���� �ʱ�ȭ �޼ҵ� ( �ʱ�ȭ �� this�� ���� �� ) 
	
	public void setData(int r){ //setData(int r, Circle this) ���������� �۵��� 
		this.r = r;
	}
	
	public double area(){ // area(Circle this);
		return r*r*pi;
	}
	
	public void write(double a){ // wirte(double a, Circle this)
		System.out.println("������ : " + r);
		System.out.println("���� : " + a);
	}
	
}

public class Test1 {

	public static void main(String[] args) {

		Circle ob1 = new Circle();
		
		ob1.setData(10);          // setData(10,ob1);
		double r = ob1.area();    // area(ob1);
		ob1.write(r);             // write(r, ob1);
		
		ob1.setData(200);
		r = ob1.area();
		ob1.write(r);
	}

}
