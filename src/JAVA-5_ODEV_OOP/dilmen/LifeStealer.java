package com.dilmen;

public class LifeStealer extends Kahraman{
	private int can;
	private int mana;
	
	public LifeStealer(String isim,int can,int mana) {
		super(isim);
		this.can = can;
		this.mana = mana;
	}

	@Override
	public void canGüncelle() {
		setCan(getCan()+1);
		
	}

	@Override
	public void manaGüncelle() {
		setMana(getMana()+10);
		
	}

	@Override
	public void birinciYeteneğiKullan(Kahraman kahraman) {
		if (this.getMana()>9&& kahraman.getMana()>0) {
			this.setMana(this.getMana()-10);
			if (this.mana<0)
				this.setMana(0);
			this.setCan(this.getCan()+2);
			kahraman.setCan(kahraman.getCan()-12);
		} else 
			System.out.println("Mana Yetersiz --> sıra düşmana geçti");
	}

	@Override
	public void ikinciYeteneğiKullan(Kahraman kahraman) {
		if (this.getMana()>14&& kahraman.getMana()>0) {
			this.setMana(this.getMana()-15);
			if (this.mana<0)
				this.setMana(0);
			this.setCan(this.getCan()+4);
			kahraman.setCan(kahraman.getCan()-18);
		} else 
			System.out.println("Mana Yetersiz --> sıra düşmana geçti");
		
	}


	@Override
	public void finalYeteneğiKullan(Kahraman kahraman) {
		if (this.getMana()>20&& kahraman.getMana()>0) {
			this.setMana(this.getMana()-20);
			if (this.mana<0)
				this.setMana(0);
			this.setCan(this.getCan()+6);
			kahraman.setCan(kahraman.getCan()-30);
		} else 
			System.out.println("Mana Yetersiz --> sıra düşmana geçti");
		
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
