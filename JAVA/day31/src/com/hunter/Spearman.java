package com.hunter;

public class Spearman extends HunterImpl {
	
	@Override
	public void walk(int speed) {
		System.out.println("C:Spearman:wake()");
	}

	@Override
	public void run(int speed) {
		System.out.println("C:Spearman:wake()");
	}

	@Override
	public void attack(int attackPower) {
		System.out.println("C:Spearman:wake()");
	}

	@Override
	public void defence(int defencePower) {
		System.out.println("C:Spearman:defence()");
	}
}
