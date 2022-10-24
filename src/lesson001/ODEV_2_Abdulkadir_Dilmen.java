package HW1;

import java.util.*;

public class ODEV_2_Abdulkadir_Dilmen {

	public static void main(String[] args) {
		// BMI Calculater
		
		//scanner creation
		Scanner bmi = new Scanner(System.in);
		//prompting user for length
		System.out.print("Please Enter Length in (cm): ");
		//assigning input to length
		float length = bmi.nextFloat();
		System.out.print("Please Enter Weight in (kg): "); //prompt
		float weight = bmi.nextFloat(); //weight value
		System.out.print("Please Enter Gender (\"male\" or \"female\") : ");//prompt
		String gender = bmi.next();//gender
		//BMI calculation
		int BMI = (int)((weight*10000)/(length*length));
		String male = "male"; // string definition
		String female = "female";
		String genderL = gender.toLowerCase(); // making all lower case for comparision
		//conditions
		if (BMI > 30)
			System.out.println("Obez");
		else if ((BMI > 25 && male.compareTo(genderL) == 0)|| (BMI > 24 && female.compareTo(genderL) == 0)) {
			System.out.println("Şişman");
		}else if  ((BMI > 19 && male.compareTo(genderL) == 0)|| (BMI > 18 && female.compareTo(genderL) == 0)) {
			System.out.println("Normal");
		}else if  ((BMI < 20 && male.compareTo(genderL) == 0)|| (BMI < 19 && female.compareTo(genderL) == 0)) {
			System.out.println("Zayıf");
		}
		else System.out.println("something is wrong restart program");

	}

}
