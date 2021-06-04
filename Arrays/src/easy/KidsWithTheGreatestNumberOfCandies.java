package easy;

import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {
	
	public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = candies[0];
		List<Boolean> listOfBoolean = new ArrayList<Boolean>(candies.length);
		for (int i = 1; i < candies.length; i++) {
			if (candies[i] > max) {
				max = candies[i];
			}
		}
		for (int i = 0; i < candies.length; i++) {
			if (max <= candies[i] + extraCandies) {
				listOfBoolean.add(true);
			} else
				listOfBoolean.add(false);
		}
		return listOfBoolean;
    }
	
	public static void main(String[] args) {
		int[] candies = {2,3,5,1,3};
		int extraCandies = 3 ;
		System.out.println(kidsWithCandies(candies, extraCandies));
	}

}
