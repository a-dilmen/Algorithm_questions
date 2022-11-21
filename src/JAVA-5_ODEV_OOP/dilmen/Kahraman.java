package com.dilmen;

public abstract class Kahraman implements IYetenekler {
	private int can;
	private int mana;
	
	public Kahraman(String isim) {
		super();
		this.isim = isim;
		
	}
	private String isim;
	
	
	public abstract void canGüncelle();
	public abstract void manaGüncelle();
	
	
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public int getCan() {
		return can;
	}
	public void setCan(int can) {
		this.can = can;
	}
	public int getMana() {
		return mana;
	}
	public void setMana(int mana) {
		this.mana = mana;
	}
	
	
}
