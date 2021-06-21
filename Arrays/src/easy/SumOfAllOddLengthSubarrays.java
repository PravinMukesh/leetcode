package easy;

public class SumOfAllOddLengthSubarrays {

	public static int sumOddLengthSubarrays(int[] arr) {
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			int end = i + 1;
			int start = arr.length - i;
			int totalSubarrays = end * start;
			int oddSubarrays = totalSubarrays / 2;
			if (totalSubarrays % 2 == 1) {
				oddSubarrays++;
			}
			sum += oddSubarrays * arr[i];
		}

		return sum;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 4, 2, 5, 3 };
		System.out.println(sumOddLengthSubarrays(arr));
	}

}
