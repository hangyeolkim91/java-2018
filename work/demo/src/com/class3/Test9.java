package com.class3;

/*
 *  ���( �θ� �ڽ����� )
 *  
 *  1. �θ��� �� = �ڽ��� ��
 *  2. private���� ������ �� = �θ��� ��
 *  3. protected�� ������ ���� ����� ����
 *  4. �ڽ��� �� = �ڽ��� ��
 *  5. ���� ��ü�� ������ ������ �ڽ��� ���� ����.
 *  
 */

class TestB{
	
	private String title;
	//private int area;
	protected int area;
	
	public void set(String title){
		this.title = title;
		//this.area = area;
	}
	
	public void print(){
		System.out.println(title+ ": "+ area);
	}
	
}

class RectB extends TestB{
	private int w,h;
	
	public RectB(int w, int h){
		this.w=w;
		this.h=h;
	}
	
	public void reactArea(){
		//int a = w*h;
		area = w*h;
		set("�簢��");
		
	}
}

public class Test9 {

	public static void main(String[] args) {

		RectB ob = new RectB(10,20);
		ob.reactArea();
		ob.print();
	}

}