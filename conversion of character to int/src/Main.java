
public class Main {

	public static void main(String[] args) {

		String s = "123";
		String t="23";
		char b[]=s.toCharArray();
		
		for(int i=0;i<s.length();i++) {
			char a=s.charAt(i);
			//one way
			int numericValue = Character.getNumericValue(a);
			System.out.println(numericValue);
			//second way
	
			
		}
		for(int i=0;i<t.length();i++) {
			char d=t.charAt(i);
			int b1=Integer.parseInt(t.valueOf(d));
			System.out.println(b1);
		}
	}

}
