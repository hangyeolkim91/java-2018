package com.day2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Test4{

	public static void main(String[] args) throws IOException {

		//���
		// if, for, while, do~while, switch

		BufferedReader br = new BufferedReader ( new InputStreamReader ( System.in ) ) ;

		int num = 0;
		String str = "";//null

		System.out.print("�� �Է�?");

		num = Integer.parseInt(br.readLine());

/*
		if( num %2 == 0){
			str = "¦��";
		}

		if( num%2 != 0 ){
			str = "Ȧ��";
		}
*/

		if( num%2 == 0 ) {
			str = "¦��";
		}else{
			str = "Ȧ��";
		}


		System.out.println(str);
	}
}
