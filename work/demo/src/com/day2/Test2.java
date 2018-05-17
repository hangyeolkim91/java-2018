package com.day2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Test2 {

	public static void main(String[] args) throws IOException {

		BufferedReader  br = new BufferedReader( new InputStreamReader ( System.in ) ) ;

		int num1, num2;
		
		System.out.print("ù��° ��?");
		num1 = Integer.parseInt(br.readLine());

		System.out.print("�ι�° ��?");
		num2 = Integer.parseInt(br.readLine());

		System.out.printf("%d + %d = %d \t", num1, num2, num1+num2);
		System.out.printf("%d - %d = %d \n", num1, num2, num1-num2);
		System.out.printf("%d * %d = %d \t", num1, num2, num1*num2);
		System.out.printf("%d / %d = %g \n", num1, num2, (double)num1/num2);
		System.out.printf("%d %% %d = %d \n", num1, num2, num1%num2);

		
		System.out.println("num1 > num2 : " + (num1>num2)); // true or false
		System.out.println("num1 < num2 : " + (num1<num2)); // true or false
   
		

		String str;

		// ���� ������

		str = num1%2 == 0 ? "¦��" : "Ȧ��";

		str = num1>0 ? "���" : (num1<0 ? "����" :"��");

		// a &&(and) b , a ||(or) b
		str = num1%4 == 0 && num1%100 != 0 || num1%400 == 0 ? "����" : "���";

		System.out.println(str);
	}

}
