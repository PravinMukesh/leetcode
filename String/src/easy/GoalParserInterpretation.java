package easy;

public class GoalParserInterpretation {

	static StringBuilder sb = new StringBuilder();
    public static String interpret(String command) {
        for(int i = 0; i < command.length(); i++) {
        	if(command.charAt(i) == 'G')
        		sb.append(command.charAt(i));
        	if(command.charAt(i) == '(' && command.charAt(i+1) == 'a')
        		sb.append("al");
        	if(command.charAt(i) == '(' && command.charAt(i+1) == ')')
        		sb.append("o");
        }
    	return sb.toString();
    }

	
	public static void main(String[] args) {
		//String command = "G()()()()(al)";
		String command = "()(al)G()()()()";
		System.out.println(interpret(command));
	}

}
