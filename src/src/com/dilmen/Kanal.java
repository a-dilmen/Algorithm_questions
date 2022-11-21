package com.dilmen;

public class Kanal {
	
	
	private String kanalAdi;
	private int kanalNo;
	private String kanalTuru;
	
	
	
	public Kanal(String kanalAdi, int kanalNo, String kanalTuru) {
		super();
		this.kanalAdi = kanalAdi;
		this.kanalNo = kanalNo;
		this.kanalTuru = kanalTuru;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Kanal kanal adı --> " + kanalAdi + " , kanalNo --> " + kanalNo + " , kanalTuru --> " + kanalTuru;
	}




	public String getKanalAdi() {
		return kanalAdi;
	}
	public void setKanalAdi(String kanalAdi) {
		this.kanalAdi = kanalAdi;
	}
	public int getKanalNo() {
		return kanalNo;
	}
	public void setKanalNo(int kanalNo) {
		this.kanalNo = kanalNo;
	}
	public String getKanalTuru() {
		return kanalTuru;
	}
	public void setKanalTuru(String kanalTuru) {
		this.kanalTuru = kanalTuru;
	}
	
	

}
