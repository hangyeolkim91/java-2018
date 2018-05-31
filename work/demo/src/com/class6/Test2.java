package com.class6;


class SuperTest{
	
	public int a =10, b=20;
	
	public void write(){
		System.out.println("����Ŭ���� write() �޼ҵ�");
	}
	
	public int hap(){
		return a+b;
	}
}

class SubTest extends SuperTest{
	
	public int b=100, c=200;
	
	public void print(){
		System.out.println("���� Ŭ���� print() �޼ҵ�");
	}
	
	@Override
	public int hap() {
		return a+b+c;
	}
}

public class Test2 {

	public static void main(String[] args) {
		
		SuperTest parent = new SuperTest();
		
		SuperTest st = new SubTest();
		
		SubTest child = (SubTest) st;
		
		
		
		child.print();
		child.write();
		
		parent.write();
		System.out.println("parent.hap()" + parent.hap());
		
		System.out.println("st.hap()"+st.hap());
		System.out.println("child.hap()" + child.hap());
		

		
	}

}