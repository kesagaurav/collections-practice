import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums=Arrays.asList(-6,2,5,-2,-7,-1,3);
		int target=-2;
		System.out.println(countPairs(nums, target));

	}

	public  static int countPairs(List<Integer> nums, int target) {
		int c=0;
			for(int i=0;i<nums.size()-1;i++) {
				for (int j = i+1; j < nums.size(); j++) {
					if(nums.get(i)+nums.get(j)<target) {
						c++;
					}
				}
				
			}
			return c;
	}
}
