package com.day5;

import java.util.Scanner;


public class Test2 {

	public static void main(String[] args) {

		//10�� �̳��� �̸��� ������ �Է� �޾� 
		// ������ ���� ������� ���� ������� ��� ��������
		
		Scanner sc = new Scanner(System.in);
		
		String[] name;
		int[] score;
		
		int temp1;
		String temp2;
		int numOfPeople;
		
		do{
			System.out.print("�� ��[1-10]?");
			numOfPeople = sc.nextInt();
		}while(numOfPeople <1 || numOfPeople > 10);
		
		// �迭�� �޸� �Ҵ� ( ��ü ���� )
		name = new String[numOfPeople];
		score = new int[numOfPeople];
		
		
		//System.out.print(numOfPeople+" ���� �̸��� ����?");
		for(int i=0; i<numOfPeople; i++){
			System.out.print((i+1) + "��° �̸�?");
			name[i] = sc.next();
			
			System.out.print("����?");
			score[i] = sc.nextInt();
		}
		
		/*System.out.print("Source Data : ");
		
		for(int i=0; i<score.length; i++){
			System.out.printf("%4s : %4d", name[i],score[i]);
		}
		System.out.println();*/
		
		// Selection Sort
		for(int i=0; i<score.length; i++){
			for(int j=i+1; j<score.length; j++){
				if(score[i] < score[j]){
					temp1 = score[j];
					score[j]= score[i];
					score[i] = temp1;
					
					temp2 = name[j];
					name[j] = name[i];
					name[i] = temp2;
					
				}
			}
		}
		
		
		
		for(int i=0; i<numOfPeople; i++){
			System.out.printf("%10s %4d\n", name[i],score[i]);
		}
		
	}

}