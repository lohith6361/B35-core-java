package org.tnsindia.collectiondemo;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		Vector<Integer> v=new Vector<>();
		v.add(10);
		v.add(1,20);
		v.add(2,30);
		v.add(3,40);
		v.add(4,50);
		System.out.println(v);
		
		for(Integer itr:v)
		{
			System.out.print(itr+",");
		}
		}

}
