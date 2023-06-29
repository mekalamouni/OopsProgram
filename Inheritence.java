package com.mouni.inheritence;
class A {
	public void m1() {
		System.out.println("m1 method is excute");
		
	}
	
}
class B extends A{
	public void m2() {
		System.out.println("m2 method is excute");
		
	}
	
}

public class Inheritence {

	public static void main(String[] args) {
		B b=new B();
		b.m1();
		b.m2();
		

	}

}
