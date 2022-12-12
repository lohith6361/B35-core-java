package org.tnsindia.collectiondemo;

import java.util.ArrayList;
import java.util.Collection;
//demo on collection interface
public class DemoOnCollectionInterface {

	//@SuppressWarnings("Unchecked")
	public static void main(String[] args) {
		// collection is an interface we can't instantiate it
		//@SuppressWarnings("rawtypes")
		Collection<Object> Obj=new ArrayList<>();
		Obj.add("FullStack");
		Obj.add(52);
		Obj.add('g');
		Obj.add(12.9f);
		System.out.println("The Collection elements are;"+Obj);
		//to extract the elements from ArrayList
		for(Object itr:Obj)
		{
			System.out.print(itr+" ");
		}

	}

}
