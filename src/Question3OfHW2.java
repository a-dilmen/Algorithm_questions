package HW2;

import java.util.Scanner;

public class Question3OfHW2 {

	public static void main(String[] args) {
		// Generate a random number
		// prompt user for guess
		// prompt user to lower or raise their guess
		// print "Congrats you have found the number in "x" many trials" 
		
		// Scanner Object
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"Welcome to !**?  Guess Which Number Game  ?**! You have Infintely Many Trials, Please Enjoy and Use Directions, Guess Between 0-100");
		// random number generation
		int randNum = (int) (Math.random() * 100);
		// number of trials
		int nT = 0;
		// conditioning while to stay in loop until user guesses correctly
		boolean flag = false;
		while (flag == false) {
			System.out.println();     			//just for esthetics 
			System.out.print("Let's Guess: ");	//prompting for guess
			int guessNum = sc.nextInt();
			nT++;								//updating guess count
			if (guessNum == randNum) {			
				System.out.print("Congrats you have found the number in " + nT + " trials\t");
				flag = true;					//updating flag to terminate while
				//Printing results w.r.t. nT
				String str = nT >8 ? "Next time try guessing smarter (little hint: Divide&Conquer)": 
					nT>3 ? "You are good but a bit unlucky": nT == 3 ? "3 is the charm" : 
					nT < 3 ? "Where is this luck coming from, Do you wear horseshoe on your"
							+ " feet or rabbit's foot neckleace power on ?":"";
				System.out.println(str);
			} else if (guessNum > randNum)		//guiding user to guess closer
				System.out.println("Lowering your guess will increase your chance to find");
			else								//guiding user to guess closer
				System.out.println("Consider raising your bid to win ");

		}
		
	}

}
