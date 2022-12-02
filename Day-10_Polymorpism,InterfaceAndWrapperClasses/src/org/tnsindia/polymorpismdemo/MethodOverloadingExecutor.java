package org.tnsindia.polymorpismdemo;
//driver class
public class MethodOverloadingExecutor {

	public static void main(String[] args) {
		//Object creation
		MethodOverloadingExample m=new MethodOverloadingExample();
		//method calling
		m.addition(12, 10);
		m.addition(34, 20, 9);
		
		System.out.println();
		
		//Object creation
		MethodOverloading m1=new MethodOverloading();
		//method calling
		m1.addition(33, 40);
		m1.addition(35.6f, 46);


	}

}
