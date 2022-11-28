package org.tnsindia.abstractdemo;

public class EmployeepersonExecutor {

	public static void main(String[] args) {
		Person p1=new Employee("Nitheen","Male",21);
		Person p2=new Employee("Ajith","Male",-21);
		
		//to return the data that we inserted
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		p1.work();
		p2.work();


	}

}
