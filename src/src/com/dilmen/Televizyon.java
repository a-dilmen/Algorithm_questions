package com.dilmen;

import java.util.ArrayList;
import java.util.Scanner;

public class Televizyon {

	static Scanner scanner = new Scanner(System.in);

	private String marka;
	private String boyut;
	private ArrayList<Kanal> kanallar;
	private boolean tvKuruluMu;
	private boolean tvAcikMi;
	private int ses;
	private Kanal izlenenKanal;

	public Televizyon() {
		super();
		kanallar = new ArrayList<>();
	}

	public void kanallariOlustur() {

		Kanal kanal1 = new Kanal("Trt1", 1, "Genel");
		Kanal kanal2 = new Kanal("Beyaz TV", 2, "Genel");
		HaberKanali kanal3 = new HaberKanali("Bloomberg HT", 3, "Haber", "Ekonomi");
		MuzikKanali kanal4 = new MuzikKanali("DreamTürk", 4, "Müzik", "Yerli");

		kanallar.add(kanal1);
		kanallar.add(kanal2);
		kanallar.add(kanal3);
		kanallar.add(kanal4);
	}

	public void tvKur() {
		if (tvKuruluMu == isTvKuruluMu()) {
			System.out.println("Lütfen TV markasını giriniz.");
			String marka = scanner.nextLine();
			System.out.println("Lütfen TV boyutunu giriniz.");
			String boyut = scanner.nextLine();
			System.out.println(marka + " markalı " + boyut + " boyutunda TV'niz kurulmuştur.");
			setTvKuruluMu(true);
			setTvAcikMi(false);
		}
	}

	public void tvAc() {
		if (isTvKuruluMu() && !isTvAcikMi()) {
			setTvAcikMi(true);
			setIzlenenKanal(kanallar.get(0));
			setSes(15);
			System.out.println("TV açıldı şu anda birinci kanaldasınız ses seviyeniz 15");
		} else if (isTvKuruluMu() && isTvAcikMi()) {
			System.out.println("TV zaten açık.");
		} else if (!isTvKuruluMu()) {
			System.out.println("Önce Televizyonu kurun");
		}
	}

	public void sesiAc() {
		if (getSes() < 30 && tvAcikMi) {
			setSes(getSes() + 1);
			System.out.println("ses " + getSes() + " olarak artırıldı");
		} else if (!tvAcikMi) {
			System.out.println("Sesi artırmak için önce Televizyonu açmalısınız");
		} else {
			System.out.println("Televizyon sesi " + getSes() + "maximumda");
		}
	}

	public void sesiKıs() {
		if (getSes() > 0 && tvAcikMi) {
			setSes(getSes() - 1);
			System.out.println("ses " + getSes() + " olarak azaltıldı");
		} else if (!tvAcikMi) {
			System.out.println("Sesi kısmak için önce Televizyonu açmalısınız");
		} else {
			System.out.println("Televizyon sessizde");
		}
	}

	public void kanalDegistir() {

		if (tvAcikMi) {
			for (int i = 0; i < kanallar.size()-1; i++) {
				if (kanallar.get(i)==getIzlenenKanal()) {
					setIzlenenKanal(kanallar.get(i+1));
					System.out.println(i+2+" no lu yayında " + kanallar.get(i+1).getKanalAdi()
							+ " kanalını izliyorsunuz ses seviyesi " + getSes());
					break;
				} else if (kanallar.get(3)==getIzlenenKanal())  {
					setIzlenenKanal(kanallar.get(0));
					System.out.println(1+" no lu yayında " + kanallar.get(0).getKanalAdi()
							+ " kanalını izliyorsunuz ses seviyesi " + getSes());
				}
			}
		} else
			System.out.println("Önce Televizyonu açmalısınız");
//		if (tvAcikMi) {
//			if (getIzlenenKanal() == kanallar.get(0)) {
//				setIzlenenKanal(kanallar.get(1));
//				System.out.println("2 no lu yayında " + kanallar.get(1).getKanalAdi()
//						+ " kanalını izliyorsunuz ses seviyesi " + getSes());
//			} else if (getIzlenenKanal() == kanallar.get(1)) {
//				setIzlenenKanal(kanallar.get(2));
//				System.out.println("3 no lu yayında " + kanallar.get(2).getKanalAdi()
//						+ " kanalını izliyorsunuz ses seviyesi " + getSes());
//			} else if (getIzlenenKanal() == kanallar.get(2)) {
//				setIzlenenKanal(kanallar.get(3));
//				System.out.println("4 no lu yayında " + kanallar.get(3).getKanalAdi()
//						+ " kanalını izliyorsunuz ses seviyesi " + getSes());
//			} else if (getIzlenenKanal() == kanallar.get(3)) {
//				setIzlenenKanal(kanallar.get(0));
//				System.out.println("1 no lu yayında " + kanallar.get(0).getKanalAdi()
//						+ " kanalını izliyorsunuz ses seviyesi " + getSes());
//			} else
//				System.err.println("bir Hata oluştu");
//		} else
//			System.out.println("Önce Televizyonu açmalısınız");
	}

	public void kanalBilgisiGoster() {
		if (tvAcikMi) {
			System.out.println(getIzlenenKanal());
		} else if (!tvKuruluMu) {
			System.out.println("Televizyon kapalı");
		}
			
		
	}

	public void televizyonuKapat() {
		if (tvAcikMi) {
			setTvAcikMi(false);
			System.out.println("Televizyon kapatıldı");
		} else if (!tvKuruluMu) {
			System.out.println("Televizyon kapalı");
		}
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public String getBoyut() {
		return boyut;
	}

	public void setBoyut(String boyut) {
		this.boyut = boyut;
	}

	public ArrayList<Kanal> getKanallar() {
		return kanallar;
	}

	public void setKanallar(ArrayList<Kanal> kanallar) {
		this.kanallar = kanallar;
	}

	public boolean isTvKuruluMu() {
		return tvKuruluMu;
	}

	public void setTvKuruluMu(boolean tvKuruluMu) {
		this.tvKuruluMu = tvKuruluMu;
	}

	public boolean isTvAcikMi() {
		return tvAcikMi;
	}

	public void setTvAcikMi(boolean tvAcikMi) {
		this.tvAcikMi = tvAcikMi;
	}

	public int getSes() {
		return ses;
	}

	public void setSes(int ses) {
		this.ses = ses;
	}

	public Kanal getIzlenenKanal() {
		return izlenenKanal;
	}

	public void setIzlenenKanal(Kanal izlenenKanal) {
		this.izlenenKanal = izlenenKanal;
	}

}
