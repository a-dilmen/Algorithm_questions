package lesson001;

import java.util.Scanner;
import java.util.*;

public class Question9 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); 
		
		System.out.print("Radius: ");
		double radius = scanner.nextDouble();
		System.out.println("dairenin alanı = " + (3.14*radius*radius) + " dairenin çevresi = "+ (2*3.14*radius));
	
		
		//System.out.printf("dairenin alanı = %.2f" , (3.14*radius*radius) + " dairenin çevresi = %.2f", (2*3.14*radius));
	}
}
