import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;
import java.util.*;

public class Main {

	public static void main(String[] args) {
			String s="hello";
	System.out.println(reverseVowels(s));
	String s1="fourbyfourfrog";
	System.out.println(firstUniqChar(s1));
	String s2="FlaG";
	System.out.println(detectCapitalUse(s2));
	String s3="LOVELY";
	System.out.println(toLowerCase(s3));
	String s4="1010";
	String s5="1011";
	System.out.println(addBinary(s4, s5));
	}
	
	public static boolean isVowel(char c) {
		return (c=='a'||c=='e'||c=='i'||c=='o'||c=='u');
	}
	
	public static String reverseVowels(String s) {
		char ch2[]=s.toCharArray();
		int i=0;
		int j=s.length()-1;
		char temp=0;
		while(i<j) {
			if(!isVowel(ch2[i])) {
				i++;
				continue;
			}else if(!isVowel(ch2[j])) {
				j--;
				continue;
			}
			temp=ch2[i];
			ch2[i]=ch2[j];
			ch2[j]=temp;
			i++;
			j--;
		}
		
		
		
		String str1=String.copyValueOf(ch2);
		return str1;
	     
	
	
		
		
	
	}
	
	
	 public static int firstUniqChar(String s) {
		 char ch[]=s.toCharArray();
		 int index=-1;
		 Map<Character,Integer> maps=new HashMap<Character,Integer>();
	        for(char c:ch) {
	        	if(maps.containsKey(c)) {
	        		maps.put(c, maps.get(c)+1);
	        	}else {
	        		maps.put(c, 1);
	        	}
	        }
	        for(int i=0;i<s.length();i++) {
	        	if(maps.get(s.charAt(i))==1) {
	        		index=i;
	        		break;
	        	}
	        }
			return index;
	    }
	
	 
	 public static boolean detectCapitalUse(String word) {
		 	Set<String> sets=new HashSet<>();
		 	StringBuilder sb=new StringBuilder(word);
	        for(int i=0;i<word.length();i++){
	        	if(Character.isUpperCase(word.charAt(i))==Character.isUpperCase(word.charAt(i+1))) {
	        		return true;
	        	}
	        }
	        return true;
	            	    }
	 
	 
	   public static String toLowerCase(String s) {
	        for(int i=0;i<s.length();i++) {
	        	if(s.toUpperCase().charAt(i)!=0) {
	        		return s.toLowerCase();
	        	}
	        }
			return s;
	    }
	   
	   
	   public static String addBinary(String a, String b) {
		   
	        int c=Integer.parseInt(a,2);
	        int d=Integer.parseInt(b,2);
	        int sum=c+d;
	        System.out.println(sum);
			return Integer.toBinaryString(sum);
	    }
	
	
}
	



