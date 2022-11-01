package HW3_31_11_22;

import java.util.Arrays;

public class HW1_31_11_22 {

	public static void main(String[] args) {
		//To calculate second max of an Integer array
		//Solution 1
		int[] numbers = {1,2,3,4,5,9,-9,-6,20,19,20};
		int max = 1;
		for (int i = 0; i < numbers.length; i++) {
			if(max <numbers[i]) {
				max = numbers[i];
			}
		}
		int diff = max;
		for (int i = 0; i < numbers.length; i++) {
			if ((max-numbers[i])<diff && max!= numbers[i] )
				diff = max-numbers[i];
		}
		System.out.println("Second max value is: " +(max-diff));
		
		
		//Solution 2 works fine assuming there is a second max value
		int[] numbers1 = {1,1,1,1,1,1,0};
		Arrays.sort(numbers1);
		for (int i = numbers1.length-1; 0 < i; i--) {
			if (numbers1[i]==numbers1[i-1]) {
				continue;
			} else {
				System.out.println("Second max value is: " +numbers1[i-1]);
				break;
			}	
		}
		

	}

}
