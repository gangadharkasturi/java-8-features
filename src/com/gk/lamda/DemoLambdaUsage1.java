package com.gk.lamda;
/**
 * 
 * @author Kasturi's
 * No inner class will get .class files.
 * All are treated in a single file.
 */
interface AC {
	void show();
}

public class DemoLambdaUsage1 {
	public static void main(String[] args) {
		
		/**
		 * Old way of providing impl to interface AC , method show()
		 */
		AC ac = new AC(){
			public void show(){
				System.out.println("Hello");
			}
		};
		ac.show();
		
		/**
		 * Using JAVA 8 Lambda Feature
		 */
		
		AC lambdaAc = () -> {
				System.out.println("hello");
		};
		lambdaAc.show();
		
		/**
		 * Another way of using lambda
		 */
		AC lamdaAcNew = () -> System.out.println("hello");
		lamdaAcNew.show();
	}
}
