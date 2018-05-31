package com.class6;

/*
 *  Interface
 *  1. �߻� Ŭ������ ���� ���� �ְ� ����(����)�� ����.
 *  2. final������ ���� �� �� �ִ�.
 *  3. �������̽��� �����ϱ� ���ؼ��� implements�� ����Ѵ�.
 *  4. �ϳ��̻��� �������̽��� ���� �� Ŭ������ �������̽��� 
 *  ��� �޼ҵ带 ����(override)�ؾ� �Ѵ�.
 *  5. �������̽��� �������̽��� ��� ���� �� ������ �̶� extends
 *  Ű���带 ����Ѵ�.
 *  6. �������̽��� ���� ����� �����ϴ�.
 *  7. �������̽��� ������̴�.
 *  8. ���������� �����ϴ�.
 */

interface Fruit{
	
	String Won = "��"; // public static final�� ���� (���)
	
	int getPrice();    // public abstract ���� 
	
	public String getName();
}

class FruitImpl implements Fruit{

	@Override
	public int getPrice() {
		return 1000;
	}

	@Override
	public String getName() {
		return "���";
	}
	
	public String getItems(){
		return "����";
	}
	
	
}

class BananaFruitImpl implements Fruit{

	@Override
	public int getPrice() {
		return 2000;
	}

	@Override
	public String getName() {
		return "banana";
	}
	
	public String getItems(){
		return "����";
	}
	
}

public class Test3 {

	public static void main(String[] args) {

		FruitImpl ob = new FruitImpl();
		
		//System.out.println(ob.getItems() + " : " + ob.getName() + " : " + ob.getPrice() + Fruit.Won);
		
		//Fruit ob2 = new FruitImpl();
		
		Fruit[] ob2 = { new FruitImpl(), new BananaFruitImpl() };
		
		//System.out.println(ob2.getItems());
		
		//System.out.println(((FruitImpl) ob2).getItems());
		
		for(Fruit f : ob2){
			System.out.println( f.getName() + " : " + f.getPrice() + Fruit.Won);
		}
		//System.out.println(((FruitImpl) ob2).getItems() + " : " + ob2.getName() + " : " + ob2.getPrice() + Fruit.Won);
	}

}