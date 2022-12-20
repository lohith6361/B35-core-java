package org.tnsindia.threadsdemo;

public class SynchronizedMethodDemo {
	
	synchronized void arraynum(int[] arr)
	{
		int num=0;
		for(int itr:arr)
		{
			System.out.println(Thread.currentThread().getName());
		}
		try {
			Thread.sleep(500);
		}catch(InterruptedException e) {
			throw new RuntimeException(e);
		}
	}
	

}
