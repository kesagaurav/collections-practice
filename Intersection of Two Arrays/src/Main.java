import java.util.*;

public class Main {

	public static void main(String[] args) {

		int a[] = { 3, 5, 10, 10, 10, 15, 15, 20 };
		int b[] = { 5, 10, 10, 15, 30 };
		Intersection(a, b);

	}

	static void Intersection(int a[], int b[]) {
		int i = 0, j = 0;
		while (i < a.length && j<b.length) {

			if (i > 0 && a[i] == a[i - 1]) {

				i++;
				continue;

			}
			if (a[i] < b[j]) {
				i++;
			} else if (a[i] > b[j]) {
				j++;
			} else if (a[i] == b[j]) {
				System.out.println(a[i]);
				i++;
				j++;
			}
		}

	}

}
