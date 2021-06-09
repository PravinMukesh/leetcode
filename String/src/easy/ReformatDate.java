package easy;

public class ReformatDate {

	public static String reformatDate(String date) {
		StringBuilder sb = new StringBuilder();
		String[] str = date.split(" ");
		sb.append(str[2]);
		switch (str[1]) {
		case "Jan":
			sb.append("-" + "01" + "-");
			break;
		case "Feb":
			sb.append("-" + "02" + "-");
			break;
		case "Mar":
			sb.append("-" + "03" + "-");
			break;
		case "Apr":
			sb.append("-" + "04" + "-");
			break;
		case "May":
			sb.append("-" + "05" + "-");
			break;
		case "Jun":
			sb.append("-" + "06" + "-");
			break;
		case "Jul":
			sb.append("-" + "07" + "-");
			break;
		case "Aug":
			sb.append("-" + "08" + "-");
			break;
		case "Sep":
			sb.append("-" + "09" + "-");
			break;
		case "Oct":
			sb.append("-" + "10" + "-");
			break;
		case "Nov":
			sb.append("-" + "11" + "-");
			break;
		case "Dec":
			sb.append("-" + "12" + "-");
			break;
		default:
			break;
		}
		for (int i = 0; i < str[0].length(); i++) {
			if (Character.isDigit(str[0].charAt(i)))
				if (str[0].length() == 4)
					sb.append(str[0].charAt(i));
				else
					sb.append("0"+str[0].charAt(i));
		}
		return sb.toString();
	}

	public static void main(String[] args) {
//		String date = "20th Jun 2016";
		String date = "6th Jun 1933";
//		String date = "26th May 1960";
		System.out.println(reformatDate(date));
	}

}
