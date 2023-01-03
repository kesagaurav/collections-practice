
public class Main {

	public static void main(String[] args) {
		int a[]= {10,5,30,15,7};
		int low=0,mid=2,high=4;
		//merge(a, low, high, mid); it is before using recursive function for merge sort
		merge1(a, high, low);
		for(int x:a)
			System.out.print(x + " ");

	}
	
	public static void merge1(int a[],int high,int low) {
		int mid;
		if(low<high) {
			mid=low+high/2;
			merge1(a, low,mid);
			merge1(a,mid+1,high);
			merge(a, low, high, mid);
		}
	}
	
	public static void merge(int a[],int low,int high,int mid) {
		int n1=mid-low+1;
		int n2=high-mid;
		int left[]=new int[n1];
		int right[]=new int[n2];
		for(int i=0;i<n1;i++) // left
			left[i]=a[low+i];
		for(int j=0;j<n2;j++) //right
			right[j]=a[mid+1+j];
		int i=0,j=0,k=low;
		while(i<n1 && j<n2) {
			if(left[i]<=right[j]) {
				a[k]=left[i];
				i++;
				k++;
			}else {
				a[k]=right[j];
				j++;
				k++;
			}
		}
		while(i<n1) {
			a[k]=left[i];
			i++;
			k++;
		}
		while(j<n2) {
			a[k]=right[j];
			j++;
			k++;
		}
		
		
	}

}
