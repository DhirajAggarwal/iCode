package programs;

public class LeftRotate {

	public static void main(String[] args) {
		LeftRotate lr = new LeftRotate();
		int[] arr = new int[] { 1, 2, 3, 4, 5, 6 };
		lr.printArray(lr.leftRotate(arr, 3));
	}

	public int[] leftRotate(int[] arr, int rotate) {
		if(rotate > arr.length){
			rotate=arr.length;
		}else if (rotate < 0){
			rotate = 0;
		}
		reverseArray(arr, 0, rotate - 1);
		reverseArray(arr, rotate , arr.length - 1);
		reverseArray(arr, 0, arr.length - 1);
		return arr;
		}

	public int[] reverseArray(int[] arr, int i, int j) {
		while (i < j) {
			arr[i] = arr[i] ^ arr[j];
			arr[j] = arr[i] ^ arr[j];
			arr[i] = arr[i] ^ arr[j];
			i++;
			j--;
		}
		return arr;
	}

	public void printArray(int[] array) {
		for (int singleArrayValue : array) {
			System.out.println(singleArrayValue);
		}
	}
}
