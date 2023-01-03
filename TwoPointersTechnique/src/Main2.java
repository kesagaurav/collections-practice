
public class Main2 {

	public static void main(String[] args) {

		String s = "Let's take leetcode contest";
		System.out.println(reverseWords(s));
	}

	public static String reverseWords(String s) {
		String a[]=s.split(" ");
		String temp="";
		StringBuilder sb=new StringBuilder();
		
		  for(int i=0;i<a.length;i++) { 
			  //System.out.printf( " " + a[i]); } for(int
		  }
		  for(int i=a.length-1;i>=0;i--) { 
				String reverseWord="";

			  reverseWord=reverseWord+s.charAt(i); 
			  }
		 //temp=temp+reverseWord; 
		 System.out.println(temp);
		 
		
		
		return temp;
	}
	

}
