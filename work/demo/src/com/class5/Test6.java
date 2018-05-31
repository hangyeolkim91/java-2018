package com.class5;

/*
 * final�� ����ϴ� �� ���� ���
 * 
 * 1. ��������� ����� �����Ҷ�
 * 2. method :  Override���Ұ�
 * 3. class : ����� �Ұ�
 */

//final class Test{
class Test{
	
	public static final double PI; // ���
	
	static{
		PI = 3.141592;
	}
	
	public double area;
	
	//Override �Ұ�
	public final void write(String title){
		System.out.println(title + " : "+area);
	}
	
	
}


public class Test6 extends Test{

	/*public void write(String title){ �Ұ���
		
	}*/
	
	public void circleArea(int r){
		area = (double) r*r*PI;
	}

	
	public static void main(String[] args) {

		Test6 ob = new Test6();
		
		ob.circleArea(10);
		ob.write("Circle");
		
	}

}