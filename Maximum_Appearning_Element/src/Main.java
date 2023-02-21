
public class Main {

	public static void main(String[] args) {

		int[] L = { 1, 4, 9, 13, 21 };
		int[] R = { 15, 8, 12, 20, 30 };
		int n = L.length;
		System.out.println(maxAppear(L, R, n));
	}

	
	public static int maxAppear(int left[],int right[],int n) {
		int freq[]=new int[101];
		for(int i=0;i<n;i++) {
			freq[left[i]]++;
			freq[right[i]+1]--;
		}
		int res=0;
		for(int i=1;i<100;i++) {
			freq[i]=freq[i-1]+freq[i];
			if(freq[i]>freq[res]) {
				res=i;
			}
		}
		return res;
		
	}
}
