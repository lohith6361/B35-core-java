package org.tnsindia.polymorpismdemo;

public class MethodOverloadingExample {
	
	//method overloading
	//1.By changing the no.f arguments
	public void addition(int x,int y)
	{
		System.out.println("The addition of x and y is:"+(x+y));
	}
	public void addition(int x,int y,int z)
	{
		System.out.println("The addition of x,yand z is:"+(x+y+z));
	}
	

}
