import java.util.HashSet;

public class Main {

	public static void main(String[] args) {

		int[] L = { 1, 4, 9, 13, 21 };
		int[] R = { 15, 8, 12, 20, 30 };
		int n = L.length;
		System.out.println(maxAppear(L, R, n));
		double a=-11;
		double b=2;
		System.out.println(Math.floor(a/b));
		String c=Integer.toBinaryString((int) a);
		System.out.println(c);
		String hexString = Integer.toHexString((int) b);
		System.out.println(hexString + " ");
		String s="aab";
		StringBuilder sb=new StringBuilder();
		HashSet<Character> hs=new HashSet<>();
		for(int i=0;i<s.length()-1;i++) {
			if(s.charAt(i)==s.charAt(i+1)) {
				s.replaceAll("i", "");
				System.out.println(s.charAt(i));
			}
		}
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
