import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 0, -1, 2, -3, 1 };// -1,-3,0,1,2
		// Arrays.sort(a);
		int target = -2;
		System.out.println(targetSum(a, target));
		// System.out.println(targetSumTwoPointer(a, target));
		System.out.println(targetSumHashSet(a, target));

	}

	static boolean targetSum(int a[], int target) {

		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {
				if (a[i] + a[j] == target) {
					return true;
				}
			}
		}
		return false;
	}

	// using two pointer technique.
	static boolean targetSumTwoPointer(int a[], int target) {

		int low = 0;
		int high = a.length - 1;
		Arrays.sort(a);
		while (low < high) {
			int sum = a[low] + a[high];
			if (sum == target) {
				return true;
			} else if (sum < target) {
				low--;
			} else {
				high++;
			}
		}

		return false;

	}

	// using hashset.
	static boolean targetSumHashSet(int a[], int target) {

		HashSet<Integer> set = new HashSet<>();
		for (int i = 0; i < a.length; i++) {
			if (set.contains(a[i] - target)) {

				return true;
			} else {
				set.add(a[i]);
			}
		}
		return false;

	}

}
