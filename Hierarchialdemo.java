package com.codes;

public class HierarchialDemo {
	public static void main(String[] args) {
		Developer dev=new Developer();
		Tester test=new Tester();
		
		dev.company();
		dev.role();
		
		test.company();
		test.role();

	}

}
