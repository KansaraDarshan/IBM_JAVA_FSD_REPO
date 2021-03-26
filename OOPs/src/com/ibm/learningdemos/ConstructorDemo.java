package com.ibm.learningdemos;

public class ConstructorDemo{
	private String name;
	private int age;
	public ConstructorDemo()
	{
		this("Anonnymous",-1);
	}

	public ConstructorDemo(String name, int age) {
		
		this.name = name;
		this.age = age;
	}
	
	
	public void print()
	{
	  System.out.println("name:"+name+"\t age:"+age);	
	}
	public static void main(String[] args) {
		ConstructorDemo p1=new ConstructorDemo("darsh",22);
		
		p1.print();
		ConstructorDemo p2=new ConstructorDemo();
		p2.print();
	}
	}


