package com.hunter;

import com.common.Location;

public class HunterImpl implements IHunter {

	private int health;
	private int attackpower;
	private int defencepower;
	private int cash;
	private int speed;
	public Location location;
	
	public HunterImpl () {}
	
	public HunterImpl(int health, int attackpower, int defencepower,
			int cash, int speed) {
		this.health = health;
		this.attackpower = attackpower;
		this.defencepower = defencepower;
		this.cash = cash;
		this.speed = speed;
	}
	
	//메소드 오버로딩(method overloading)
	public HunterImpl(int health, int attackpower, int defencepower,
			int cash, int speed, Location location) {
		this.health = health;
		this.attackpower = attackpower;
		this.defencepower = defencepower;
		this.cash = cash;
		this.speed = speed;
		this.location = location;
	}
	
	
	@Override
	public void wake(int basichealth) {
		System.out.println("wake():" + basichealth);
	}

	@Override
	public void walk(int speed) {
		System.out.println("walk()");
	}

	@Override
	public void run(int speed) {
		System.out.println("run()");
	}

	@Override
	public void attack(int attackpower) {
		System.out.println("attack()");
	}

	@Override
	public void defence(int defencepower) {
		System.out.println("defence()");
	}

	@Override
	public void sleep(int basichealth) {
		System.out.println("sleep()");
	}

	@Override
	public void die() {
		System.out.println("die()");
	}

	public int getHealth() {return health;}

	public void setHealth(int health) {this.health = health;}

	public int getAttackpower() {return attackpower;}

	public void setAttackpower(int attackpower) {this.attackpower = attackpower;}

	public int getDefencepower() {return defencepower;}

	public void setDefencepower(int defencepower) {this.defencepower = defencepower;}

	public int getCash() {return cash;}

	public void setCash(int cash) {this.cash = cash;}

	public int getSpeed() {return speed;}

	public void setSpeed(int speed) {this.speed = speed;}

	public Location getLocation() {return location;}

	public void setLocation(Location location) {this.location = location;}

}
