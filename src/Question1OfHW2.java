package HW2;

import java.util.Scanner;

public class Question1OfHW2 {

	public static void main(String[] args) {
		// Get a string as user input
		// if the string starts with "a" print out last index
		// else if starts with "b" change first index  with "@"
		// else print out the first index of the string that user provided
		
		// Common elements of alternative solutions
		//Creating Scanner object
		Scanner sc = new Scanner(System.in);
		//Prompting user for input
		System.out.print("Please enter a string: ");
		// scanning for user input
		String str = sc.nextLine();
	
		//Alternative Solution 1 //Single Line Solution
		//Using ternary if statement
		System.out.println(str = str.startsWith("a") == true ? str.substring(str.length()-1,str.length()):
			str.startsWith("b") == true ? str.replaceFirst("b", "@") : str.substring(0,1));
		
		//to sue alternative 2 commend ln 23,24 and toggle commend on ln27-ln39
//		//Alternative Solution 2 //Easy to read 
//		//Checking for initial character to be "a"
//		if (str.startsWith("a")) {
//			//conditional operation to print out the last index
//			str = str.substring(str.length()-1,str.length());
//		//Checking for initial character to be "b"
//		} else if (str.startsWith("b"))
//			str = str.replaceFirst("b", "@");
//		//applying else condition
//		else
//			str =str.substring(0,1) ;
//		//printing user desired outcome	
//		System.out.println(str);

	}

}
