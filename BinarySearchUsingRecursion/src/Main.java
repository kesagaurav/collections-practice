import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int low = 1, high = 9, value = 7;
		System.out.println(binarySearch(a, low, high, value));

	}

	public static int binarySearch(int a[], int low, int high, int value) {
		int mid = Math.floorDiv(low, high) / 2;
		Arrays.sort(a);
		if (low < high) {
			if (a[mid] == value) {
				return mid;
			} else if (a[mid] < value) {
				return binarySearch(a, low, mid - 1, value);
			} else if (a[mid] > value) {
				return binarySearch(a, mid + 1, high, value);
			} else {
				return value;
			}
		}
		return -1;
	}

}
