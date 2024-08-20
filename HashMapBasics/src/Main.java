import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Character,Integer> map=new HashMap<>();
		map.put('a',1);
		map.put('b',11);
		map.put('c',12);
		map.put('d',13);
		map.put('e',14);
		System.out.println(map);
		System.out.println(map.get('c'));
		for(int i=0;i<map.size();i++) {
			if(map.get(i)%2==0) {
				System.out.println("even is " + map.get(i).intValue());
			}
		}

	}

}
