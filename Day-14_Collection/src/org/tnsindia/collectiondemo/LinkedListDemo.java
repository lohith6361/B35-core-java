package org.tnsindia.collectiondemo;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<Character>Obj=new LinkedList<Character>();
		Obj.add('P');//0
		Obj.add('S');//1st index
		Obj.add('R');//2nd index
		Obj.add('S');//3rd index
		Obj.add('T');//4th index
		List<Character>Obj1=new LinkedList<>();
		System.out.println(Obj1.isEmpty());
		System.out.println(Obj.isEmpty());
		System.out.println(Obj.contains('T'));
		
		
		System.out.println("The Collection elements are:"+Obj);
		//size of the list
		System.out.println("The total elements are:"+Obj.size());
		System.out.println("The index of given element are:"+Obj.indexOf('S'));
		System.out.println("The last index is:"+Obj.lastIndexOf('S'));
		
		System.out.println("The Collection elements are:"+Obj.get(1));

	}

}
