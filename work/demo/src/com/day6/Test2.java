package com.day6;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		
		// �ֹι�ȣ �˻�
		// index : 01234567890123
		// jumin : 941231-2053128
		// check : 234567 892345
		
		// sum = (9*2)+(4*3)+ ... + (2*5) ���η� ���Ͽ� ���� ( jumin, check)
		// sum = 11-sum%11
		// sum = sum%10
		// sum == 8( �ֹι�ȣ �� �� �� )
		
		
		Scanner sc = new Scanner(System.in);
		
		String str;
		
		int[] check = {2,3,4,5,6,7, 8,9,2,3,4,5};
		int sum, chk;
		
		System.out.print("�ֹι�ȣ? [123456 - 1234567]");
		
		str = sc.next();
		
		if(str.length() != 14 ){
			System.out.println("�Է� ����!!!");
			return; // main method�� �������� (stop)
			
		}
		
		sum= 0;
		
		for(int i=0; i<12; i++){
			
			if(i>=6){
				
				sum += check[i]* Integer.parseInt(str.substring(i+1,i+2));
				
			}else{
				
				sum += check[i]* Integer.parseInt(str.substring(i,i+1));
			}
		}
		
		
		chk = 11 - sum%11;
		chk = chk%10;
		
		System.out.println(chk);
		
		if( chk == Integer.parseInt(str.substring(13))){
			System.out.println("��Ȯ�� �ֹι�ȣ!!");
		}else{
			System.out.println("Ʋ�� �ֹ� ��ȣ!!");
			
		}
	}

}

/*

String str = "seoul korea";

                012345678910
System.out.println(str.substring(0,3));
System.out.println(str.substring(6,8));
System.out.println(str.substring(6));
*/