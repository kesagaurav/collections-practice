import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Stream;
public class Main {

	public static void main(String[] args) {
		String s="255.100.50.0";
		System.out.println(defangIPaddr(s));
		String a[]= {"--x","++x","++x"};
		System.out.println(finalValueAfterOperations(a));
		String b[]= {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
		String c="(al)G(al)()()G";
		System.out.println(interpret(c));
		String d="codeleet";
		int e[]= {4,5,6,7,0,2,1,3};
		System.out.println(restoreString(s, e));
		String h="z";
		String j="ZZ";
		System.out.println(numJewelsInStones(h,j));
		String o="is2 sentence4 This1 a3";
		sortSentence(o);
		String[] t1= {"ab","c"};
		String[] t2= {"a","bc"};
		arrayStringsAreEqual(t1, t2);
	}
	
	
	 public  static String defangIPaddr(String address) {
		 for(int i=0;i<address.length();i++) {
			 if(address.charAt(i)=='.') {
				 return address.replace(".", "[.]");
			 }
		 }
		 return null;
	        
	    }
	 
	 public static int finalValueAfterOperations(String[] operations) {
	        int x=0;
	        
	 		for(int i=0;i<operations.length;i++) {
	 			if(operations[i].equals("--")) {
	 				x=x-1;
	 			}else if(operations[i].equals("++")) {
	 				x=x+1;
	 			}else {
	 				continue;
	 			}
	    }
			return x;
		
			
	

}
	 
	 
	 public static int mostWordsFound(String[] sentences) {
			long iot=Arrays.stream(sentences).max((i,j)->i.compareTo(j)).get().chars().count();
			int max=0;
			 for(int i=0;i<sentences.length;i++) { 
				max=Math.max(max, sentences[i].split("").length);
				 }
			 
				return max;
		    }
	 
	 public static String interpret(String command) {
	        StringBuilder sb=new StringBuilder(command);
	       command= command.replace("()","o");
	     command=   command.replace("(al)", "al");
	       command= command.replace("G", "G");
			return command;
	     
	    }
	 
	 
	 
	 public static String restoreString(String s, int[] indices) {
		 
		 char ch[]=new char[indices.length];
		 for(int i=0;i<indices.length;i++) {
			 ch[indices[i]]=s.charAt(i);
		 }
		 return new String(ch);
	        
	    }
	 
	 public static int numJewelsInStones(String jewels, String stones) {
		 int k=0;
	        for(int i=0;i<jewels.length();i++) {
	        	for(int j=0;j<stones.length();j++) {
	        		if(jewels.charAt(i)==stones.charAt(j)) {
	        			k++;
	        		}
	        	}
	        }
			return k;
	    }
	 
	 public static void sortSentence(String s) {
		 char ch[]=s.toCharArray();
	        char temp=0;
	      HashMap<Integer,String> hmap=new HashMap<>();
	      for(int i=0;i<ch.length;i++) {
	    	  for(int j=i+1;j<ch.length-1;j++) {
	    		  temp=ch[i];
	    		  ch[i]=ch[j];
	    		  ch[j]=temp;
	    	  }
	    	  System.out.println(temp);

	      }
	    }
	 
	 public static void arrayStringsAreEqual(String[] word1, String[] word2) {
		 	char temp=0;
		 for(int i=0;i<word1.length-1;i++) {
			  temp+=word1[i].concat(word1[i]).charAt(i);
			  System.out.println(temp);
		 }
	    }
	 
	
}
