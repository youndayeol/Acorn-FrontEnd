package com.coopang;

import java.util.Scanner;

public class Member {
	Long Id;
	String Name;
	String Phone;
	String Addr;
	String DeveryAddr;
	Basket Basket;
	
	Scanner UpdateDevery = new Scanner(System.in);
	
	public Member(Long Id, String Name, String Phone, String Addr, String DeveryAddr, Basket Basket) {

		this.Id = Id;
		this.Name = Name;
		this.Phone = Phone;
		this.Addr = Addr;
		this.DeveryAddr = DeveryAddr;
		this.Basket = Basket;
		
	}
	
	public void UpdateDeveryAddr() {
		UpdateDevery.next();
	}

	public void OrderCheck() {
		
	}
	
	public void OrderComplete() {
		
	}
	
	
	public Long getId() {
		return Id;
	}

	public String getName() {
		return Name;
	}

	public String getPhone() {
		return Phone;
	}

	public String getAddr() {
		return Addr;
	}

	public void setAddr(String addr) {
		Addr = addr;
	}

	public String getDeveryAddr() {
		return DeveryAddr;
	}

	public void setDeveryAddr(String deveryAddr) {
		DeveryAddr = deveryAddr;
	}

	public Basket getBasket() {
		return Basket;
	}

	public void setBasket(Basket basket) {
		Basket = basket;
	}
	
}
