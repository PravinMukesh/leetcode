package easy;

public class NumberOfGoodPairs {

	 public static int numIdenticalPairs(int[] nums) {
	        int output = 0;
			for (int i = 0; i < nums.length; i++) {
				for (int j = 1; j < nums.length; j++) {
					if (nums[i] == nums[j] && i < j) {
						output++;
					}
				}
			}
			return output;
	    }
	 
	public static void main(String[] args) {
		int[] nums = {1,2,3,1,1,3};
		System.out.println(numIdenticalPairs(nums));
	}

}
