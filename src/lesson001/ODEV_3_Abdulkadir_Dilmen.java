package HW1;

import java.util.Scanner;

public class ODEV_3_Abdulkadir_Dilmen {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in); 
		
		System.out.print("İşlem için değer giriniz: (1- toplama, 2-çıkarma, 3-çarpma ,4- bölme) ");
		double i = scanner.nextDouble();
		System.out.println("ilk sayıyı giriniz");
		double s1 = scanner.nextDouble();
		System.out.println("ikinci sayıyı giriniz");
		double s2 = scanner.nextDouble();
		
		// hatalı işlem numarası için hata mesajı
		if (i != 1 || i!= 2|| i != 3 || i != 4)
			System.out.println("Hatalı işlem girdiniz");
		
		// işlem konuda göre mesaj yazdırma
		if (i == 1)
			System.out.println("sonuç = " + (s1+s2) );
		else if (i == 2)
			System.out.println("sonuç = "+ (s1-s2));
		else if (i == 3)
			System.out.println("sonuç = "+ (s1*s2));
		else if (i == 4) {
			if (s2 == 0) 
				System.out.println("0 sayısı bölen olarak girilemez");
			System.out.println("sonuç = "+ (s1/s2));
		}
		else
			System.out.println("bir hata oluştu");
	
	}
	

}
