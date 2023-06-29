package com.mouni.inheritence;
class G{
	void m1() {
		System.out.println("m1 class");
	

	}
	
}
class H extends G{
	public void m2() {
		System.out.println("m2 class");
		
	}
	
}
class I extends G{
	public void m3() {
		System.out.println("m3 class");
		
	}
	
}
public class HeirarachicalInherentce {

	public static void main(String[] args) {
		I i=new I();
		i.m1();
		i.m3();
		H h=new H();
		h.m2();
		

	}

}
