package com.class2;

// static
// �ڱⰡ �˾Ƽ� �޸𸮷� �ö�
// �ν��Ͻ� 1000���� ���� �޸� ������ �Ѱ��� ���



public class Test2 {

	public static int a = 10;  // class ����
	// Ŭ���� ������ Ŭ���� �޼ҵ��  ���α׷��� �ε� �Ǵ¼��� 
	// �޸� �Ҵ� �� [Ŭ�����̸�.��ü�̸�]���� ���� ����
	// �� new�� ������� �ʰ� �ٷ� ��� �� �� �ִ�.
	
	private int b = 20;       //instance ����
	// ������ Ŭ������ instance �޼ҵ� �ȿ��� �ٷ� ������ ���� ������
	// Ŭ���� �޼ҵ忡���� ���� �� �� ����.
	// Ŭ���� �޼ҵ忡�� �����ϱ����ؼ��� new�� ���� 
	// ��ü�� �����ϰ� ��ü �̸����θ� ������ �����ϴ�.
	
	// instance �޼ҵ�
	public void write(){ 
		
		System.out.println("class ���� : " + a);
		System.out.println("instance ���� : "+ b);
		
	}
	
	//class �޼ҵ�
	public static void print(){
		
		System.out.println("class ���� : " + a);
		
		//System.out.println("instance ���� : "+ b); �Ұ�����
	}
	
	//class �޼ҵ�
	public static void main(String[] args) {
		
		System.out.println("class ���� a : " + a);
		
		System.out.println("class ���� Test2.a" + Test2.a);
		
		Test2.print();
		
		Test2 ob1 = new Test2();
		
		System.out.println("instance ���� : " + ob1.b);
		
		ob1.write();
		
		//ob1.print(); class method, class var�� �̷������δ� ������� �ʴ´�.(���� o)
		//ob1.a;
		
		/*Test2 ob = new Test2();
		ob.main(args);*/
		
		Test2 ob2 = new Test2();
		ob2.a = 100;
		ob2.b =200;
		System.out.println("ob2 ---------------------------------");
		ob2.write();
		ob2.print();
		
		Test2 ob3 = new Test2();
		System.out.println("ob3 ---------------------------------");
		ob3.write();
		ob3.print();
		
		
	}

}
