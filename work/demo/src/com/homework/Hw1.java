package com.homework;

import java.io.IOException;

/*
 * [����1]
	System.in.read()�� ����ؼ� ���ڸ� �Է¹ް�
	�Է¹��� �������� �հ踦 ���Ͻÿ�
	
	����
	1.BufferedReader X
	2.Scanner X
	
	���
	���Է�? 10
	1-10������ ��: 55
 */

public class Hw1 {

	public static void main(String[] args) throws IOException {
		
		System.out.print("���Է�?");

/*		char a= (char)System.in.read(); 
		String str="";
		while( a != '\r' ){
			str += a;
			a = (char)System.in.read();
			
		}
		System.out.println(str);
		
		
		
		
		int n;
		
		n = Integer.parseInt(str);
		
		int sum =0;
		for(int i=1; i<=n; i++){
			sum+=i;
		}
		System.out.println("�հ� : " + sum);
*/		
		
		int a = System.in.read();
		int number=0;
		int sum=0;
		
		while( a !='\r'){
			number *= 10;
			number += (a-'0');
			a = System.in.read();
			
			
		}
		System.out.println(number);
		
		for(int i=1; i<=number; i++){
			sum+=i;
		}
		System.out.println("�հ� : " + sum);
		
	}

}