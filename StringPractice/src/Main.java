import java.util.Arrays;
import java.util.stream.Stream;

import javax.xml.transform.Templates;

public class Main {

	public static void main(String[] args) {

		String str[]= {"flower","flow","flight"};
		PrefixString(str);
		String s="[}";
		String len="hello world";
		String a="anagram" ; 
		String b="nagaram";
		System.out.println(isAnagram(s, b));
	}
	
	public static String PrefixString(String str[]) {
		Arrays.sort(str);
		char[] a=str[0].toCharArray();
		char[] b=str[str.length-1].toCharArray();
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<a.length;i++) {
			if(a[i]!=b[i]) 
				break;
				sb.append(a[i]);
			
		}
		return sb.toString();
	}
		
		public static boolean validParethesis(String s) {
			for(int i=0;i<s.length();i++) {
				if(s.startsWith("(")||s.startsWith("{")||s.startsWith("[")) {
					return true;
				}
			}
			return false;
		
			}
		
		
		 public static boolean isAnagram(String s, String t) {
		        if(s.length()!=t.length()) {
		        	return false;
		        }
		        char a[]=s.toCharArray();
		        char b[]=t.toCharArray();
		        Arrays.sort(a);
		        Arrays.sort(b);
		        return Arrays.equals(a, b);
		    }
		 
		

}
