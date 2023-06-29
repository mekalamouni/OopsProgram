package com.mouni.inheritence;
class D{
	public void m1() {
		System.out.println("m1 class");
	}
	
} 
class E extends D{
	public void m2() {
		System.out.println("m2 class");
		
	}
	
}
class F extends E{
	public void m3() {
		System.out.println("m3 class");
		
	}
	
}


public class multilevelinheritence {

	public static void main(String[] args) {
		F f=new F();
		f.m1();
		f.m2();
		f.m3();
	

	}

}
