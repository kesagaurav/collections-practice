
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="axc";
		String t="abhdc";
		System.out.println(isSubsequence(s, t));

	}
	
	public static boolean isSubsequence(String s,String t) {
		for(int i=0;i<s.length();i++) {
			for(int j=0;j<t.length();j++) {
				if(s.charAt(i)==s.charAt(j)) {
					return true;
				}
			}
		}
		return false;
	}

}
