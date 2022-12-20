package org.tnsindia.threadsdemo;

//Runnable interface-Functional Interface
class MyRunnable implements Runnable
{

	@Override
	public void run() {
		for(int x=1;x<5;x++)
		{
			System.out.println(Thread.currentThread().getName());
		}
		
	}
	
}
//driver class
public class MultiThreadingExample {

	public static void main(String[] args) {
		MyRunnable t1=new MyRunnable();
		Thread t=new Thread(t1);
		
		t.start();Thread tt=new Thread(t1);
		
		tt.start();
	}

}
