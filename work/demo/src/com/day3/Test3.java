package com.day3;

import java.util.Scanner;
import java.io.IOException;

class Test3 {
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		int su, sum;
		//String ch;
		char ch;

		while(true){

			sum = 0;
			//ch = "";
			do{
				System.out.print("���Է�?");
				su = sc.nextInt();
			}while( su <1 || su > 5000);

			for(int i=1; i<= su ; i++){
				sum += i;

			}
			System.out.println("1 ~ " + su + "������ ��: " + sum);

			System.out.print("����Ͻðڽ��ϱ�?[y/n]");

			ch = (char)System.in.read();

			if( ch != 'y' && ch != 'n'){
				System.out.println("�����մϴ�..");
				break;
			}

			/*ch = sc.next();

			if( !ch.equalsIgnoreCase("y") ){
				break;
			}
			*/

			
		}//end..while
		



	}//end..main
}