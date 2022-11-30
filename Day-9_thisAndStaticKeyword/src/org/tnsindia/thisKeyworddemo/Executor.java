package org.tnsindia.thisKeyworddemo;
//driver class
public class Executor {

	public static void main(String[] args) {
		Account a=new Account();
		a.accept(23456,"Saving Account");
		a.display();
		
		
		Flower f=new Flower();
		f.setName("Rose");
		System.out.println("Flower is:"+f.getName());
		 
		Vehicle v=new Vehicle();
		v.speed=75;
		v.display2();
		
		Food f1=new Food();
		f1.get1();
		
		Color c=new Color();

	}

}
