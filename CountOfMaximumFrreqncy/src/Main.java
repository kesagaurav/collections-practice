import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = { 1,2,3,4,5 };
		System.out.println(countOfFreq(nums));
		//countOfFreq(nums);
	}

	static int countOfFreq(int nums[]) {
		HashMap<Integer, Integer> map = new HashMap<>();
		int max = 0;
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
		}
		int c=0;
//		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//			
////			System.out.println(entry.getKey() + " " + entry.getValue());
////			max+=Math.max(max, entry.getValue());
//				max=Math.max(max, entry.getValue());
//			
//
//			
//
//		}
		for(int i:map.values()) {
			max=Math.max(i, max);
		}
		int res=0;
		for(int count:map.values()) {
			if(count==max) {
				res+=count;
			}
		}
		return res;
	}

}
