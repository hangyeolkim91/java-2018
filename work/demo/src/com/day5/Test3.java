package com.day5;

import java.util.Arrays;
import java.util.Random;

public class Test3 {

	public static void main(String[] args) {

		//1 ~ 45������ ������ �߻����� 6���� ���� ũ�� ������ ����
		
		Random rd = new Random();
		
		int[] num = new int[6];
		int n,temp;
		n=0;
		while(n<6){
			
			num[n] = rd.nextInt(45)+1;
			
			
			
			for(int i=0; i<n; i++){
				if(num[i] == num[n]){
					n--;
					break;
				}
			}
			
			n++;
			
		}
		
		for( int nu : num){
			System.out.println(nu);
		}
		
		for(int i=0; i<n; i++){
			for( int j=1; j<n-i; j++){
				if(num[j] < num[j-1]){
					temp = num[j-1];
					num[j-1] = num[j];
					num[j] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(num));
	}

}
