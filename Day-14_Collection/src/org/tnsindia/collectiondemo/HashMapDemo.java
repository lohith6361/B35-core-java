package org.tnsindia.collectiondemo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
//demo on hashMap
//HashMap prints the value in an unordred manner and LinkedHashMap prints an ordered wise
//TreeMap print the entries according to ascending orders of keys
public class HashMapDemo {

	public static void main(String[] args) {
		Map<Integer,String>obj=new TreeMap<>();
		//Map<Integer,String>obj=new HashMap<>();
		//Map<Integer,String>obj=new LinkedHashMap<>();
		obj.put(1001, "Nitheen");
		obj.put(1007, "Harish");
		obj.put(2001, "Chetan");
		obj.put(1002, "Ajith");
		System.out.println(obj);
		
		obj.remove(2001);//it removes the entire entry for key 1005
		System.out.println(obj);
		//to extract the entry from a map
		for(Map.Entry m:obj.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}

	

	}

}
