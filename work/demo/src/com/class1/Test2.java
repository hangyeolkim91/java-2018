package com.class1;

class Aclass{
	int a, b ; // instance var
}

public class Test2 {

	public static void main(String[] args) {

		// instance ������ �޸� ������ ���� ����Ѵ�.
		Aclass ob1 = new Aclass();
		Aclass ob2 = new Aclass();
		
		ob1.a =10;
		ob1.b =20;
		
		System.out.println("ob1.a : " + ob1.a + " ob1.b : " + ob1.b);
		
		System.out.println("ob2.a : " + ob2.a + " ob2.b : " + ob2.b);
		
		ob2.a=100;
		ob2.b=200;
		System.out.println("ob2.a : " + ob2.a + " ob2.b : " + ob2.b);
		
	}

}
