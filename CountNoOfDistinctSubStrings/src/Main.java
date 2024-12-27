import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abcd";
		HashSet<String> set=new HashSet<>();
		for(int i=0;i<=s.length();i++) {
			for(int j=i+1;j<=s.length();j++) {
				set.add(s.substring(i, j));
			}
		}
		System.out.println(set.size());

	}

}
