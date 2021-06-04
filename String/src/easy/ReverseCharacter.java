package easy;

public class ReverseCharacter {
	static StringBuffer sb = new StringBuffer();
	
	public static void main(String[] args) {
		char[] s = {'H','e','l','l','o'};
        for(int i = s.length-1; i >= 0 ; i--) {
			sb.append(s[i]);
		}
        returnCharArray(sb.toString());
    }
    
    public static char[] returnCharArray(String str){
        return str.toCharArray();
    }
	
	

}
