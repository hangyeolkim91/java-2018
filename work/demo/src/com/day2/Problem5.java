package com.day2;

import java.util.Scanner;
class Problem5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("�̸� ����1 ����2 ����3?");

		String name;
		int sub1, sub2, sub3;
		int totalScore, avgScore;
		String result="";

		name = sc.next();
		sub1 = sc.nextInt();
		sub2 = sc.nextInt();
		sub3 = sc.nextInt();

		totalScore = sub1+sub2+sub3;
		avgScore = totalScore/3;

		if( avgScore <60 ){
			result = "���հ�";
		}else if ( sub1<40 || sub2<40 || sub3<40){
			result ="����";
		}else{
			result = "�հ�";
		}
		
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + totalScore +", ��� : " + avgScore + ", ���� : " + result); 
	}
}
