import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums1= {2,3,2};
		int [] nums2= {1,2};
		System.out.println(findIntersectionValues(nums1, nums2));
		
		for(int nums:nums1) {
			System.out.println(nums);
		}

	}
	
public static int[] findIntersectionValues(int[] nums1, int[] nums2) {
        Set<Integer> set=new HashSet<>();
        Set<Integer> set2=new HashSet<>();
        int c1=0,c2=0;
        int [] count=new int[2];
        for(int num:nums1) {
        	set.add(num);
        }
        for(int num:nums2) {
        	set2.add(num);
        }
        for(int num:nums1) {
        	count[0]+=set2.contains(num)? 1:0;
        }
        
        for(int num:nums2) {
        	count[1]+=set.contains(num)? 1:0;

        }
        
        return count;
    }

}
