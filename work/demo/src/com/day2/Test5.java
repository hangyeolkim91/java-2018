package com.day2;

import java.util.Scanner;

class Test5{

	public static void main(String[] args) {

		// Scanner:  �ܶ������� ������ ����ؼ� �з�
		// �⺻ ������ ����

		Scanner sc = new Scanner( System.in );

		String name;
		int kor;

		System.out.print("�̸�?");
		name = sc.next();

		System.out.print("����?");
		kor = sc.nextInt();

		String pan;

		if(kor >= 90){
			pan = "��";
		}else if (kor >=80 ){
			pan = "��";
		}else if( kor >= 70){
			pan = "��";
		}else if (kor >= 60){
			pan = "��";
		}else{
			pan = "��";
		}

		System.out.println(name  +"\t"+ kor + "��: " + pan);
	}
}