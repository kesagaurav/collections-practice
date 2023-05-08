
public class Main {

	public static void main(String[] args) {

		int n=10;
		String s=Integer.toBinaryString(n);
		System.out.println(s);
		int c=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==1) {
				c++;
			}
		}
		System.out.println(c);
	}

}
