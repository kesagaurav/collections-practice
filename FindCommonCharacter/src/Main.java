import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words={"bella","label","roller"};
		System.out.println(findCommon(words));

	}
	
	static List<String> findCommon(String[] words){
		HashSet<String> set=new HashSet<>();
		List<String> list=new ArrayList<>(set);
		for(int i=0;i<words.length;i++) {
			if(set.contains(words[i])) {
				list.add(words[i]);
			}
			
		}
		return list;
	
	}

}
