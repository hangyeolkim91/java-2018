package com.day2;

import java.util.Scanner;
class Problem3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print(" ���� ? ");

		int year = sc.nextInt();

		if( year%4 == 0 && year %100 !=0 || year%400 == 0 )
			System.out.println("����");
		else
			System.out.println("���");
	}
}
