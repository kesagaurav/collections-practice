
public class Main {

	public static void main(String[] args) {

		int a[]= {5,13,6,9,12,11,8};
		int low=0;
		int p=6;
		int high=6;
		int temp[]=new int[high-low+1];
		int index=0;
		for(int i=low;i<=high;i++) {
			while(a[i]<=a[p]) {
				temp[index]=a[i];
				index++;
				
			}
		}
		for(int i=low;i<=high;i++) {
			while(a[i]>a[p]) {
				temp[index]=a[i];
				index++;
				
			}
		}
		
		for(int i=low;i<=high;i++) {
			a[i]=temp[i-1];
		}
	}

}
