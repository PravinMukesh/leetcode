package easy;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

	public static List<String> fizzBuzz(int n) {
		List<String> list = new ArrayList<>(n);
		for (int i = 1; i <= n; i++) {
			if(i%5 == 0 && i%3 == 0)
				list.add(i-1, "FizzBuzz");
			else if(i%3 == 0)
				list.add(i-1, "Fizz");
			else if(i%5 == 0)
				list.add(i-1, "Buzz");
			else
				list.add(String.valueOf(i));
		}
		return list;
	}

	public static void main(String[] args) {
//		int n = 3;
//		int n = 5;
		int n = 15;
		System.out.println(fizzBuzz(n));
	}

}
