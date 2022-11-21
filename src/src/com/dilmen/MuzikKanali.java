package com.dilmen;

public class MuzikKanali extends Kanal{
	
	private String muzikTuru;
	
	
	public MuzikKanali(String kanalAdi, int kanalNo, String kanalTuru, String muzikTuru) {
		super(kanalAdi, kanalNo, kanalTuru);
		this.muzikTuru = muzikTuru;
	}
	
	
	@Override
	public String toString() {
		return "Kanal adı " + getKanalAdi() + " kanal no "
				+ getKanalNo() + ", kanal türü " + getKanalTuru() + "müzik kanalı müzik türü " + muzikTuru ;
	}


	public String getMuzikTuru() {
		return muzikTuru;
	}
	public void setMuzikTuru(String muzikTuru) {
		this.muzikTuru = muzikTuru;
	}
	

}
