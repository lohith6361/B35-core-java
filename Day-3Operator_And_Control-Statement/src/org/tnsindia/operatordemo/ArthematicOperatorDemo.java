package org.tnsindia.operatordemo;

import java.util.Scanner;

//demo on Arithmetic operator
public class ArthematicOperatorDemo {

	public static void main(String[] args) {

				Scanner s=new Scanner(System.in);
				System.out.println("Enter the value of a and b:");
				int a=s.nextInt();
				int b=s.nextInt();
				System.out.println("The addition is: "+(a+b));
				System.out.println("The substraction is: "+(a-b));
				System.out.println("The multiplication is: "+(a*b));
				System.out.println("The division is: "+(a/b));
				System.out.println("The moduls is: "+(a%b));
				s.close();

}

}
