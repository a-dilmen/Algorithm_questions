package lesson001;

import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in); 
		
		System.out.print("Notunuzu giriniz: ");
		double score = scanner.nextDouble();
		
		if (score > 100)
			System.out.println("lütfen geçerli bir not giriniz");
		else if (score >= 90 )
			System.out.println(" Harf Notuz AA tebrikler");
		else if (score>= 80)
			System.out.println(" Harf Notunuz BB tebrikler");
		else if (score >= 70)
			System.out.println(" Harf Notunuz CC tebrikler");
		else if (score >= 60)
			System.out.println(" Harf Notunuz DD tebriler");
		else if ( score <= 60 && score >= 0 ) {
			System.out.println(" Harf Notunuz FF malesef kaldınız");
		} 
		else 
			System.out.println("lütfen geçerli bir not giriniz");
			
			
			

	}

}
