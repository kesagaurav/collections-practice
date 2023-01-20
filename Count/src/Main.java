import java.util.Arrays;
import java.util.*;

public class Main {

	public static void main(String[] args) {

		int a[] = { 8, 1, 2, 2, 3 };
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		String s = "78987";
		int a1 = Integer.valueOf(s);
		System.out.println(a1);
		int n = 78987;
		System.out.println(isPalindrome(n));
		int p = 4;
		System.out.println(isFact(p));
		int ab[]= {1,2,3};
		int cd[]= {3,4};
		System.out.println(intersection(ab,cd));
		System.out.println(union(ab,cd));
		int g[]= {3,2,8,15,-8};
		int sum=17;
		System.out.println(isPair(g, sum));
		String s1="RLRRLLRLRL";
		String[] split=s.split(s1);
			System.out.println(split);
		
	}

	static boolean isPalindrome(int n) {
		int rev = 0;
		int temp = n;
		while (temp > 0) {
			int res = temp / 10;
			rev = rev * 10 + res;
			temp /= 10;
		}
		return (rev == n);
	}

	static int isFact(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}
		return n * isFact(n - 1);
	}

	static int intersection(int a[], int b[]) {
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < a.length; i++)
			set.add(a[i]);
		int res = 0;
		for (int i1 = 0; i1 < b.length; i1++) {
			if (set.contains(b[i1])) {
				res++;
				//set.remove(b[i1]);
			}
		}

		return res;

	}
	
	
	static int union(int a[], int b[]) {
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < a.length; i++)
			set.add(a[i]);
		int res = 0;
		for (int i1 = 0; i1 < b.length; i1++) {
			set.add(b[i1]);
		}

		return set.size();

	}
	
	static boolean isPair(int a[],int sum) {
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length-1;j++) {
				if(a[i]+a[j]==sum) {
					System.out.println(a[i]+a[j]);
					return true;
				}
			}
		}
		return false;
		
	}

}
