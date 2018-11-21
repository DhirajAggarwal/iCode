package programs;

public class BubbleSort {

	public static void main(String[] args) {
		BubbleSort bs = new BubbleSort();
		int[] arr = { 4, 90, 85, -1, -5 };
		bs.performBubbleSort(arr);
		bs.printArray(arr);
	}

	public void printArray(int[] array) {
		for (int singleArrayValue : array) {
			System.out.println(singleArrayValue);
		}
	}

	public void performBubbleSort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			System.out.println("###OutSide Loop###");
			for (int j = 0; j < array.length - i - 1; j++) {
				System.out.println("###Inside Loop####");
				if (array[j] > array[j + 1]) {
					array[j] = array[j] ^ array[j + 1];
					array[j + 1] = array[j] ^ array[j + 1];
					array[j] = array[j] ^ array[j + 1];
				}
			}
		}
	}
}
