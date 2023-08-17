package day.study;

import test.inheritance.AudioTVParent;

public class TV extends AudioTVparent {

	private int size;
	
	public TV() {}
	
	public TV(boolean power, int volumn, int size) {
		super(power, volumn);
		this.size = size;
	}

	public int getSize() {
		return size;
	}
	
	public void setSize(int size) {
		this.size = size;
	}
	
	public void watch() {
		String sOnOff = getPower() ? "Have fun" : "Switch on";
		System.out.println(sOnOff);
	}
}
