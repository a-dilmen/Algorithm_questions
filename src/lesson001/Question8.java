package lesson001;

import java.util.Scanner;

public class Question8 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); 
		
		System.out.print("kenar 1 giriniz: ");
		double kenar1 = scanner.nextDouble();
		
		System.out.print("kenar 2 giriniz: ");
		double kenar2 = scanner.nextDouble();
		
		System.out.print("kenar 3 giriniz: ");
		double kenar3 = scanner.nextDouble();
		
		if (kenar1==kenar2 && kenar2==kenar3) {  
			System.out.println("eşkenar");
		} else if (kenar1 == kenar2 || kenar1 == kenar3 || kenar2 == kenar3) // k1 != k2 && k2 
			System.out.println("ikizkenar");
		else
			System.out.println("çeşitkenar");
	}

}
