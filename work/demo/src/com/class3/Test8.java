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

class Test{
	
	private String title;
	private int area;
	
	public void set(String title, int area){
		this.title = title;
		this.area = area;
	}
	
	public void print(){
		System.out.println(title+ ": "+ area);
	}
	
}

class RectA extends Test{
	private int w,h;
	
	public RectA(int w, int h){
		this.w=w;
		this.h=h;
	}
	
	public void reactArea(){
		int a = w*h;
		set("�簢��", a);
		
	}
}

public class Test8 {

	public static void main(String[] args) {

		RectA ob = new RectA(10,20);
		ob.reactArea();
		ob.print();
	}

}