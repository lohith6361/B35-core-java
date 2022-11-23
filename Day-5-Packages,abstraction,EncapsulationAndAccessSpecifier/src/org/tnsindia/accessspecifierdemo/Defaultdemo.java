package org.tnsindia.accessspecifierdemo;

public class Defaultdemo {
	
	//default data member
	
	/*if any var,method,constructor or class is a default
	 * then we can access this only inside the same package*/
	int speed;

	//constructor
	Defaultdemo(int speed) {
		super();
		this.speed = speed;
	}

	
	//method
	void display()
	{
		System.out.println("The speedn is: "+speed);
	}

}