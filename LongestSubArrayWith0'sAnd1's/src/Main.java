import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 1, 1, 0, 1 };
		System.out.println(LongestSubArrayWith1And0(a));

	}

	public static int LongestSubArrayWith1And0(int a[]) {
		int res = 0;
		for (int i = 0; i < a.length; i++) {
			int c0 = 0, c1 = 0;
			for (int j = i; j < a.length; j++) {
				if (a[j] == 0) {
					c0++;
				} else 
					c1++;
				
				if (c0 == c1) {
					res = Math.max(c0, c0 + c1);
				}

			}
		}
		return res;
	}

}
