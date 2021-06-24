package easy;

import java.util.ArrayList;
import java.util.List;

public class SubdomainVisitCount {

    public static List<String> subdomainVisits(String[] cpdomains) {
        List<String> list = new ArrayList<>();
        for(String s : cpdomains) {

        	list.add(s);
        }
        return list;
    }
	
	public static void main(String[] args) {
		String[] cpdomains = {"9001 discuss.leetcode.com", "1 leetcode.com"};
		System.out.println(subdomainVisits(cpdomains));
	}

}
