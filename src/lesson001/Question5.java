package lesson001;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		// girilen tl değerini USD programı
		
		Scanner scanner = new Scanner(System.in); 
		System.out.print("Tl değeri giriniz: ");
		double tl = scanner.nextDouble();
		double usd = tl*18.25;
		
		System.out.println("USD değeri : " + usd );
		System.out.printf("USD değeri : %.2f" , usd );
	}

}
