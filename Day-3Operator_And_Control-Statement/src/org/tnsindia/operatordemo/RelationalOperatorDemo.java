package org.tnsindia.operatordemo;

//Demo on Relational Operator

import java.util.Scanner;

public class RelationalOperatorDemo {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		boolean res=(a==b);
		System.out.println("the result is:"+res);
		s.close();
 }

}
