package com.day5;

import java.util.Random;
import java.util.Scanner;

public class Hw2 {

	public static void main(String[] args) {

		/*2. 1~10������ ������ �߻����� �߻���Ų ������ 3���ȿ� �˾� ���ߴ� ����
		   (3���ȿ� �˾Ƹ����� ���ϸ� �߻��� ������ ���)

		��)
		�����Է�?[1��°��ȸ] : 3
		Ʋ�Ⱦ��!!
		�����Է�?[2��°��ȸ] : 5
		Ʋ�Ⱦ��!!
		�����Է�?[3��°��ȸ] : 7
		Ʋ�Ⱦ��!!

		������ 2�Դϴ�

		����ҷ�?[Y/N] : 
		------------------------------
		�����Է�?[1��°��ȸ] : 7
		Ʋ�Ⱦ��!!
		�����Է�?[2��°��ȸ] : 4
		Ʋ�Ⱦ��!!
		�����Է�?[3��°��ȸ] : 9
		�¾Ҿ��!!

		������ 9�Դϴ�

		����ҷ�?[Y/N] : */
		
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int number = rd.nextInt(10)+1;
			int input = 0;
			String cmd = "";
			
			for(int i=0; i<3; i++){
				System.out.print("�����Է�?["+(i+1)+"��° ��ȸ!]");
				input = sc.nextInt();
				if( number == input){
					System.out.println("�¾Ҿ��!!");
					break;
				}else
					System.out.println("Ʋ�Ⱦ��!!");
			}
			
			System.out.println("\n������ " + number + "�Դϴ�.");
			
			System.out.print("\n����ҷ�?[y/n]");
			
			cmd = sc.next();
			if( !cmd.equalsIgnoreCase("y") ){
				
				break;
			}
			System.out.println("---------------------------------");
		}
		

	}

}