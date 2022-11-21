package com.dilmen;

import java.util.Scanner;

public class Main {

	static Scanner scanner = new Scanner(System.in);
	static Televizyon tv = new Televizyon();
	
	public static void main(String[] args) {
		menuGoster();
		boolean isTVOn = true;
		while (isTVOn) {
			System.out.println("\t Seçiminiz (Menüyü Görmek için 8)");
			int key = scanner.nextInt();

			switch (key) {
			case 1:
				tvKurVeKanallariOlustur();
				break;
			case 2:
				tv.tvAc();
				break;
			case 3:
				tv.sesiAc();
				break;
			case 4:
				tv.sesiKıs();
				break;
			case 5:
				tv.kanalDegistir();
				break;
			case 6:
				tv.kanalBilgisiGoster();
				break;
			case 7:
				tv.televizyonuKapat();
				break;
			case 8:
				menuGoster();
				break;
			case 0:
				isTVOn = false;
				System.out.println("Sistemden çıktınız");
				break;
			default:
				System.out.println("Hatalı tuşlama yaptınız.");
				break;
			}
		}
	}

	private static void menuGoster() {
		System.out.println("***MENU****");
		System.out.println("0- Çıkış \n" + "1-- Televizyon Kur\n" + "2-- Televizyonu Aç\n" + "3-- Sesini Artır\n"
				+ "4--Sesi Azalt\n" + "5-- Kanal Değiştir\n" + "6-- Kanal Bilgisi Goster\n" + "7-- Televizyonu Kapat\n"
				+ "8-- Menüyü Goster\n");

	}

	public static void tvKurVeKanallariOlustur() {
		Televizyon tV = tv;
		if (tV.isTvKuruluMu())
			System.out.println("Televizyon kurulu");
		else {
			tV.tvKur();
			tV.kanallariOlustur();
		}
	}

	

}