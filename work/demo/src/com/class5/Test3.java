package com.class5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Test3 {

	public static void main(String[] args) throws IOException {

		//  ���÷� ���� x�� �ĸ� �� �� �� ���� �� ���
		// ���� : 2018�� 5�� 30�� ��
		// 100�� �� : yyyy-mm-dd week
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Calendar cal = Calendar.getInstance();
		
		String[] week = {"��","��","ȭ","��","��","��","��"};
		
		String startDay;
		
		System.out.println("������?[yyy-mm-dd]");
		
		startDay = br.readLine();
		
		String[] startYMD = startDay.split("-");
		int[] startYmdInt = new int[3];
		
		for(int i=0; i<3; i++){
			startYmdInt[i] = Integer.parseInt(startYMD[i]);
		}
		
		cal.set(startYmdInt[0], startYmdInt[1]-1, startYmdInt[2]);
		
		int startWeek = cal.get(Calendar.DAY_OF_WEEK);
		
		
		
		System.out.println(" �� �� ? ");
		String xDay = br.readLine();
		
		System.out.printf("���� : %tF %s\n", cal, week[startWeek-1]);
		
		int x = Integer.parseInt(xDay);
		x--;
		cal.add(Calendar.DATE, x);
		int endWeek = cal.get(Calendar.DAY_OF_WEEK);
		
		
		System.out.printf("%d�� ° : %tF %s", (x+1), cal, week[endWeek-1]);
	}

}