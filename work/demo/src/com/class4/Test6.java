package com.class4;

public class Test6 {

	public static void main(String[] args) {

		String s1 = "����,�λ�,�뱸";
		String[] ss = s1.split(",");
		
		for(String s : ss ){
			System.out.println(s);
		}
		
		String s2 = "seoul";
		String s3 = "SEOUL";
		
		System.out.println(s2.equals(s3));
		System.out.println(s2.equalsIgnoreCase(s3));
		
		String s4 = "abc.def.hij";
		System.out.println(s4.indexOf("."));
		System.out.println(s4.lastIndexOf("."));
		System.out.println(s4.indexOf("def"));
		System.out.println(s4.indexOf("x"));
		
		String s5 = "�츮���� ���ѹα� �������� ���ѹα�";
		String s6 = s5.replaceAll("����", "����");
		
		String s7 = "  a  b  c  ";
		System.out.println(s7);
		System.out.println(s7.trim());
		System.out.println(s7.replaceAll(" ", ""));
		System.out.println(s7.replaceAll("\\s", ""));
		
		char ch = "abcdefg".charAt(2);
		
		System.out.println(ch);
		
		System.out.println("abcdefg".startsWith("habc"));
		System.out.println("abcdefg".startsWith("abc"));
		
		System.out.println("abcdefg".length());
		
		String s8 = "abcdefg"; // 101 
		String s9 = "abcddfg"; // 100
		
		//unicode �������� ������ �迭 �Ҷ�
		System.out.println(s8.compareTo(s9));
		System.out.println(s9.compareTo(s8));
		
	}

}