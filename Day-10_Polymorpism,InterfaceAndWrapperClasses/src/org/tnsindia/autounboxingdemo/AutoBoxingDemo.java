package org.tnsindia.autounboxingdemo;
//demo no auto boxing
public class AutoBoxingDemo {

	public static void main(String[] args) {
		char c='h';
		//converting primitive to Object-type
		Character ch=c;
		System.out.println(ch);
		System.out.println(ch.getClass().getName());


	}

}
