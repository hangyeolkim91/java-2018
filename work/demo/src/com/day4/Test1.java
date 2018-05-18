package com.day4;

import java.io.IOException;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int num1, num2, result=0;
		
		char oper;
		
		System.out.print("ù��° ��?");
		num1 = sc.nextInt();
		
		System.out.print("�ι�° ��?");
		num2 = sc.nextInt();
		
		System.out.print("������?[+,-,*,/]");
		oper = (char) System.in.read();
		
		switch(oper){
		
		case '+':
			result = num1+num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			try{
			result = num1 /num2;
			}catch(Exception e){
				System.out.println("0���δ� ���� �� �����ϴ�." + e.toString());
			}
			break;
		default:
			result = 0;
		}
		System.out.printf("%d %c %d = %d\n", num1, oper, num2,result);
		//System.out.println("��� : " + result);
		

	}

}



/* 
 * [�ڷ���]
 * 
 * boolean : true / false
 * 
 * 
 * ������
 * byte    : -128 ~ 127
 * short   : -32768 ~ 32767
 * int     : 4byte
 * long    : 8byte
 * 
 * ����
 *  10���� : 10 , 8���� : 016 , 16���� : 0x17
 *  
 *  �Ǽ�
 *  
 *  float : 4byte
 *  double: 8byte
 *  �������Ǽ�(float): 3.14f
 *  �������Ǽ�(double) : 3.14
 *  
 *  ����
 *  
 *  char : 2byte(utf-16) \u0000 'a'
 *  
 *  [������]
 *  +, *, - , / , %, ++, --, 
 *  
 *  [���� ������]
 *  > , < , >=, <= : ��� -> true/false
 *  
 *  [� ������]
 *  ==, !=
 *  
 *  [���� ������]
 *  &&(and), ||(or), !(not), ^(xor)
 *  
 *  [��Ʈ ������]
 *  &, |, ~, >>, <<, >>>
 *  
 *  [���� ������]
 *  
 *  ���� ? �� : ����
 *  
 *  [���� ������]
 *  =, +=, -=, *=, /= , %=
 *  
 *  ---------------------------------
 *  
 *  int a = 10;
 *  float b;
 *  
 *  b = a;         // �Ͻ��� ����ȯ
 *  b = (float) a; //������ ����ȯ
 *  
 *  a = b;       (x)
 *  a = (int) b; (o) //������ ����ȯ
 *  
 *  -----------------------------------
 *  
 *  [���]
 *  
 *  if( ���� ) {
 *  	�۾�;
 *  }
 *  
 *  if( ���� ) {
 *  	
 *  }else{
 *  
 *  }
 *  
 *  if ( ) {
 *  }else if (){
 *  }else{
 *  }
 *  
 *  [�ݺ���]
 *  
 *  while(){
 *  }
 *  
 *  do{
 *  }while();
 *  
 *  while( true ){
 *  }
 *  
 *  
 *  
 *  
 */