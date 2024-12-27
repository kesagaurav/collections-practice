import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {16,17,4,3,5,2};
		System.out.println(leader(a));
		HashMap<String,Double> lmap=new HashMap<>();
		lmap.put("g", 43869.00);
		System.out.println(lmap);
	}
	
	static ArrayList<Integer> leader(int a[]){
		ArrayList<Integer> list=new ArrayList<>();
		int ans=a[a.length-2];
		for(int i=a.length-2;i>=0;i--) {
			if(a[i]>ans) {
				//a[i]=a[i+1];
				list.add(a[i+1]);
				ans=a[i];

			}

		}
		Collections.reverse(list);
		return list;
	}
	


}
