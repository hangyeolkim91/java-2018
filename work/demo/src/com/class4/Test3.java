package com.class4;


//String�� class �̴� ( �ڷ����� �ƴϴ� )

public class Test3 {

	public static void main(String[] args) {

		String ob1="Seoul";
		String ob2 = "Seoul";
		String ob3 = new String("Seoul");
		
		System.out.println("ob1 == ob2 : " + (ob1 == ob2));
		System.out.println("ob1 == ob3 : "+ (ob1 == ob3));
		System.out.println("ob1.equals(ob3) : "+ ob1.equals(ob3));
		
		
		ob2 = "korea";
		
		System.out.println("ob1 == ob2 : " + (ob1 == ob2));
		
		
		ob2 = "japan";
		
		System.out.println("ob1 == ob2 : " + (ob1 == ob2));
		
		ob2 = "Seoul";
		System.out.println("ob1 == ob2 : " + (ob1 == ob2));
		
		System.out.println(ob2);
		System.out.println(ob2.toString());
		
		/*
		 * ó���ϴ� �����ʹ� ����ϰ� ��� �󵵴�
		 * ���� ������ �����ʹ� heap������ �����ϰ�
		 * ����ϴ� ����� �ڷ���ó�� ����Ѵ�. 
		 */
	}

}