package com.acorn;

public class Circle extends Shape {
	private double w;
	private double h;
	
	public Circle () {}
	public Circle(double w,
			double h,
			String name) {
		super(name);
		this.w = w;
		this.h = h;
	}
	
//	public Circle(double h, String name) {
//		super(name);
//		this.h = h;
//	}
	
	@Override
	public double width() {
		return w * h;
	}

	@Override
	public double height() {
		return (w + h) * 2;
	}

}
