import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words= {"leet","code"};
		char x='e';
		System.out.println(findWordsContaining(words, x));

	}

	
	 public static List<Integer> findWordsContaining(String[] words, char x) {
		 List<Integer> nums=new ArrayList<>();
		 for(int i=0;i<words.length;i++) {
			for(int j=0;j<words[i].length();j++) {
				 if(words[i].charAt(j)==x) {
					 nums.add(i);
					 break;
				 }
			}
		 }
		 return nums;
	    }
}
