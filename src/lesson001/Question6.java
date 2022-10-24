package lesson001;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		// kulla alı vize ve final notları ile geçme kontrolu;
		
		
		Scanner scanner = new Scanner(System.in); 
		System.out.print("Vize notunu: ");
		int vize = scanner.nextInt();
		System.out.print("Final notunu: ");
		int final1 = scanner.nextInt();
		double score = (double)(vize*40+final1*60)/100;
		System.out.println(score);
		if (score < 50) {
			System.out.println("Fail: "+ score);
		}else { 
			System.out.println("pass: "+ score);
		}
		scanner.close();
	}
}
