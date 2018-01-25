package Chapter12;

public class ArrayLearning {

	public static void main(String[] args) {
		
		int[] nums = { 7,2,4,1,10};
		
		System.out.println(getMaxElement(nums));
		System.out.println(getMinElement(nums));
		System.out.println(getArraySum(nums));
		System.out.println(getArrayAverage(nums));
	}
		
		/*
		for(int i = 1; i <= nums.length; i++){
			System.out.println(i);
		}
		
		int[] vals = new int[1000];
		
		for(int i = 0; i < vals.length; i++){
			System.out.println(vals[i]);
		}
		
		//for(type name : collection)
		for(int val : vals){
			System.out.println(val);
		}
		*/
		
		//returns the max element in the array
		public static int getMaxElement(int[] nums){
			int max = nums[0];
			for(int num : nums){
				max = Math.max(num, max);
				
			}
			
			/*
			 * for(int i = i ; i < nums.length ; i++){
			 * max = Math.max(amx, nums[i]);
			 */
			return max;
			
		}
		//return the min element int the array
		public static int getMinElement(int[] nums){
			int min = nums[0];
			for(int num : nums){
				min = Math.min(num, min);
				
			}
			return min;
		}
		
		//return array sum
		public static int getArraySum(int[] nums){
			int sum = 0;
			for(int i = 0; i < nums.length ; i++){
				sum += nums[i];
			}
			return sum;
			
		}
		
		public static double getArrayAverage(int[] nums){
			return getArraySum(nums) / (double) nums.length;
		}
	
	}





