import java.util.*;
public class Main {

	public static void main(String[] args) {

		int n=10;
		int res=0;
		int a=16;
		System.out.println(countBits2(n));
		System.out.println(powerOf2(a));
		int a1[]= {4,3,4,4,4,5,5};
		int a2[]= {7,3,7,7,7};
		oddNosOcuuringOnce(a2);
	}
	
	public static int countBits(int n) {
		int res=0;
		while(n>0) {
		res+=(n&1); //n&(n-1)// res+=1;Brian and Kerningham Algorithm
		 n/=2;
		
	}
		return res;

	}
	
	// using lookuptable
	public static int countBits2(int n) {
		int table[]=new int[256];
		for(int i=0;i<table.length;i++) {
			table[i]=table[i&(i-1)]+1;
		}
		return table[n&255] + table[(n>>8)&255] + table[(n>>16)&255] + table[(n>>24)];
		
	}
	
	public static boolean powerOf2(int n) {
		if(n==0) return false;
		if((n&(n-1))==0) {
			return true;
		}
		return false;
	}
	
	private static void oddNosOcuuringOnce(int a[]) {
		int res=a[0];
		//n=a.length;
		for(int i=1;i<a.length;i++) {
			res=res^a[i];
			System.out.println(res);
		}
	}
	
	private static void oddNosOcuuringTwice(int a[]) {
		int res=a[0],k=0;
		//n=a.length;
		for(int i=1;i<a.length;i++) {
			res=res^a[i];
			 k =(res&~(res-1));
		}
		int res1=0,res2=0;
		for(int i=0;i<a.length;i++) {
			if((a[i]&k)!=0) {
				res1=res1^a[i];
			}else {
				res2=res2^a[i];
			}
		}
		System.out.println(res1);
		System.out.println(res2);
	}
	

}
