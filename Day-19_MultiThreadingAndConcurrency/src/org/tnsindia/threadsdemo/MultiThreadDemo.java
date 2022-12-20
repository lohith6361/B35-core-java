package org.tnsindia.threadsdemo;
class MyThread extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			try {
				Thread.sleep(2000);
				System.out.println("Squares of the num:"+(i*i));
			}catch (InterruptedException e1) {
					System.out.println("Exception handeled");	
			}
		}
	}
}

class AnotherThread extends Thread 
	{
		public void run()
		{
			for(int i=0;i<5;i++)
			{
				try {
					Thread.sleep(2000);
					System.out.println("Doubles of the num:"+(i*2));
				}catch (InterruptedException e1) {
						System.out.println("Exception handeled");	
				}
			}
		}
	}
	public class MultiThreadDemo  {

	public static void main(String[] args) {
     AnotherThread t=new AnotherThread();
		t.start();

	}

}
