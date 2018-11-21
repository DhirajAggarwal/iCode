package programs;

public class LargestSumOfConsecutiveIntegers {

	public static void main(String[] args) {
		LargestSumOfConsecutiveIntegers ls = new LargestSumOfConsecutiveIntegers();
		int[] a = new int[] {1, 4, 6, 7, 8, 13, 15, 12, 1, 3};
		System.out.println(ls.sumConsecutive(a));
	}

	public int sumConsecutive(int[] a) {
		int largestSum = 0;
		for (int i = 0; i < a.length - 1; i++) {
			if (largestSum < a[i] + a[i + 1]) {
				largestSum = a[i] + a[i + 1];
				continue;
			}
		}
		return largestSum;
	}
}
