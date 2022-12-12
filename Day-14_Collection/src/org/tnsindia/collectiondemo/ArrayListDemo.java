package org.tnsindia.collectiondemo;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<Character>Obj=new ArrayList<>(3);
		Obj.add('H');
		Obj.add('I');
		Obj.add('J');
		Obj.add('K');
		
		System.out.println("The Collection elements are:"+Obj);

	}

}
