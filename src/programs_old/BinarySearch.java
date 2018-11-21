package programs;

public class BinarySearch {

	public static void main(String args[]) {
		BinarySearch bs = new BinarySearch();
		int[] arr = { 1, 2, 3, 4 };
		int pos = bs.performBinarySerach(arr, 1, 0, arr.length - 1);
		if (pos == -1) {
			System.out.println("Either the array is empty or the item is not in the Array.");
		} else {
			System.out.println("Position of " + arr[pos] + " is " + pos + ".");
		}
	}

	public int performBinarySerach(int[] arr, int elementToFind, int begin, int end) {
		if (end >= begin) {
			int mid = (begin + end) / 2;
			if (arr[mid] > elementToFind)
				return performBinarySerach(arr, elementToFind, begin, mid);
			if (arr[mid] < elementToFind)
				return performBinarySerach(arr, elementToFind, mid + 1, end);
			return mid;
		}
		return -1;
	}
}
