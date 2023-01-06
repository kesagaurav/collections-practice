
public class Homuto {

	public static void main(String[] args) {
		int a[] = new int[] { 5, 3, 8, 4, 2, 7, 1, 10 };
		int n = a.length;
		HomutoPartiton(a, 0, n - 1);

		for (int x : a)
			System.out.print(x + " ");
	}
	
	public static void qSort(int a[],int l,int h) {
		if(l<h) {
			int p=HomutoPartiton(a, l, h);
			qSort(a, l, p);
			qSort(a, p+1, h);
		}
	}

	public static int HomutoPartiton(int a[], int l, int h) {
		int pivot = a[l];
		int i = l - 1;
		int j = h + 1;
		while (true) {
			do {
				i++;
			} while (a[i] < pivot);
			do {
				j--;
			} while (a[j] > pivot);
			if (i >= j)
				return j;
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}
	}

}
