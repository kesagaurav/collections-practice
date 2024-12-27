
public class Main {

	public static void main(String[] args) {

		int a=2;
		if(isEvenOrOdd(a)) {
			System.out.println("even");
		}else {
			System.out.println("odd");
		}
		
		String s="gaurav";
		System.out.println(isVowle1(s));
		
		String b="gaurav is my best friend";
		String  c[]=b.split(" ");
	}
	
	
	public static boolean isEvenOrOdd(int a) {
		if(a%2==0) {
			return true;
		}else {

			return false;
		}
	}
	
	
	public static boolean isVowel(char c) {
		return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
	}
	
	public static String isVowle1(String s) {
		String vowels1="";
		StringBuffer sb=new StringBuffer(s);
		for(int i=0;i<s.length();i++) {
			if(isVowel(s.charAt(i))) {
				vowels1+=s.charAt(i);
			}
		}
		return vowels1;
	}

}
