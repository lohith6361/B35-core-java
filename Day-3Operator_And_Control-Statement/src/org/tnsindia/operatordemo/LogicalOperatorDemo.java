package org.tnsindia.operatordemo;

//Demo on Logical Operator

import java.util.Scanner;

public class LogicalOperatorDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of age and weight:");
		int age=s.nextInt();
		int weight=s.nextInt();
		//to donate the blood age>18 and weight>50
		boolean result1=(age>22)&&(weight>75);
		boolean result2=(4==8)||(63>40);
		boolean result3= !(age==weight);
		System.out.println("the result is: "+result1);
		System.out.println("the result is: "+result2);
		System.out.println("the result is: "+result3);
		s.close();

	}

}
