package com.class6;

interface FruitA{
	
	String Won = "��";
	
	public  int getPrice();
	public String getName();
}

interface ItemFruit extends FruitA{
	
	public String getItems();
}

class Orange implements ItemFruit{

	@Override
	public int getPrice() {
		return 1000;
	}

	@Override
	public String getName() {
		return "������";
	}

	@Override
	public String getItems() {
		return "����";
	}
	
}

class Apple implements ItemFruit{

	@Override
	public int getPrice() {
		return 2000;
	}

	@Override
	public String getName() {
		return "���";
	}

	@Override
	public String getItems() {
		return "����";
	}
	
	
}

public class Test5 {

	public static void main(String[] args) {

		Orange ob1 = new Orange();
		System.out.println(ob1.getItems());
		System.out.println(ob1.getName());
		System.out.println(ob1.getPrice() + FruitA.Won);
		
		Apple ob2 = new Apple();
		System.out.println(ob2.getItems());
		System.out.println(ob2.getName());
		System.out.println(ob2.getPrice() + FruitA.Won);
		
		int a = 10;
		System.out.println(a);
		
		a = 20;
		System.out.println(a);
		
		
		//----------------------------------------------------------
		ItemFruit[] fa = {ob1, ob2};
		
		for( ItemFruit f : fa){
			System.out.println(f.getItems() + " " + f.getName() + " " + f.getPrice() + FruitA.Won);
		}
	}

}