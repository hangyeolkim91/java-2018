package com.day1;

class Test3 
{
	public static void main(String[] args) 
	{
		int r = 10;
		float area, length; // �Ǽ�
		
		area = r * r * 3.14f;
		length = 2 * 3.14f * r;

		System.out.printf( "������: %d, ���� : %.2f\n", r,area);// %g �� double��
		System.out.printf( "������: %d, ���� : %f\n", r,area);
		System.out.println( "area = " + area);
		System.out.println( "�ѷ� : " + length);// 62.800003 �� 3�� ������ ���� ���� �����Ⱚ 
		
		System.out.println();
		//System.out.print(); error �ݵ�� �Ű������� �ʿ��� �Լ�
	}
}
