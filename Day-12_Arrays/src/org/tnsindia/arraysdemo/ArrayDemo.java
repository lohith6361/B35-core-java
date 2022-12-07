package org.tnsindia.arraysdemo;
//Demo on arrays
public class ArrayDemo {

	public static void main(String[] args) {
		//multiple ways to dclare and initialize the array
		int[] arr= {12,23,34,45,56};
		char []arr1= {'a','B','c','d'};
		
		//the value inside the arr1 is char but the type is int so it will convert into ascii value
		int []arr11= {'a','B','c','d'};
		float arr2[]= {20.4f,30.6f,40.7f,50.9f};
		int arr3[]=new int[4];
		arr3[0]=56;
		arr3[1]=67;
		arr3[2]=78;
		arr3[3]=89;
		
		System.out.println("The array elements are: "+arr[3]);
		System.out.println("The array elements are: "+arr1[1]);
		System.out.println("The array elements are: "+arr11[1]);
		
		System.out.println("The array elements are: "+arr2[2]);
		//to print all the array elements using enhanced(foreach) for loop
		for(int itr:arr3)
		{
			System.out.println(itr+"");
		}
		System.out.println();
		//to print all the array elements using for loop
		for(char i=0;i<arr.length;i++)
		{
			System.out.print(arr1[i]+ " ");
		}
	}

}
