package firstuniquecharacter;
import java.util.*;
public class Main {

	public static void main(String[] args) {

		String s="leetcode";
		System.out.println(first(s));
		String a="gaurav";
		int indexOf = a.indexOf(a);
		System.out.println(indexOf + a.charAt(0));

	}
	
	static int first(String s) {
		int c=0;
		int i;
		for(i=0;i<s.length()-1;i++) {
			if(s.indexOf(s.charAt(i))==s.indexOf(s.charAt(i+1))) {
				c++;
			}
		}
		if(c==1) {
			return i;
		}
		return -1;
	}

}
