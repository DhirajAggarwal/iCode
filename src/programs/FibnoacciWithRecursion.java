package programs;

public class FibnoacciWithRecursion {
	int count = 0, sum = 0;

	public static void main(String[] args) {
		int f0 = 0, f1 = 1;
		System.out.println(f0 + "\n" + f1);
		FibnoacciWithRecursion fwr = new FibnoacciWithRecursion();
		fwr.fibnoacciRecursion(10, f0, f1);
	}

	public void fibnoacciRecursion(int x, int f0, int f1) {
		if (count < x - 2) {
			sum = f0 + f1;
			System.out.println(sum);
			count++;
			fibnoacciRecursion(x, f1, sum);
		} else {
			return;
		}
	}
}
