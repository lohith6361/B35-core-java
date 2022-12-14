package org.tnsindia.streamapidemo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class BasicStreamDemo {

	public static void main(String[] args) {
		Stream<String>obj=Stream.of("Raju","Ropesh","Rakesh");
		//for-each-terminal opearation
		obj.forEach((i)->System.out.print(i+ " "));
		
		System.out.println();
		//A stream can be obtained from sources like arrays or collections using “stream” method 
		//To obtain steam from array, use java.util.Arrays class
		List<Integer>obj1=Arrays.asList(new Integer[]{43,53,4});
		obj1.forEach((i)->System.out.print(i+ " "));
		
		System.out.println();

		Set<String>obj2=new HashSet<>();
		obj2.add("jack");
		obj2.add("job");
		obj2.add("rob");
		System.out.println(obj2);
		obj2.forEach((i)->System.out.print(i+ " "));

		/*for(String str:obj2)
		{
			System.out.println(str);
		}*/

	}

}
