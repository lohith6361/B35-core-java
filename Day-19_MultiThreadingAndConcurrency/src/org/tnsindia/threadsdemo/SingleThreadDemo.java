package org.tnsindia.threadsdemo;

class Parent
{
	public void squareNum() throws InterruptedException
	{
		for(int i=0;i<55;i++)
		{
			Thread.sleep(2000);
			System.out.println("Squares of the num:"+(i*i));
		}
	}
}
class Child
{
	public void doubleNum() throws InterruptedException
	{
		for(int i=0;i<5;i++)
		{
			Thread.sleep(2000);
			System.out.println("Double of the num:"+(i*2));
		}
	}
}
//Driver class
public class SingleThreadDemo {

	public static void main(String[] args) {
		System.out.println("Main Method...");
		Parent p=new Parent();
		Child c=new Child();
		try {
			p.squareNum();
		} catch (InterruptedException e1) {
			System.out.println("Exception handeled");	
		}
	}
	}