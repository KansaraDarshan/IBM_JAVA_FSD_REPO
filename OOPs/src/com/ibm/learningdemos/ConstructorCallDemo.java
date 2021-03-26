package com.ibm.learningdemos;
class Alfa{
	public Alfa() {
		// TODO Auto-generated constructor stub
		System.out.println("Alfa Constructor");
	}
	public void demo()
	{
		System.out.println("Alfa Demo");
	}
}

class Beta extends Alfa{
	public Beta() {
		// TODO Auto-generated constructor stub
		System.out.println("Beta Constructor");
	}
	public void test()
	{
		System.out.println("Beta Test");
	}
	public void demo()
	{
		System.out.println("Beta Demo");
	}
}


public class ConstructorCallDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alfa a=new Alfa();
		a.demo();
		//Beta bt=(Beta)a; will create an error
		System.out.println();
		Beta b =new Beta();
		b.demo();
		System.out.println();
		Alfa ab=b;//Up-Casting(Impilicit)
		ab.demo();
		//ab.test(); this will crt error coz parent class refernce cant access child class members
		System.out.println();
		Beta ba=(Beta)ab;//Down-casting (Explicit)
		ba.demo();
		ba.test();
		
	}

}
