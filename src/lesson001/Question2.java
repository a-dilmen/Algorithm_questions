package lesson001;

import java.util.Scanner;

public class Question2 {
	public static void main(String[] args) {
		// Verilen ürününün içinde 
		
		float urunFiyatı = 100;
		float kdvsizFiyat = 0.82f* urunFiyatı  ;
		float maliyet = 0.85f* kdvsizFiyat;
		System.out.println(maliyet);
		float a = 100f;
		float b = a/1.18f;
		float c = a*0.82f;
		System.out.println(b);
		System.out.println(c);
		/*
		System.out.print("ürün maliyetini girin: ");
		
		Scanner scanner = new Scanner(System.in); 
		int urunMaliyeti = scanner.nextInt(); 
		
		System.out.print("kar marjını giringirin: ");
		int karMarjı = scanner.nextInt(); 

		
		double karlıFiyat = urunMaliyeti*karMarjı;
		int fiyat = (int)(karlıFiyat*1.18);
		System.out.println("Fiyat: "+fiyat);*/
	}
}
