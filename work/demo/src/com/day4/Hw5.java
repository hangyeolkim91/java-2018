package com.day4;

import java.util.Scanner;

public class Hw5 {

	public static void main(String[] args) {

		//5. �μ��� �Է¹޾� ���� ������ ū�������� ��
		
		Scanner sc = new Scanner(System.in);
		
		int n1, n2 , sum=0, max, min;
		
		System.out.print("�� ����?");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		if( n1 > n2 ){
			max = n1;
			min = n2;
		}else{
			max = n2;
			min = n1;
		}
		
		for(int i=min; i<=max; i++){
			sum +=i;
		}
		System.out.println("��� : "+ sum);
	}

}
