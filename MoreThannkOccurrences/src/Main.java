import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[] { 10, 10, 20, 30, 20, 10, 10 };

		int n = a.length;
		int k = 2;
		int a1[]= {30, 10, 20, 20, 20, 10, 40, 30, 30};
		n=a1.length;
		int k1=4;
		PrintNByK(a, n, k);
		PrintNByK2(a, n, k);
		PrintNByKMooreVotingAlgorithm(a1, n, k1);
	}

	public static void PrintNByK(int a[], int n, int k) {
		int i = 1, count = 1;
		Arrays.sort(a);
		while (i < n) {
			while (i < n && a[i] == a[i - 1]) {
				count++;
				i++;
			}

			if (count > n / k) {
				System.out.println(a[i - 1] + " ");
				count = 1;
				i++;
			}

		}
	}

	public static void PrintNByK2(int a[], int n, int k) {
		HashMap<Integer, Integer> hs = new HashMap<>();
		for (int x : a) {
			hs.put(x, hs.getOrDefault(x, 0) + 1);
		}
		for (Map.Entry<Integer, Integer> entry : hs.entrySet()) {
			if (entry.getValue() > n / k)
				System.out.println(entry.getKey() + " ");

		}
	}

// moore voting algorithm which is more than n/k times

	public static void PrintNByKMooreVotingAlgorithm(int a1[], int n, int k1) {
		HashMap<Integer, Integer> hs = new HashMap<>();
		int hc = 0;
		for (int i = 0; i < a1.length; i++) {
			if (hs.containsKey(a1[i])) {
				hc = hs.get(a1[i]);
				hs.put(a1[i], hc);

			} else if (hs.size() < k1 - 1) {
				hs.put(a1[i], 1);
			} else {
				for (Map.Entry<Integer, Integer> entry : hs.entrySet()) {
					int d = entry.getValue();
					hs.put(entry.getKey(), d - 1);
					if (entry.getKey() == 0) {
						hs.remove(entry.getKey());
					}

				}
			}
			for (Map.Entry<Integer, Integer> entry : hs.entrySet()) {
				int c = 0;

				for (int i1 = 0; i1 < a1.length; i1++) {
					if (entry.getKey() == a1[i1]) {
						c++;
					}
				}
				if (c > n / k1) 
					System.out.println(entry.getKey() + " ");
				
			}
		}
	}

}
