package org.tnsindia.exceptiondemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileNotFoundExceptionDemo {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=null;
		//opening a file
		fis=new FileInputStream("C:\\Users\\LOHITH SB\\Downloads");
        int k;
        
        while((k=fis.read())!=-1);
        {
        	System.out.println((char)k);
        }
        fis.close();
	}

}
