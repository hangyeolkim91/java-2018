package com.day6;

import java.io.IOException;

public class Test5 {

	public static void main(String[] args) throws IOException {

		// Class 
		
		/*
		 *  Ư¡ : ���뼺
		 *  
		 *  ��� ���� ( ����, �ð� �� )
		 *  ���ȭ ( ��ǰȭ ) 
		 *  
		 */
		
		TestCom tc = new TestCom();
		
		//System.out.println(System.in.available());
		
		tc.input();
		
		//System.out.println(System.in.available());
		
		int a = tc.area();
		int l = tc.length();
		tc.print(a, l);
		
		//------------------------
		
		
		tc.input();
		a = tc.area();
		l = tc.length();
		
		tc.print(a, l);
		
		TestCom tc1 = new TestCom();
		tc1.input();
		a = tc1.area();
		l = tc1.length();
		tc.print(a, l);
	}

}
