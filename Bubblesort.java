public class Bubblesort {
	public static void main(String[] args) {
		int a[] = {5, 4, 3, -1, -2};
		// {9, 5, 2, 8, -1, 6, 3, 2, 1, 0};
		int n = a.length;
		for (int i = 0; i < n - 1; i++) {
			boolean sorted = true;
			for (int j = 0; j < n - i - 1; j++) {
				if (a[j + 1] < a[j]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
					sorted = false;
				}

			}
			if (sorted) break;
		}
		for (int item : a) {
			System.out.print(item + " ");
		}
	}
}