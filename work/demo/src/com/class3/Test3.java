package com.class3;

public class Test3 {
	
	int a =5;
	
	//�ʱ�ȭ ����
	{
		System.out.println("�ʱ�ȭ ���� : a " + a);
		a=10;
		System.out.println("�ʱ�ȭ ���� : a " + a);
	}
	
	static int b;
	
	// static �ʱ�ȭ ����
	static{
		b = 10;
		System.out.println("static �ʱ�ȭ ���� b : " +b);
		
	}
	
	// ���
	final int C;
	
	
	public Test3(){
		
		System.out.println("������ ...");
		
		C = 100;
		
		System.out.println("��� C : " + C );
	}

	public static void main(String[] args) {

		Test3 ob1 =new Test3();
		System.out.println("\n------------------------------------");
		Test3 ob2 =new Test3();
	}

}