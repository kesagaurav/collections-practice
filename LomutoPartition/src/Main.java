
public class Main {

	public static void main(String[] args) {
		int a[] = { 10, 80, 30, 90, 40, 50, 70 };

		int n = a.length;
		iPartition(a, 0, n - 1);

		for (int x : a)
			System.out.print(x + " ");

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
		System.out.println("pivot ele is " + (i+1) + " is " + a[i+1]);
		return (i + 1);
	}

}
