package org.tnsindia.decisionmaking;

import java.util.Scanner; 

public class Example_4 {

	public static void main(String[] args) {
		//Switch
		Scanner s=new Scanner(System.in);
		char a=s.next().charAt(0);
		switch(a)
		{
		case 'a':
		System.out.println("Raju");
		break;
		case 'b':
		System.out.println("Hello");
		break;
		case 'c':
		System.out.println("sita");
		break;
		default:
			System.out.println("Invalide input");
		s.close();
		}

	}

}
