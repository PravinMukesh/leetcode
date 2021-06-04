package easy;

import java.util.Arrays;

public class ShuffleTheArray {

	 public static int[] shuffle(int[] nums, int n) {
	        int[] output = new int[nums.length];
			int skipLast = 1, skipFirst = 0;
			int[] first = Arrays.copyOfRange(nums, 0, n);
			int[] last = Arrays.copyOfRange(nums, n, nums.length );
			for (int i = 0; i < last.length; i++) {
				output[i+skipFirst] = first[i];
				output[i+skipLast] = last[i];
				skipFirst++;
				skipLast++;
			}
	        return output;
	    }
	 
	public static void main(String[] args) {

		int[] nums = {2,5,1,3,4,7};
		int n = 3;
		System.out.println(shuffle(nums, n));
	}

}
