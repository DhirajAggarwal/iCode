package programs;

public class SelectionSort {

	public static void main(String[] args) {
		SelectionSort ss = new SelectionSort();
		int[] arr = { 4, 90, 86, -1, -5, 87, 91 };
		ss.performSelectionSort(arr);
		ss.printArray(arr);
	}

	public void printArray(int[] array) {
		for (int singleArrayValue : array) {
			System.out.println(singleArrayValue);
		}
	}

	public void performSelectionSort(int[] array) {
		int length = array.length, min, j,temp;
		for (int i = 0; i < length-1; i++) {
			min = i;
			for (j = i + 1; j < length; j++) {
				if (array[min] > array[j]) {
					min = j;
				}
			}
			 temp = array[min];
            array[min] = array[i];
            array[i] = temp;
//			array[i] = array[i] ^ array[min];
//			array[min] = array[i] ^ array[min];
//			array[i] = array[i] ^ array[min];
			//System.out.println(array[min] +":"+array[i]);
		}
	}
}

// int k = 0;
// for (j = i + 1; j < length; j++) {
// if (min > array[j]) {
// min = array[j];
// k = j;
// }
// }
