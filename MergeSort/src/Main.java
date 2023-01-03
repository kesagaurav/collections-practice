
public class Main {

	public static void main(String[] args) {

		int a[] = { 2, 5, 12, 18, 20 };
		int b[] = { 7, 9, 11, 15, 25, 28, 30, 35 };
		MergeSort(a, b);
	}

	public static int[] mergeSort1(int a[], int low, int high) {
		int mid = (low + high) / 2;

		int[] start = mergeSort1(a, low, mid);
		int end[] = mergeSort1(a, mid + 1, high);
		int res[] = MergeSort(start, end);
		return res;

	}

	public static int[] MergeSort(int a[], int b[]) {
		int res[] = new int[a.length + b.length];
		int i = 0, j = 0, k = 0;
		while (i < a.length && j < b.length) {
			if (a[i] < b[j]) {
				res[k] = a[i];
				i++;
				k++;
			} else {
				res[k] = b[j];
				j++;
				k++;
			}
		}
		while (i < a.length) {
			res[k] = a[i];
			i++;
			k++;
		}
		while (j < b.length) {
			res[k] = b[j];
			j++;
			k++;
		}
		return res;
	}

}
