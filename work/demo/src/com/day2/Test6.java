package com.day2;

import java.util.Scanner;

class Test6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner ( System.in );

		String name;
		int kor, eng, mat;
		
		//System.out.print("�̸� ���� ���� ����?");// suzi 50 60 70

		System.out.print("�̸�, ����, ����, ����?");// suzi,50,60,70

		//sc = new Scanner ( sc.next() ).useDelimiter("\\s*,\\s*");
		sc = new Scanner ( sc.next() ).useDelimiter(",");
		name = sc.next();
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();

		System.out.println( name+" : "+ (kor + eng + mat) + " ��" ); 

	}
}
