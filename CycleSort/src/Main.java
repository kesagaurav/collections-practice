
public class Main {

	public static void main(String[] args) {
		int a[] = { 20, 40, 50, 10, 30 };

		cycleSort(a);
	}

	public static void cycleSort(int a[]) {
		for (int i = 0; i < a.length; i++) {
			int item = a[i];
			int pos = i;
			if (a[i] < item) {
				pos++;

				int temp = item;
				item = a[pos];
				a[pos] = temp;
			}
			while (pos != i) {
				pos = i;
				for (int j = i + 1; j < a.length; j++) {
					if (a[j] < item) {
						pos++;
						int temp1 = item;
						item = a[pos];
						a[pos] = temp1;
					}
				}
			}
		}
	}

}
