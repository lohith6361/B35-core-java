package org.tnsindia.datatype;

import java.util.Scanner;

//demo on user -input for integer
public class userinputdemo {

	public static void main(String[] args) {
		//@SuppressWarnings("resource")
				Scanner s=new Scanner(System.in);
				
				System.out.println("Enter the number: ");
				int x=s.nextInt();
				
				System.out.println("Enter the number: ");
				float y=s.nextFloat();
				
				System.out.println("Enter the char: ");
				char c=s.next().charAt(0);//"lohith"//s
				//char c=s.next().charAt(1);//h

				System.out.println("Enter the String:");
				String str=s.nextLine();
				String str1=s.next();
				
				
				System.out.println("The output is: ");
				System.out.println("The integer is: "+x);
				System.out.println("The decimal is: "+y);
				System.out.println("The character is: "+c);
				System.out.println("The String is: "+str);
				System.out.println("The String is: "+str1);
				s.close();
	}

}
