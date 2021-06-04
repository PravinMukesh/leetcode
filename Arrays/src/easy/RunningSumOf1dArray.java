package easy;

public class RunningSumOf1dArray {

	public static int[] runningSum(int[] nums) {
		int[] output = new int[nums.length];
		output[0] = nums[0];
		for (int i = 1; i < nums.length; i++) {
			output[i] = output[i - 1] + nums[i];
		}
		return output;
	}

	public static void main(String[] args) {
		int[] nums = {1,2,3,4};
		System.out.println(runningSum(nums));
	}

}
