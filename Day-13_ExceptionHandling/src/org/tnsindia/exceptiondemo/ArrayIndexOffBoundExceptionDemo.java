package org.tnsindia.exceptiondemo;
//Demo on ArrayIndexOutOfBoundException
public class ArrayIndexOffBoundExceptionDemo {

	public static void main(String[] args) {
		System.out.println("First line");
		System.out.println("Second line");
        try {
        	int[] myIntArray =new int[] {1,2,3};
        	print(myIntArray);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
        	System.out.println("Exception Handled"+e);

        }
        /*if any statement is outside the try-catch block that is always executed*/
    	System.out.println("Outside try-catch block");
        //Finally block is followed by the catch block
       /* Finally block is always executed whether any exception occured or not*/
        /*finally
        {
        	System.out.println("Finlly Block is always executed");

        }
        System.out.println("Outside try-catch block");*/

	}

	private static void print(int[] arr) {
		System.out.println(arr[3]);
		System.out.println("Fourth element sucessfully displayed!");

		
	}

}
