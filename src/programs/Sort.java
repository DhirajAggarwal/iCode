package programs;

import javax.sound.sampled.ReverbType;

public class Sort {

	 
	public static void main(String[] args) {
		
		Sort sort = new Sort();
		int[] ar = new int[] { 5, 4, 1, 2, 3 };
		// sort.bubbleSort(ar);
		// sort.insertionSort(ar);
		// sort.selectionSort(ar);
		// String s = sort.reverse("dhi");
		//int c = sort.countChars("AAA rating");
		// filename Test.java
		      
	}

	// BubbleSort
	public void bubbleSort(int[] arr) {
		int i, j, count = 1;
		boolean swapped;
		for (i = 0; i < arr.length - 1; i++) {
			for (j = 0; j < arr.length - i - 1; j++) {
				System.out.println("Swaping Count: " + count++);
				swapped = false;
				if (arr[j] > arr[j + 1]) {
					arr[j] = arr[j] + arr[j + 1];
					arr[j + 1] = arr[j] - arr[j + 1];
					arr[j] = arr[j] - arr[j + 1];
					swapped = true;
				}
				if (swapped == false)
					break;
			}
		}
		print(arr);
	}

	// Insertion Sort
	public void insertionSort(int[] arr) {
		int i, j, count = 1;
		for (i = 1; i < arr.length; i++) {
			int key = arr[i];
			j = i - 1;
			while (j >= 0 && key < arr[j]) {
				System.out.println("Swaping Count: " + count++);
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
		print(arr);
	}

	//
	public void selectionSort(int[] arr) {
		int n = arr.length, count = 1, j, index = 0;
		for (int i = 0; i < n; i++) {
			index = i;
			for (j = i + 1; j < n - 1; j++) {
				System.out.println("Swaping Count: " + count++);
				if (arr[j] < arr[index]) {
					index = j;
				}
			}
			arr[i] = arr[i] + arr[index];
			arr[index] = arr[i] - arr[index];
			arr[i] = arr[i] - arr[index];
		}
		print(arr);
	}

	// Reverse through recursion
	public String reverse(String str) {
		if (str == null || str.length() <= 1) {
			return str;
		}
		return reverse(str.substring(1)) + str.charAt(0);
	}

	// Count Character repetition in a string using recursion
	public int countChars(String str) {
		int count = 0;
		if (str == null || str.length() < 1) {
			return 0;
		}
		System.out.println(str + ": " + count);
		if (str.charAt(0) == 'A' || str.charAt(0) == 'a') {
			count=1;
		}
		return count + countChars(str.substring(1));
	}
	
	//
	public void kuchBhi() {
		
	}

	public void print(int[] arr) {
		for (int i : arr) {
			System.out.println(i);
		}
	}

	public void swap(int a, int b) {
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println(a + " ," + b);
	}

}
