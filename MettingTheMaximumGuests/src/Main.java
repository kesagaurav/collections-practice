import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		int arr[] = { 900, 600, 700};
        int dep[] = { 1000, 800, 730};
        int n = arr.length; 
        
        System.out.print(getMaxGuests(arr,dep));
		
	}
	
	static int getMaxGuests(int ar[],int dep[]) {
		Arrays.sort(ar);
		Arrays.sort(dep);
		int i=1,j=0,res=1,curr=1;
		while(i<ar.length && j<dep.length) {
			if(ar[i]<=dep[j]) {
				curr++;
				i++;
			}else {
				curr--;
				j++;
			}
			res=Math.max(res, curr);
		}
		return res;
	}

}
