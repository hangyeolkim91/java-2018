package com.day4;

import java.util.Scanner;

public class Hw2 {

	public static void main(String[] args) {

		//2.1���� 100���� ���� Ȧ���� ��, ¦���� ��, ��ü�� ��
		
		Scanner sc = new Scanner(System.in);
		
		
		int n, sum=0, sumOfOdd=0, sumOfEven=0;
		
		System.out.print("����?");
		n = sc.nextInt();
		
		for(int i=1; i<=n; i++){
			sum +=i;
			if( i%2 == 0){
				sumOfEven +=i;
			}else{
				sumOfOdd +=i;
			}
		}
		
		System.out.println("��ü �� :" + sum + " Ȧ���� ��: " + sumOfOdd + " ¦���� �� : " + sumOfEven);
		
		
	}

}