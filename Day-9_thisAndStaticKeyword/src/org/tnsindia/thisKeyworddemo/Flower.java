package org.tnsindia.thisKeyworddemo;
//2.It can be used to invoke or initiate current class constructor

public class Flower {
	
	//private data member
	private String name;
	
	
	
	//gettersand setters
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}
	
	//default constructor
	public Flower() {
		super();
		//TODO Auto-generated constructor stub
	}
//parameterized constructor
	
	public Flower(String name) {
		this.name=name;
	}
}
