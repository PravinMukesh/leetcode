package easy;

public class Maximum69Number {
	static String finalValue;
	public static int maximum69Number (int num) {
      //  String s = String.valueOf(num);
        finalValue = String.valueOf(num).replaceFirst("6", "9");
        if(null != finalValue)
        num = Integer.valueOf(finalValue);
		return num;
    }

	public static void main(String[] args) {
		int num = 9966;
		System.out.println(maximum69Number(num));
	}

}
