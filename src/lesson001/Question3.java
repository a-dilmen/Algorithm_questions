package lesson001;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// verilen  2 sayıdan hangisinin büyük olduğunu  bulan program
		//int a = 32;
		//int b = 32.8f; // float type için sonuna f
		//float c = 32.8; // hata
		//double k = 21.4d; // double için d olsa da olmasa da olur
		//double l = 21.4;
		/*if (a>b)
			System.out.println("a büyüktür b");
		else if (a == b) 
			System.out.println("a = b");
		else 
			System.out.println("b büyüktür a");
		*/
		//System.out.println(c);
		//System.out.println(l);
		
		System.out.print("Please enter first integer: ");
		Scanner scanner = new Scanner(System.in); 
		int	a = scanner.nextInt(); 
		System.out.print("Please enter second integer: ");
		int b = scanner.nextInt(); 
		//int summ;
		//summ = newNumber1* newNumber2; 
		if (a>b)
			System.out.printf("%d büyüktür %d", a, b);
		else if (a == b) 
			System.out.printf("%d = %d",a,b);
		else 
			System.out.printf("%d büyüktür %d", a,b);
		//System.out.println("Çarpım: " + summ);
	}

}
