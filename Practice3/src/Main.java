import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.*;

public class Main {

	public static void main(String[] args) {

		String s = "Today is Friday";
		List<String> list = new ArrayList<>();
		list.add(s);
		System.out.println(Arrays.asList(list));
		HashMap<String, Integer> hiv = new HashMap<>();
		hiv.put("guarav", 1);
		hiv.put("deepa", 2);
		for (Map.Entry<String, Integer> ok : hiv.entrySet()) {
			System.out.println("key is " + ok.getKey() + " value is " + ok.getValue());
		}
		int a[] = { 10, 10, 5, 20, 5 };
		HashMap<Integer, Integer> hamp = new HashMap<>();
		for (int i = 0; i < a.length; i++) {

			hamp.put(a[i], hamp.getOrDefault(a[i], 0) + 1);
			if(hamp.containsKey(a[i])) {
			System.out.println(hamp.remove(a[i]));
			}
			hamp.size();
		}
		for (Map.Entry<Integer, Integer> hmap1 : hamp.entrySet()) {
			System.out.println(hmap1.getKey() + "  " + hmap1.getValue());
		}
		HashMap<Integer,Integer> hm=new HashMap<>();
		System.out.println(hm.size());
		ArrayList<Integer> al=new ArrayList<>();
		int n=al.size();
		al.add(10);
		al.add(10);
		al.add(20);
		al.add(5);
		al.add(5);
		al.add(5);
		frequencyCount(al, n);
		
	}
	
	
	
	
	public static ArrayList<Integer> frequencyCount(ArrayList<Integer>arr, int n)
	{
		LinkedHashMap<Integer,Integer> hmap=new LinkedHashMap<>();
		for(int i=0;i<arr.size();i++) {
			hmap.put(arr.get(i), hmap.getOrDefault(arr.get(i), 0)+1);
		}
		
		ArrayList<Integer> hmap1=new ArrayList<>(hmap.values());
		System.out.println(hmap1);
		
		return hmap1;
	}

}
