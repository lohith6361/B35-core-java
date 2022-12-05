package org.tnsindia.stringdemo;



//Demo on how to create  a string 
public class StringExample {

	public static void main(String[] args) {
		//by using string literal
				String str1="Welcome to TNS India Foundation";
				String str2="Welcome to TNS India Foundation";
				//by using new keyword
				String name=new String("Welcome to Java Full Stack");
				String name1=new String("Welcome to Java Full Stack");

				System.out.println(str1==str2);
				//we cannot concat any null string
				System.out.println(str1.concat(name));
				System.out.println(name==name1);
				System.out.println(name.equals(name1));//true

				System.out.println(name==str1);
				/*before any strings if there is any two number or more than that
				 * then it will perform addition but after any string is there is any numbers
				 * then it performs concatenation.
				 */
				System.out.println(64+80+75+"Hello"+70+40+50);
				/*Scanner s=new Scanner(System.in);
				System.out.println("Enter the first-set String");
				
				//by using new keyword
				String str1=s.nextLine();
				String str11=s.nextLine();
				
				//by using new keyword
				/*System.out.println("Enter the Second-set String");
				String str2=new String(s.nextLine());
				String str22=new String(s.nextLine());
				System.out.println(str1);
				
				System.out.println(str2);
				
				//System.out.println(str1==str2);
				System.out.println(str1==str11)*/


	}

}
