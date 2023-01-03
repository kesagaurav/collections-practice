
public class Main {

	public static void main(String[] args) {

		/*
		 * int a[] = { 2, 0, 4, 0, 3, 2, 0, 5, 2, 1, 3 }; int left[] = new
		 * int[a.length], right[] = new int[a.length], res = 0; for (int i = 0; i <
		 * a.length; i++) { left[i] = Math.max(i, i + 1);
		 * 
		 * }
		 * 
		 * for (int i = a.length - 1; i >= 0; i--) {
		 * 
		 * right[i] = Math.max(i, i + 1);
		 * 
		 * } for (int i = 0; i < a.length - 1; i++) { res += Math.min(left[i], right[i])
		 * - a[i]; System.out.println(res); }
		 */
		int a1[] = { 1, 0, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1 };
		System.out.println(count1s(a1));
		int sum[]= {-3,8,-2,4,5,6};
		System.out.println(maxSum(sum));
	}

	public static int count1s(int a[]) {
		int count = 0, res = 0;
		for (int i = 0; i < a.length; i++) {

			if (a[i] == 0) {
				count = 0;
			} else {
				count++;
				res = Math.max(res, count);
			}
		}

		return res;

	}
	
	
	
	public static int maxSum(int a[]) {
		int count = 0, res = a[0],maxEnding=a[0];
		for (int i = 1; i < a.length; i++) {

			maxEnding=Math.max(maxEnding+a[i], a[i]);
			res=Math.max(res, maxEnding);
		}

		return res;

	}

	
	public static int EvenOdd(int a[]) {
		int count = 0, curr=0,res=0;
		for (int i = 1; i < a.length; i++) {

			if(a[i]%2==0 && a[i-1]%2!=0 || a[i-1]%2==0 && a[i]%2!=0) {
				curr++;
			}else {
				break;
			}
			res=Math.max(res, curr);
		}

		return res;

	}
}
