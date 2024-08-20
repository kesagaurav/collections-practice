import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums1[]= {1,2,3,3};
		int nums2[]= {1,1,2,2};
		System.out.println(minDiff(nums1, nums2));

	}
	
	static List<List<Integer>> minDiff(int []nums1,int []nums2){
		HashSet<Integer> set=new HashSet<>();
		HashSet<Integer> set2=new HashSet<>();
		List<List<Integer>> list=new ArrayList<>();
		List<Integer> l1=new ArrayList<>();
		List<Integer> l2=new ArrayList<>();
		
		
		for(int num:nums1) {
			set.add(num);
			
		}
		
		for(int num:nums2) {
			set2.add(num);
			
		}
		
		for(int num:nums1) {
			if(!set2.contains(num)) {
				l1.add(num);
			}
		}
		list.add(l1);
		for(int num:nums2) {
			if(!set.contains(num)) {
				l2.add(num);
			}
		}
		list.add(l2);
		return list;
	}

}
