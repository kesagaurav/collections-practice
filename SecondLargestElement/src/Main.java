
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 5, 10, 20, 12, 20 };
		//System.out.println(secondLargest(a));
		System.out.println(secondLargestEff(a));

	}

	static int largest(int a[]) {
		int largest = 0;
		for (int i = 1; i < a.length; i++) {
			if (a[i] > largest) {
				largest = a[i];
			}
		}
		return largest;
	}

	static int secondLargest(int a[]) {
		int largest = largest(a);
		int n = a.length;
		int res = -1;
		for (int i = 0; i < n; i++) {
			if (a[i] != a[largest]) {
				if (res == -1)
					res = i;
				else if (a[i] > a[res])
					res = i;

			}
		}
		return res;
	}
	
	//efficent approach
	static int secondLargestEff(int a[]) {
		int res=-1,largest=0;
		for(int i=1;i<a.length;i++) {
			if(a[i]>a[largest]) {
				res=largest;
				largest=i;
			}else if(a[i]!=largest) {
				if(res==-1 || a[i]>a[res]) {
					res=i;
				}
			}
		}
		return res;
	}

}
