package lesson001;

import java.util.Scanner;

public class Question11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in); 
		
		System.out.print("İlk Sayı: ");
		double s1 = scanner.nextDouble();
		System.out.print("İkinci Sayı: ");
		double s2 = scanner.nextDouble();
		System.out.print("Üçüncü Sayı: ");
		double s3 = scanner.nextDouble();
		
		double maX = s1;
		if (maX <s2)
			maX = s2;
		if (maX <s3)
			maX = s3;
		System.out.println("en büyük sayı = " + maX);
		
		/* 
		 * double maX = s1
		if (maX <s2)
			maX = s2;
		else if (maX <s3) //else patlatır
			maX = s3;
		System.out.println("en büyük sayı = " + maX);
		
		
		if (s1 >= s2 && s1 >= s3)
			System.out.printf("en Büyük sayı : %.0f " ,s1);
		else if (s2 >= s1 && s2 >= s3)
			System.out.printf("en Büyük sayı : %.0f " ,s2);
		else if (s3 >= s1 && s3 >= s1)
			System.out.printf("en Büyük sayı : %.0f " ,s3); */

	}

}
