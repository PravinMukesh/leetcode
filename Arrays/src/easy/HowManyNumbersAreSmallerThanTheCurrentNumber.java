package easy;

public class HowManyNumbersAreSmallerThanTheCurrentNumber {

	public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] output = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			int counter = 0;
			for (int j = 0; j < nums.length; j++) {
				if(nums[i] != nums[j] && nums[i] > nums[j]) {
					output[i] = ++counter;
				}
			}
		}
		return output;
    }
	
	public static void main(String[] args) {
		int[] nums = {8,1,2,2,3};
		System.out.println(smallerNumbersThanCurrent(nums));
	}

}
