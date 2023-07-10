package com.mouni.OopsPrograms;
class C{
	public C(){
		System.out.println("No Argument Constructor A");
		
	}

}
class D extends C{
	public D() {
		super();
		System.out.println("No Argument Constrctor B");
	}

}

public class CallToSuper {

	public static void main(String[] args) {
		D d=new D();
		

	}

}
