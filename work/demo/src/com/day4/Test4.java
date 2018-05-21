package com.day4;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {

		// ��, ��, �� �Է� �޾� ������ ��ȯ
		// 2018�� 5�� 21�� ������

		

		Scanner sc = new Scanner(System.in);

		// ���� ��¥���� ����

		int months[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		String days[] = {"�Ͽ���", "������", "ȭ����", "������", "�����", "�ݿ���", "�����"};

		int y, m, d, nalsu = 0, week;

		do {
			System.out.print("�⵵?");
			y = sc.nextInt();
		} while (y < 1);

		do {
			System.out.print("��?");
			m = sc.nextInt();
		} while (m < 1 || m > 12);
		
		do {
			System.out.print("��?");
			d= sc.nextInt();
		} while (d < 1 || d > 32);

		if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0) {
			months[1] = 29;
		}

		nalsu = (y - 1) * 365 + (y - 1) / 4 - (y - 1) / 100 + (y - 1) / 400;

		// ���� m-1
		for (int i = 0; i < m - 1; i++) {
			nalsu += months[i];
		}

		// y�� m�� d�ϱ����� �� ��
		nalsu += d;

		week = nalsu % 7; // 0~6
		
		System.out.println(y+"�� "+ m+ "�� "+ d +"�� " + days[week]);

/*		System.out.println("\n  ��  ��  ȭ  ��  ��  ��  ��");
		System.out.println("------------------------------");

		// Ư�� ���Ϻ��� �����ϵ��� ��������
		for (int i = 0; i < week; i++)
			System.out.print("    ");

		// �ش� ���� ��¥�� ���
		for (int i = 1; i <= months[m - 1]; i++) {
			System.out.printf("%4d", i);

			week++;
			if (week % 7 == 0)
				System.out.println();
		}

		if (week % 7 != 0)
			System.out.println();
		System.out.println("------------------------------");*/

	}

}
