
public class Main {

	public static void main(String[] args) {
		int a[] = new int[] { 8, 4, 7, 9, 3, 10, 5 };

		int n = a.length;
		quickSort(a, 0, n - 1);

		for (int x : a)
			System.out.print(x + " ");

	}

	public static void quickSort(int a[], int l, int h) {
		if (l < h) {
			int p = iPartition(a, l, h);
			quickSort(a, l, p - 1);
			quickSort(a, p + 1, h);
		}
	}

	public static int iPartition(int a[], int l, int h) {
		int pivot = a[h];
		int i = l - 1;
		for (int j = l; j <= h - 1; j++) {
			if (a[j] < pivot) {
				i++;
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		int temp1 = a[i + 1];
		a[i + 1] = a[h];
		a[h] = temp1;
		System.out.println("pivot ele is " + (i + 1) + " is " + a[i + 1]);
		return (i + 1);

	}
}
