package programs;

public class InsertionSort {

	public static void main(String[] args) {
		InsertionSort iS = new InsertionSort();
		int[] arr = { 4, 90, 85, 1, 5, 7,11,-1,1};
		iS.performInsertionSort(arr);
		iS.printArray(arr);
	}

	public void printArray(int[] array) {
		for (int singleArrayValue : array) {
			System.out.println(singleArrayValue);
		}
	}

	public void performInsertionSort(int[] a) {
		int tempI;
		for (int i = 1; i < a.length; i++) {
			for (int j = 0; j <= i-1 ; j++) {
				if (a[i] <= a[j]) {
					tempI = a[i];
					for(int k = i; k > j; k--){
						a[k] = a[k-1];
					}
					a[j] = tempI;
				}
			}
		}
	}
}
