package com.class3;

import java.util.Scanner;

// ������
// �޸� �Ҵ��� ���� �� ���
// ���� �ʱ�ȭ�� ���

/*
 *  class�� �̸��� ����
 *  ���ϰ��� ���� ������ property�� ����.
 *  �ߺ� ���ǰ� ���� ( overloading )
 *  ���� ���ο��� �ѹ��� ȣ�� ����
 */

public class Test1 {
	
	private int x;
	
	//�⺻ ������
	
	public Test1(){
		
		this(20); // ���ο��� �ѹ���
		
		System.out.println("�μ��� ���� ������");
		x = 10;
		System.out.println("x : " + x);
	}
	
	public Test1(int x){
		
		//this(); �����ε��� �����ڿ��� �⺻������ ȣ�� ����
		
		System.out.println("�μ��� �ִ� ������");
		this.x = x;
		System.out.println("x : " + x);
	}
	
	public void setData(int x){
		this.x = x;
		System.out.println("x : " + x);
	}

	public static void main(String[] args) {
		
		Test1 ob = new Test1();
		//ob.setData(5);
		Test1 ob2 = new Test1(100);
		
		Scanner sc = new Scanner(System.in);// DI, ������ ����
		
		

	}

}