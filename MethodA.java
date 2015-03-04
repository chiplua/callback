package com.chiplua;

public class MethodA {
	public static void main(String args[]) {
		MethodB b = new MethodB();
		double d = b.getTime(new CallBackInterface() {
				
			@Override
			public void executeMethod()	{
				MethodA.testMethod();
			}


			@Override
			public void doSome() {

			}
		});

		System.out.println("d="+d);
	}

	public static void testMethod() {
		for(int i = 0; i < 10000; i++) {
			System.out.print("");
		}
	}
}
