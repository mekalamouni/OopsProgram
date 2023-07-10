package com.mouni.OopsPrograms;
abstract class Iter{
	int i=45;
	abstract void m1();
	abstract void m2();
	
}
class R extends Iter{
	@Override
	public void m1() {
		System.out.println("m1() is implemented");
	}
	@Override
	public void m2() {
		System.out.println("m2() is implemented");
	}
	
}

public class Interface {

	public static void main(String[] args) {
		Iter  iter=new R();
		iter.m1();
		iter.m2();
		//iter.m1();
		
	}

}
