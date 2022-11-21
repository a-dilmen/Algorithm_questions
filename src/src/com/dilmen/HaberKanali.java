package com.dilmen;

public class HaberKanali extends Kanal{
	
	private String haberTuru;
	
	
	public HaberKanali(String kanalAdi, int kanalNo, String kanalTuru,String haberTürü) {
		super(kanalAdi, kanalNo, kanalTuru);
		this.haberTuru = haberTürü;
	}

	@Override
	public String toString() {
		return "Kanal adı " + getKanalAdi() + " kanal no "
				+ getKanalNo() + ", kanal türü " + getKanalTuru() + "müzik kanalı müzik türü " + haberTuru ;
	}
	
	public String getHaberTürü() {
		return haberTuru;
	}
	public void setHaberTürü(String haberTürü) {
		this.haberTuru = haberTürü;
	}

	
	
}
