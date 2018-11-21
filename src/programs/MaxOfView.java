package programs;

public class MaxOfView {
	int[][] a = new int[][] { { 2, 1, 5, 6 }, { 4, 3, 2, 7 }, { 1, 5, 4, 8 }, { 2, 5, 3, 4 } };

	public static void main(String[] args) {
		MaxOfView mv = new MaxOfView();
		// System.out.println(mv.sum());
		mv.printSpiral();
	}

	public int sum() {
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				sum = sum + min(a[i][j], i, j);
			}
		}
		return sum;
	}

	public int min(int x, int i, int j) {
		int l = 0, max_r = x, max_c = x;
		while (l < 3) {
			if (max_r < a[i][l]) {
				max_r = a[i][l];
			}

			if (max_c < a[l][j]) {
				max_c = a[l][j];
			}
			l++;
		}
		return max_r < max_c ? max_r - x : max_c - x;
	}

	int count = 0, m = 4, i = 0, j, runCount = 0;

	public void printSpiral() {
		while (runCount < m * m) {
			i = count;
			while (j < m - count) {
				System.out.println(a[i][j]);
				if (runCount < m * m)
					runCount++;
				else
					break;
				j++;
			}
			j--;
			i++;
			while (i < m - count) {
				System.out.println(a[i][j]);
				if (runCount < m * m)
					runCount++;
				else
					break;
				i++;
			}
			i--;
			j--;

			while (j > 0) {
				System.out.println(a[i][j]);
				if (runCount < m * m)
					runCount++;
				else
					break;
				j--;
			}
			while (i > 0) {
				System.out.println(a[i][j]);
				if (runCount < m * m)
					runCount++;
				else
					break;
				i--;
			}
			j++;

			count++;
		}
	}
}
