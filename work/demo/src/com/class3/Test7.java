package com.class3;

import java.util.Calendar;

// Call by Value

/*
 *  stack ������ �����Ͱ� heap�������� ������ ��ü�� �Ѿ
 */

// Call by Reference

/*
 * ���� �ѱ涧 ��ü�� ������ �ּҰ� �Ѿ
 */

class Sub{
	public int x = 10;
	
	public void sub(int a ) {
		
		 x += a;
	}
}

public class Test7 {

	public static void main(String[] args) {

		Sub ob = new Sub();
		
		int a = 20;
		
		
		System.out.println("sub() method ���� �� x : "+ob.x);
	
		ob.sub(a); // call by value
		
		System.out.println("sub() method ���� �� x : "+ob.x);
		
		
		// Call by Reference
		Sub ob1;
		
		ob1 = ob;
		System.out.println("sub() method ���� �� x : "+ob1.x);
		//ob1.sub(10);
		
		Calendar now = Calendar.getInstance();
		Calendar now2 = Calendar.getInstance();
		Calendar now3 = Calendar.getInstance();
		Calendar now4 = Calendar.getInstance();
		
		
	}

}