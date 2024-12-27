import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums= {8,1,2,2,3};
		System.out.println(smallerNumbersThanCurrent(nums).length);

	}
	
public static int[] smallerNumbersThanCurrent(int[] nums) {
	int[] ans = new int[nums.length];
    // iterate over nums in i loop
    for(int i = 0; i < nums.length; i++) {
        // declare counter
        int count = 0;
        // iterate over nums in j loop
        for(int j = 0; j < nums.length; j++) {
            // check that nums at i and j are not equals and j num is less than i num. if true increment counter
            if(nums[i] != nums[j] && nums[j] < nums[i]) count++;
        }
        // set i-th index of answer array as count
        ans[i] = count;
    }
    // return answer array
    return ans;
    }

}
