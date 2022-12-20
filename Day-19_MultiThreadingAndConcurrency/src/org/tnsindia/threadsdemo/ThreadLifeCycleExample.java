package org.tnsindia.threadsdemo;

public class ThreadLifeCycleExample implements Runnable{

	public static void main(String[] args) {
		Thread t1=new Thread();
		t1.start();
		/*if any thread is in the running stste then you can't again use start() state*/
		//t1.start();
		
		try {
			t1.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("Exception handeld"+e);
		}
		t1.setPriority(3);
		int priority=t1.getPriority();
		System.out.println(priority);

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
