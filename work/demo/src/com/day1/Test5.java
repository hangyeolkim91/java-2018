package com.day1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Test5 {
	public static void main(String[] args) throws IOException{
		
		// �̸� , ����, ��������, ���� ���

		// 1. ����

		String name;
		int kor,eng,tot;
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in));
		// java.lang �� �⺻������ vm��  import �س��� -> System.in�� import���ص� �Ǵ� ����
		
		// 2. �Է�

		System.out.print("�̸�? ");
		name = br.readLine();

		System.out.print("��������? ");
		kor = Integer.parseInt(br.readLine());

		System.out.print("��������? ");
		eng = Integer.parseInt(br.readLine());

		//System.out.println("�̸� : " + name + " �������� : " + kor + " ��������: " + eng );

		// 3. ����

		tot = kor + eng;

		// 4. ���

		//System.out.println("���� : "  + tot);
		System.out.printf(" �̸� : %s  ���� : %d  \n", name, tot);

	}
}
