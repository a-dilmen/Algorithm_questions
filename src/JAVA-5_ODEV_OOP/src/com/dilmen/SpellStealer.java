package com.dilmen;

public class SpellStealer extends Kahraman{
	private int can;
	private int mana;
	

	public SpellStealer(String isim,int can,int mana) {
		super(isim);
		this.can = can;
		this.mana = mana;
	}

	@Override
	public void canGüncelle() {
		setCan(getCan()+2);
		
	}

	@Override
	public void manaGüncelle() {
		setMana(getMana()+2);
		
	}

	@Override
	public void birinciYeteneğiKullan(Kahraman kahraman) {
		if (this.getMana()>9) {
			this.setMana(this.getMana()-10);
			this.setMana(this.getMana()+4);
			this.setCan(this.getCan()+4);
			if (this.mana<0)
				this.setMana(0);
			kahraman.setCan(kahraman.getCan()-5);
			kahraman.setMana(kahraman.getMana()-5);
		} else 
			System.out.println("Mana Yetersiz --> sıra düşmana geçti");
		
	}

	@Override
	public void ikinciYeteneğiKullan(Kahraman kahraman) {
		if (this.getMana()>14) {
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
		if (this.getMana()>19) {
			this.setMana(this.getMana()-20);
			this.setMana(this.getMana()+6);
			this.setCan(this.getCan()+6);
			if (this.mana<0)
				this.setMana(0);
			kahraman.setCan(kahraman.getCan()-20);
			kahraman.setMana(kahraman.getMana()-20);
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
