package com.day5;

import java.util.Scanner;

public class Hw1 {

	public static void main(String[] args) {
		
		/* 1. 5���� ������ �Է¹޾� �Է¹��� ���� ����ϰ� �Է¹��� ����
		 * ���� ū���� �������� ���
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int[] n = new int[5];
		
		System.out.print("�ټ� ���� ���� �Է�?");
		
		
		for(int i=0; i<5; i++){
			n[i] = sc.nextInt();
		}
		
		for(int i=0; i<n.length; i++){
			System.out.print(n[i] + " ");
		}
		System.out.println();
		for(int i=1; i<n.length; i++){
			int temp = n[i];
			int aux = i-1;
			
			while( (aux>= 0 ) && (n[aux] > temp)){
				n[aux+1] = n[aux];
				aux--;
			}
			n[aux+1] = temp;
		}
		
		
		System.out.println("�ּ� : " + n[0] + " �ִ� : " + n[4]);
		
	}

}