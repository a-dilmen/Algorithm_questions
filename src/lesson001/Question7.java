package lesson001;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		
		// girilen sayının tek mi çift me olduğunu basan prog
		Scanner scanner = new Scanner(System.in); 
		System.out.print("Sayı giriniz: ");
		int sayi = scanner.nextInt();
		
		if (sayi % 2== 0)
			System.out.println(sayi + " çifttir");
		else 
			System.out.println(sayi+ " tektir");

	}

}
