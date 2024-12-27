import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String rings="B0B6G0R6R0R6G9";
		System.out.println(countPoints(rings));

	}

	public static int countPoints(String rings) {
		HashMap<Integer,HashSet<Integer>> map=new HashMap<>();
		for(int i=0;i<rings.length();i+=2) {
			char ch=rings.charAt(i);
			int rod=rings.charAt(i+1);
			map.put(rod, map.getOrDefault(rod, new HashSet<>()));
			map.get(rod).add((int) ch);
			
		}
		int res=0;
		
		for (Map.Entry<Integer, HashSet<Integer>> entry : map.entrySet()) {
			
				if(entry.getValue().size()==3) {
					res++;
				}
		}
		
		return res;
	}

}
