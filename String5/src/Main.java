
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="1-234-901";
		System.out.println();
		System.out.println("\t" + cleanPhone(s));
		String s1="gaurav";
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<s1.length();i++) {
			sb.append(s1.charAt(i));
			sb.reverse();
		}
		System.out.println(sb);

	}
	
	static String cleanPhone(String s) {
		StringBuilder sb=new StringBuilder(s);
		for(int i=0;i<s.length()-1;i++) {
			if(Character.isDigit(s.charAt(i))) {
				sb.append(s.charAt(i));
			}
		}
		return sb.toString();
	}

}
