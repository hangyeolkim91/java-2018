package com.class5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Test2 {

	public static void main(String[] args) throws IOException {

		//Calendar�� ����Ͽ� ���� �޷� �����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Calendar cal = Calendar.getInstance();
		
		System.out.println("�� �� �Է�?[2018-04]");
		String yearMonth = br.readLine();
		
		String[] ym = yearMonth.split("-");
		int year = Integer.parseInt(ym[0]);
		int month = Integer.parseInt(ym[1]);
		
		//System.out.println(year+ " " + month);
		
		cal.set(year, month-1, 1);
		
		
		int week = cal.get(Calendar.DAY_OF_WEEK) -1;
		int end = cal.getActualMaximum(Calendar.DATE);
		
		//System.out.println(week + " " + end);
		
		System.out.println("\n  ��  ��  ȭ  ��  ��  ��  ��");
		System.out.println("------------------------------");

		// Ư�� ���Ϻ��� �����ϵ��� ��������
		for(int i=0; i<week; i++)
			System.out.print("    ");


		// �ش� ���� ��¥�� ���
		for(int i=1; i<=end; i++){
			System.out.printf("%4d",i);

			week++;
			if( week%7 == 0)
				System.out.println();
		}

		if( week %7 !=0)
			System.out.println();
		System.out.println("------------------------------");
		
		
	}

}