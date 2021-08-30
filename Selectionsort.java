public class Selectionsort {
	public static void main(String[] args) {
		int a[] = {9, 4, 2, -3, -1, 5, 0};
		int n = a.length;
		for (int i = 0; i < n - 1; i++) {
			int minInd = i;
			for (int j = i; j < n; j++) {
				if (a[j] < a[minInd]) {
					mindInd = j;
				}
				int temp = a[i];
				a[i] = a[minInd];
				a[minInd] = temp;
			}
		}
		for (int item : a) {
			System.out.print(item + " ");
		}
	}
}