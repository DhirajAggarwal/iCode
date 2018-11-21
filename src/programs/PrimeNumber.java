package programs;

public class PrimeNumber {

	public static void main(String[] args) {
		System.out.println(PrimeNumber.primeNumber(105));
	}

	public static boolean primeNumber(int x) {
		int i = 2;
		while (i < x) {
			if (x % i == 0) {
				System.out.println(x/i);
				return true;
			}
			i++;
		}
		return false;
	}

}
