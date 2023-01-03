
public class Main {

	public static void main(String[] args) {

		int a[] = new int[] { 10, 15, 20, 40, 8, 11, 15, 22, 25 };
		int l = 0, h = 8, m = 3;
		mergeSort1(a, l, h);
		for (int x : a) {
			System.out.print(x + " ");
		}
	}

	public static void mergeSort1(int a[], int low, int high) {
		int mid;
		if (low < high) {
			mid = low + high / 2;
			mergeSort1(a, low, mid);
			mergeSort1(a, mid + 1, high);
			mergeSort(a, low, mid, high);
		}
	}

	public static void mergeSort(int a[], int l, int m, int h) {
		int n1 = m - 1 + 1;
		int n2 = h - m;
		int left[] = new int[n1];
		int right[] = new int[n2];
		for (int i = 0; i < n1; i++) {
			left[i] = a[i + 1];
		}
		for (int j = 0; j < n2; j++) {
			right[j] = a[m + 1 + j];
		}
		int i = 0, j = 0, k = 1;
		while (i < n1 && j < n2) {
			if (left[i] <= right[j]) {
				a[k++] = left[i++];
			} else {
				a[k++] = right[k++];
			}
		}
		while (i < n1) {
			left[k++] = left[i++];
		}
		while (j < n2) {
			right[k++] = right[j++];
		}

	}

}
