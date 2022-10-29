package HW2;

import java.util.Scanner;

public class Question2OfHW2 {

	public static void main(String[] args) {
		// Get string input from user 
		// get integer input to execute predefined operations on the input string
		// Use Switch case
		// Predefined Operations 	// 1 - Make all letters upper case
									// 2 - Make all letters lower case
									// 3 - Place "?" between each letter
									// 4 - Trim of the spaces at the beginning and the end
									// 5 - Replace all "a" letters with "?"
									// 6 - Get first 3 index of string and concatenate  with "..." 
		
		Scanner sc = new Scanner(System.in);
		//Prompting user for input string
		System.out.print("Please enter a string: ");
		// scanning for user input string
		String str = sc.nextLine();
		// Prompting user Operation Numbers
		System.out.println("1 - Make all letters upper case");
		System.out.println("2 - Make all letters lower case");
		System.out.println("3 - Place \"?\" between each letter");
		System.out.println("4 - Trim of the spaces at the beginning and the end");
		System.out.println("5 - Replace all \"a\" letters with \"?\"");
		System.out.println("6 - Get first 3 index of string and concatenate  with \"...\"");
		//Prompting user for input Operation
		System.out.print("Please enter a operation number: ");
		// scanning for user input string
		int op = sc.nextInt();
		
		//Switch cases for desired operation
		switch (op) {
		case 1:
			//Upper case all
			str = str.toUpperCase();
			break;
		case 2:
			//Lower case all
			str = str.toLowerCase();
			break;
		case 3:
			// placing "?" between each letter
			// replacing all "" with "?" // then using substring to eliminate first and last "?"  
			str = str.replaceAll("","?").substring(1,2*str.length());	// 			alternative solution in command
																		//			String sstr = str.substring(0,1);
																		//			for (int i = 1; i< str.length();i++)
																		//				sstr += "?"+str.substring(i, i+1);
																		//			str = sstr;
			
			break;
		case 4:
			// Trimming spaces
			str = str.trim();
			break;
		case 5:
			//replacing all "a"'s with "?"
			str = str.replace("a","?");
			break;
		case 6:
			str = str.substring(0,3).concat("...");
			//str = str.substring(0,3)+"...";
			break;

		default:
			System.out.println("Please check your operation input and restart input sequence");
			break;
		}
		System.out.println(str);
		
	}

}
