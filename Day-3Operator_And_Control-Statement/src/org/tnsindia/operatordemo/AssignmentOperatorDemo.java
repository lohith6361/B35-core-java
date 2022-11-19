package org.tnsindia.operatordemo;

//Demo on Assignment Operator

import java.util.Scanner;

public class AssignmentOperatorDemo {

	public static void main(String[] args) {
			
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the value of a and b:");
			int a=s.nextInt();
			int b=s.nextInt();
			a*=b;
			System.out.println("the value of a is:"+a);
			s.close();

	}

}
