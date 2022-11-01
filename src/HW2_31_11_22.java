package HW3_31_11_22;

public class HW2_31_11_22 {

	public static void main(String[] args) {
		// to sum all values except key value and trailing 1 
		int nums[] = {1, 13, 1, 13, 13, 2, 5, 13,2,2, 13,2,2 };
		int key = 13;
		int sum = 0;
		//looping thru array
		for (int i = 0; i < nums.length; i++) {
			//checking key if exist incrementing to next value
			if (nums[i] == key)
				i++;
			else {
				// to avoid out bounds error
				if (i != 0) {
					//checking previous value to be sure it is not key
					if (nums[i - 1] == key) {
					} else
						sum += nums[i]; //updating sum
				}
				//to include i is 0
				if (i == 0) {
					if (nums[i] == key) {
						i++;
					} else
						sum += nums[i];
				}
			}

		}//Printing result
		System.out.println(sum);

	}

}
