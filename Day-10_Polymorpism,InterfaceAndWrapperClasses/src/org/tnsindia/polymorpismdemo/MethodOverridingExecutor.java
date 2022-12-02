package org.tnsindia.polymorpismdemo;

public class MethodOverridingExecutor {

	public static void main(String[] args) {
		MethodOverridingChild m=new MethodOverridingChild();
		MethodOverridingExample m1=new MethodOverridingChild();
		System.out.println(m.mul(10,20));//child class method
		System.out.println(m1.mul(20, 30));//parent class method


	}

}
