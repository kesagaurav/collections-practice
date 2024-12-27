import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums1= {1,1,3,2};
		int [] nums2= {2,3};
		int [] nums3= {3};
		System.out.println(twoOutOfThree(nums1, nums2, nums3));

	}
	
	static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
		List<Integer> list1=new ArrayList<>();
		Set<Integer> set1=new HashSet<>();
		Set<Integer> set2=new HashSet<>();
		Set<Integer> set3=new HashSet<>();
		Set<Integer> set=new HashSet<>();

		for(int num:nums1) {
			set.add(num);
			set1.add(num);
		}
		for (int num:nums2) {
			set.add(num);

			set2.add(num);
		}
		for (int num:nums3) {
			set.add(num);

			set3.add(num);
		}
//		for(int num:set1) {
//			if(set2.contains(num)&&set1.contains(num)) {
//				list1.add(num);
//			}
//		}
//		
//		for(int num:set2) {
//			if(set1.contains(num)&&set3.contains(num)) {
//				
//				list1.add(num);
//			}
//		}
//		
//		for(int num:set3) {
//			if(set2.contains(num)&&set1.contains(num)) {
//				list1.add(num);
//			}
//		}
		for(int num:set) {
			if(set2.contains(num)&&set1.contains(num) || set1.contains(num)&&set3.contains(num)|| set1.contains(num)&&set2.contains(num)) {
				list1.add(num);
			}
		}
		return list1;

		
    }

}
