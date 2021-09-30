package easy;

public class FinalValueOfVariableAfterPerformingOperations {

	public static int finalValueAfterOperations(String[] operations) {
		int counter = 0;
		for (String singleOperation : operations) {
			if (singleOperation.contains("+")) {
				counter++;
			} else
				counter--;
		}
		return counter;
	}

	public static void main(String[] args) {
		String[] operations = { "++x", "x++", "x--" };
		System.out.println(finalValueAfterOperations(operations));
	}

}
