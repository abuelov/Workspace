package Chapter12;

import java.util.Arrays;

public class HardArrayTalks {

	public static void main(String[] args) {
		int[] nums = {12, 57, 93, 83, 4};

		System.out.println(Arrays.toString(nums));
		
		for(int i = 0 ; i < nums.length ; i++){
			nums[i] += 5;
		}
		
		System.out.println(Arrays.toString(nums));
	}
}