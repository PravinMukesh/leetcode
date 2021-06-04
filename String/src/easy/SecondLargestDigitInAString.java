package easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargestDigitInAString {

	static public int secondHighest(String s) {

		int[] a = new int[10];
		for (int i = 0; i < s.length(); i++)
			if (Character.isDigit(s.charAt(i)))
				a[Character.getNumericValue(s.charAt(i))]++;
		boolean flag = false;
		for (int i = 9; i >= 0; i--)
			if (a[i] != 0)
				if (flag)
					return i;
				else
					flag = true;
		return -1;
	}

	public static void main(String[] args) {
		String s = "ck077";
		System.out.println(secondHighest(s));
	}

}
