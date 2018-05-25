package com.class2;

import java.util.Scanner;

class Rect{
	
	private int w,h;
	
	public void set(int w, int h){
		
		this.w = w;
		this.h = h;
		
	}
	
	public int area(){
		return w*h;
	}
	public int length(){
		return (w+h)*2;
	}
	
	public void print(int a, double l){
		System.out.println("���� : "+w);
		System.out.println("���� : "+h);
		System.out.println("���� : "+a);
		System.out.println("�ѷ� : "+l);
	}
	
	// Method Overloading (�ߺ� ����)
	// Method�� �̸��� ���� ������ �Ű������� ���� Ȥ�� ������ Ÿ����
	// �ٸ��� �ٸ� Method�� �ν��Ѵ�.
	
	/*
	 * Overloading��
	 * �ϳ��� Ŭ���� �ȿ��� ���� �۾��� �ϴ� �޼ҵ��� �̸��� 
	 * ���� ��Ű�� ���� �Ѵ�.
	 */
	
	public void print(){
		System.out.println("���� : "+w);
		System.out.println("���� : "+h);
	}
	
	public void print(int a){
		System.out.println("���� : "+w);
		System.out.println("���� : "+h);
		System.out.println("���� : "+a);
	}
	public void print(double l){
		System.out.println("���� : "+w);
		System.out.println("���� : "+h);
		System.out.println("�ѷ� : "+l);
	}
}

public class Test4 {

	public static void main(String[] args) {

		Rect rc = new Rect();
		int w,h;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("����?");
		w = sc.nextInt();
		System.out.println("����?");
		h = sc.nextInt();
		
		rc.set(w, h);
		int a = rc.area();
		double l = rc.length();
		
		rc.print(l);
		rc.print(a);
		
//		rc.print(a, l);
//		rc.write();
//		rc.areaWrite(a);
//		rc.lengthWrite(l);
		String str;
		
	}

}
