package org.tnsindia.constructordemo;

//driver class
public class ConstructorExecutor {

	public static void main(String[] args) {
		
		
		//object creation
		Employee e=new Employee();
		Employee e1=new Employee(60000,"Lohith");
		Employee e2=new Employee(65000,"Yash");

		e1.print();
		e2.print();

	}

}