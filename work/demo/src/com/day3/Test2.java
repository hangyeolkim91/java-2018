package com.day3;

import java.util.Scanner;


class Test2 {

	public static void main(String[] args) {
		//10���� ū ���� �Է� �޾� 1���� �հ� ���ϱ�

		Scanner sc = new Scanner(System.in);

		int su, sum=0;

		do{
			System.out.print("10 ���� ū �� �Է�?");
			su = sc.nextInt();

		}while( su <10);
/*
		for(int i=1; i<=su; i++){
			sum = sum + i;
		}
*/
		int i=0;
		while( i < su){
			i++;
			sum +=i;
		}
		System.out.println("���: " + sum);
		

	}
}
