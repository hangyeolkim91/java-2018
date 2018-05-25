package com.day6;

import java.util.Random;
import java.util.Scanner;

public class NumberGame {
	
	private int correctNumber;
	private int numOfTry;
	private int rangeOfNumber;
	private int userNumber;
	
	public void set(){
		
		rangeOfNumber = 10;
		numOfTry = 3;
		Random rd = new Random();
		correctNumber = rd.nextInt(rangeOfNumber) +1;
		
	}
	
	public void set(int ron, int numot){
		rangeOfNumber = ron;
		numOfTry = numot;
		Random rd = new Random();
		correctNumber = rd.nextInt(rangeOfNumber) +1;
	}
	
	public boolean isCorrect(int userNum){
		if( userNum == correctNumber ){
			return true;
		}else{
			return false;
		}
	}
	
	public void start(){
		Scanner sc = new Scanner(System.in);
		while(true){
			String cmd ;
			System.out.print("default or manual or end?");
			cmd = sc.next();
			if( cmd.equalsIgnoreCase("default") ){
				set();
			}else if(cmd.equalsIgnoreCase("manual")){
				System.out.println("input range of number?");
				int ron = sc.nextInt();
				System.out.println("input number of try?");
				int not = sc.nextInt();
				
				set(ron,not);
			}else{
				break;
			}
			
			for(int i=0; i<numOfTry; i++){
				System.out.print("�����Է�?["+(i+1)+"��° ��ȸ!]");
				userNumber = sc.nextInt();
				if( isCorrect(userNumber)){
					System.out.println("�¾Ҿ��!!");
					break;
				}else{
					System.out.println("Ʋ�Ⱦ��!!");
				}
			}
			
			System.out.println("\n������ " + correctNumber + "�Դϴ�.");
			
			System.out.print("\n����ҷ�?[y/n]");
			cmd = sc.next();
			if( !cmd.equalsIgnoreCase("y") ){
				
				break;
			}
			System.out.println("---------------------------------");
		}
	}
	


}