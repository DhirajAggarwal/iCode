package programs;

public class ListSortCheck {

	public static void main(String[] args) {
		int[] a = new int[] { 1, 2, 4, 4, -2, 5 };
		boolean flag = true;
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] <= a[i + 1])
				flag = true;
			else {
				flag = false;
				break;
			}
		}

		if (flag)
			System.out.println("Array is sorted.");
		else
			System.out.println("Array is not sorted.");
	}
}
