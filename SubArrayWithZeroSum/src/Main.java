import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { -1, 4, -3, 5, 1 };
		System.out.println(subArrayWithGivenSum1(a));

	}

	public static boolean subArrayWithGivenSum(int a[]) {
		for (int i = 0; i < a.length; i++) {// -1
			for (int j = 0; j < a.length; j++) {// -1
				if (a[i] + a[j] == 0) {//
					return true;
				}
			}
		}
		return false;
	}

	public static boolean subArrayWithGivenSum1(int a[]) {
		int prefix_sum = 0;
		HashSet<Integer> set = new HashSet<>();
		for (int i = 0; i < a.length; i++) {// -1
			prefix_sum += a[i];
			if (set.contains(prefix_sum)) {
				return true;
			}
			if (prefix_sum == 0)

				return true;
			set.add(a[i]);

		}
		return false;
	}

}
