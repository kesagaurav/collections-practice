import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "gaurav";
//		s.chars().distinct().mapToObj(c->(char)c).collect(Collectors.toList()).forEach(e->System.out.println(e));
		s.chars().distinct().mapToObj(a -> (char) a).forEach(e -> System.out.println(e));
		List<String> list = Arrays.asList("gaurav", "deepa");
		list.stream().map(a -> a).forEach(e -> System.out.println(e));
		String s2 = "***//gaurav";
		for (int i = 0; i < s2.length(); i++) {
			if (Character.isLetter(s2.charAt(i))) {
				System.out.println(s.charAt(i));
			} else {
				break;
			}
		}
		System.out.println(s2);

		String s3 = "***//gaurav";
		String result = Pattern.compile("[^a-zA-Z0-9]").matcher(s3).replaceAll("");
		System.out.println(result); // Output: gaurav
		s3.chars().mapToObj(a -> (char) a).filter(Character::isLetterOrDigit).collect(Collectors.toList())
				.forEach(e -> System.out.println(e));
		
		String s1="1243gaurav";
		System.out.println("without using nos woth ouytput");
		s1.chars().mapToObj(a->(char)a).filter(Character::isLetter).collect(Collectors.toList()).forEach(e->System.out.println(e));
	
		String s4="&&&***@@##$%^&*((gaurav&&&&&&(())))kesa@#$%^&**()!)!)!)!)deepa";
		System.out.println("removing all specila characters");
		s4.chars().mapToObj(a->(char)a).filter(Character::isLetter).collect(Collectors.toList()).forEach(e->System.out.println(e));
	
		for(int i=0;i<s4.length()-1;i++) {
			if(Character.isLetter(s.charAt(i))) {
				System.out.println(s.charAt(i));
			}else {
				continue;
			}
		}
	
	}

}
