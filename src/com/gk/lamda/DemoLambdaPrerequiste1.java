package com.gk.lamda;
/**
 * 
 * @author Kasturi's
 *	3 .class files will be created - A.class, XYZ.class DemoLambdaPrerequiste1.class
 */

interface A {
	void show();
}

class XYZ implements A {

	@Override
	public void show() {
		System.out.println("Hello");

	}

}

public class DemoLambdaPrerequiste1 {
	public static void main(String[] args) {
		A a = new XYZ();
		a.show();
	}
}
