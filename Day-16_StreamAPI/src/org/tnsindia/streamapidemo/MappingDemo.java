package org.tnsindia.streamapidemo;

import java.util.Arrays;
import java.util.List;
//Example on Map() operation
public class MappingDemo {

	public static void main(String[] args) {
		List<String>obj1=Arrays.asList(new String[]{"Ganesh","Sai","Rajana"});
		obj1.stream().map(i->i.length()).forEach((i)->System.out.print(i+ " "));

	}

}
