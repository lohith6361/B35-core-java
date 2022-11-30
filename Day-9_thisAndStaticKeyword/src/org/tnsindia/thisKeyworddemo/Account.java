package org.tnsindia.thisKeyworddemo;
//1.this Keyword can be used to refer instance variable of current class
public class Account {
	
	//data members
	private long account_no;
	private String account_type;
	
	public void accept(int account_no,String account_type)
	{
		this.account_no=account_no;
		this.account_type=account_type;
	}
	public void display()
	{
		System.out.println("Account no is:"+account_no+" "
				+"Account Type is: "+account_type);
	}

}
