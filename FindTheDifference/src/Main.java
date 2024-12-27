import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abcd";
		String t="bcade";
		
		findTheDifference( s, t);

	}

	
	public static char findTheDifference(String s,String t) {
		char a[]=s.toCharArray();
		char b[]=t.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		System.out.println("modified array is " + Arrays.toString(b));
		int j=0;
		for(int i=0;i<s.length();i++) {
			for(j=0;j<s.length()-1;j++) {
				if(s.charAt(i)!=s.charAt(j)) {
					System.out.println(s.charAt(j));
				}
			}
		}
		return s.charAt(j);
		
	}
}
