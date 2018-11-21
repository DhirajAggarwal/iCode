package programs;

public class CoinChange {

	public static void main(String[] args) {
		CoinChange cc = new CoinChange();
		int ways = cc.change(200, new int[] { 1, 3, 4, 6, 7, 10, 15 });
		System.out.println(ways);
	}

	public void printArray(int[] array) {
		for (int singleArrayValue : array) {
			System.out.println(singleArrayValue);
		}
	}

	public int change(int amount, int[] coins) {
		int ways = 0;
		for (int i = 0; i < coins.length; i++) {
			if (amount % coins[i] == 0 && amount / coins[i] <= 500) {
				ways++;
			}
		}
		return ways;
	}
}
