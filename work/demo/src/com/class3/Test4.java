package com.class3;

// �Ǻθ� �Լ�
// �ڵ尡 ��������
// ó�� �ӵ��� ���� (stack ������ �����͸� �����ߴ� ����ϱ� ����)


public class Test4 {

	public void print(int n){
		if(n != 1){
			
			print(n-1);
		}
		
		System.out.printf("%5d", n);
	}
	
	public int sum(int n){
		return n>1? n+sum(n-1) : n;
		
	}
	
	public int pow(int a, int b){
		return b>=1 ? a*pow(a,b-1) : 1;
	}
	
	public static void main(String[] args) {

		Test4 ob = new Test4();
		ob.print(10);
		System.out.println();
		System.out.println(ob.sum(10));
		System.out.println();
		System.out.println("ob.pow(2,10) : " + ob.pow(2,10));
	}

}