package programs;

public class MergeSort {

	public static void main(String[] args) {
		MergeSort ms = new MergeSort();
		int[] arr = { 4, 90, 85, -1, -5 };
		ms.mergeSort(arr, 0, arr.length - 1);
		ms.printArray(arr);
	}

	public void printArray(int[] array) {
		for (int singleArrayValue : array) {
			System.out.println(singleArrayValue);
		}
	}

	public void mergeSort(int[] arr, int l, int r) {
		int m = 0;
		if (l < r) {
			m = (l + r) / 2;
			mergeSort(arr, l, m);
			mergeSort(arr, m + 1, r);
			merge(arr, l, r, m);
		}
	}

	public void merge(int[] arr, int l, int r, int m) {
		int[] L = new int[] {};
		int[] R = new int[] {};

		for (int i = 0; i < m; ++i) {
			L[i] = arr[i + l];
		}

		for (int j = 0; j < arr.length - m; ++j) {
			R[j] = arr[m + 1 + j];
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (L[i] <= R[i]) {
				arr[i] = L[i];
			} else {
				arr[i] = R[i];
			}
		}
	}
}
