import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {

		String s="leet**cod*e";
		System.out.println(removeStars(s));
		String s1="bcabc";
		System.out.println(removeDuplicates(s1));
	}
	
	public static String removeStars(String s) {
		Stack<Character> st=new Stack();
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!='*') {
				st.push(s.charAt(i));
				continue;
			}else {
				st.pop();
			}
			
		}
		if(st.isEmpty()) {
			return "";
		}
		while(!st.isEmpty()) {
			sb.append(st.pop());
		}
		return sb.reverse().toString();
	}
	
	
	public static String removeDuplicates(String s) {
		Set<Character> set=new HashSet();
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(s.indexOf(c)<0) {
				s+=c;
			}
		}
		return s;
	}


	}


