package com.homework;

import java.util.Scanner;

public class Score {

	private int numOfStudents;
	private String[] subjects = {"���� ?", "���� ?", "���� ?"};
	private Grade[] g;
	private Scanner sc = new Scanner(System.in);
	
	public void set(){
		System.out.print("�ο� ��?");
		numOfStudents = sc.nextInt();
		
		g = new Grade[numOfStudents];
		
	}
	
	public void input(){
		
		for(int i=0; i<numOfStudents; i++){
			g[i] = new Grade();
			
			System.out.print((i+1) + "��° �̸� ?");
			g[i].name = sc.next();
			
			for(int j=0; j<3; j++){
				System.out.print(subjects[j]);
				g[i].score[j] = sc.nextInt();
				g[i].total +=g[i].score[j];
				
				g[i].level[j] = makeLevel(g[i].score[j]);
				
			}
			g[i].avg = g[i].total/3;
			
		}
	}
	public void printGrade(){
		
		for(int i=0; i<numOfStudents; i++){
			System.out.print(g[i].name + " ");
			for(int j=0; j<3; j++){
				System.out.print(g[i].score[j] +""+g[i].level[j]+" ");
			}
			System.out.println(g[i].total+ " "+ g[i].avg);
		}
	}
	private String makeLevel(int score){
	
		if(score >= 90){
			return "(��)";
		}else if(score >= 80){
			return "(��)";
		}else if(score >= 70){
			return "(��)";
		}else if(score >= 60){
			return "(��)";
		}else{
			return "(��)";
		}
	}
}