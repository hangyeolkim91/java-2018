package com.day5;

import java.util.Random;
import java.util.Scanner;

public class Hw3 {

	public static void main(String[] args) {

/*		3. 1~3������ ������ �߻����� ����,����,�� ���� ���α׷� �ۼ�
		  1:����, 2:����, 3:��

		��)
		1:����, 2:����, 3:�� ?1
		��ǻ�� :�� ��� :����
		����� �̰���ϴ�

		1:����, 2:����, 3:�� ?1
		��ǻ�� :���� ��� :����
		��ǻ�Ͱ� �̰���ϴ�

		1:����, 2:����, 3:�� ?1
		��ǻ�� :���� ��� :����
		�����ϴ�*/
		
		Scanner sc = new Scanner(System.in);
		
		Random rd = new Random();
		
		String[] rsp = {"", "����", "����", "��"};
		
		while(true){
			String cmd ="";
			
			int userRsp=0;
			int comRsp = rd.nextInt(3)+1;
			
			System.out.print("1:����, 2:����, 3:��?");
			userRsp = sc.nextInt();
			System.out.println("��ǻ�� : " + rsp[comRsp]+ " ��� : " + rsp[userRsp]);
			if( userRsp == comRsp){
				System.out.println("�����ϴ�.");
			}else if (userRsp == 1){
				if( comRsp == 2){
					System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
				}else{
					System.out.println("����� �̰���ϴ�.");
				}
			}else if ( userRsp == 2){
				if( comRsp == 3){
					System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
				}else{
					System.out.println("����� �̰���ϴ�.");
				}
			}else if ( userRsp == 3){
				if( comRsp == 1){
					System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
				}else{
					System.out.println("����� �̰���ϴ�.");
				}
			}
			
			System.out.print("��� �Ͻðڽ��ϱ�?[Y/N]");
			cmd = sc.next();
			System.out.println("-----------------------------");
			if( !cmd.equalsIgnoreCase("y")){
				break;
			}
		}
	}

}