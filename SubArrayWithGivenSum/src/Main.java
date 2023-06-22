import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 5, 8, 6, 13, 3, -1 };
		int sum = 22;
		int curr_sum = 0;

		/*
		 * for (int i = 0; i < a.length; i++) { for (int j = i; j < a.length; j++) {
		 * curr_sum += a[j]; if (curr_sum == sum) System.out.println("true");
		 * 
		 * }
		 * 
		 * }
		 */
		System.out.println(isGivenSum(a, sum));

	}

	public static boolean isGivenSum(int a[], int sum) {
		HashSet<Integer> set = new HashSet<>();
		int prefix_sum = 0;
		for (int i = 0; i < a.length; i++) {
			if (set.isEmpty()) {
				set.add(a[i]);
			}
			prefix_sum += a[i];
			if (set.contains(prefix_sum)) {
				return true;
			}
			if (set.contains(prefix_sum - sum)) {
				return true;
			}else {
				set.add(a[i]);
			}
		}
		return false;
	}

}
