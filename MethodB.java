package com.chiplua;

public class MethodB{
	public double getTime(CallBackInterface callBack) {
		long start = System.currentTimeMillis();
		callBack.executeMethod();
		long end = System.currentTimeMillis();
		System.out.println("cost time=" + (end - start));
		return end - start;
	}
}
