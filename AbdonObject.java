package com.mouni.OopsPrograms;
class Q{
	int i=20;
	public void m1() {
		System.out.println(i);
	}
}

public class AbdonObject {

	public static void main(String[] args) {
	Q q1=new Q();
	q1.m1();
	q1=new Q();
	q1.m1();
	

	}

}
