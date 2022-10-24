package lesson001;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		// verilen isim ve soy isim değerini Hello + isim+ soyisim olarak yazdıralım
		
		String isim1 = "ahmet";
		String soyIsim1 = "demir";
		System.out.println("Hello " + isim1 + " "+soyIsim1);
		
		
		
		System.out.print("Please enter your name ");
		Scanner scanner = new Scanner(System.in); 
		String isim = scanner.nextLine();
		System.out.print("Please enter your surname");
		String soyIsim = scanner.next();
		System.out.println("Hello " + isim + " "+ soyIsim);
		scanner.close();

	}

}
