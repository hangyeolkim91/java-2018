package com.day6;

import java.util.Scanner;

public class TestCom {

	public int w,h; //�������� ,  instance����
	
	
	public void input(){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����?");
		w = sc.nextInt();
		
		System.out.print("����?");
		h = sc.nextInt();
		
		
		
		//sc.close();
		
		//return;
	}
	
	public int area(){
		
		int result;
		
		result = w * h;
		
		return result;
	}
	
	public int length(){
		
		
		return 2*(w + h );
	}
	
	public void print(int b, int c){
		
		System.out.println("���� : " + w);
		System.out.println("���� : " + h);
		
		System.out.println("���� : " + b);
		System.out.println("�ѷ� : " + c);
	}
	
}