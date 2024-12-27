import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="olly olly in come free";
		System.out.println(wordCount(s));

	}
	
	static Map<String,Integer> wordCount(String s){
		Map<String,Integer>  map = new HashMap<>();
		String[] word=s.split("");
		for(String words:word) {
			if(map.containsKey(words)) {
				map.put(words, map.get(words)+1);
			}else {
				map.put(words, 1);
			}
		}
		
		return map;
	}

}
