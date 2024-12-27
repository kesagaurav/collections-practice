import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words= {"cd","ac","dc","ca","zz"};
		System.out.println(words[0]);
		Arrays.sort(words);//ac,ac,cd,cd,zz
		
		System.out.println(maximumDifferece(words));

	}
	
	static boolean ok(String b,String a) {
			StringBuilder sb=new StringBuilder();
			if(sb.reverse().toString()==sb.reverse().toString()) {
				return true;
			}else {
				return false;
			}
	}
	
	static int maximumDifferece(String[] words) {
		int c=0;
		for(int i=0;i<words.length;i++) {
			for(int j=i+1;j<words.length;j++) {
				if(ok(words[i],words[j])) {
					c++;
				}
			}
		}
		return c;
	}

}
