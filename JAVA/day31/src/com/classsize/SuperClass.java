package com.classsize;

public class SuperClass {
	private int a;
	private int b;
	private int c;
	
	public SuperClass() {
		System.out.println("SuperClass()");
		System.out.println(this);
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}
	
}
