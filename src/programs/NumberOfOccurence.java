package programs;

public class NumberOfOccurence {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 4, 4, 4, 4, 7 };
		int c = passTheNumber(a, 2);
		System.out.println(c);
	}

	// public static int passTheNumber(int[] a, int Begin, int End, int x) {
	// int count = 0, mid;
	// if (End >= Begin) {
	// mid = (Begin + End) / 2;
	// if (x > a[mid])
	// return passTheNumber(a, mid, End, x);
	// if (x < a[mid])
	// return passTheNumber(a, Begin, mid, x);
	// return mid;
	// }
	// return -1;
	// }

	public static int passTheNumber(int[] a, int x) {
		int i = 0, j = a.length-1, first = 0, last = 1;
		boolean flag1 = false, flag2 = false;
		while (first != last) {
			if (a[i] == x && !flag1) {
				first = i;
				flag1 = true;
			}
			if (a[j] == x && !flag2) {
				last = j;
				flag2 = true;
			}
			i++;
			j--;
		}
		return last - first;
	}

}
