package com.banksetget.core;

public class Banksetget {
	
	String bankcusteruser;
	long bankcustpass;
	
	public Banksetget(String bankcusteruser, long bankcustpass) {
		super();
		this.bankcusteruser = bankcusteruser;
		this.bankcustpass = bankcustpass;
	}
	public String getBankcusteruser() {
		return bankcusteruser;
	}
	public void setBankcusteruser(String bankcusteruser) {
		this.bankcusteruser = bankcusteruser;
	}
	public long getBankcustpass() {
		return bankcustpass;
	}
	public void setBankcustpass(long bankcustpass) {
		this.bankcustpass = bankcustpass;
	}
}
