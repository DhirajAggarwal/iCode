package programs;

public class ReverseInteger {

	public static void main(String[] args) {
		ReverseInteger rI = new ReverseInteger();
		System.out.println(rI.reverseInt(Integer.MAX_VALUE));
	}

	public int reverseInt(int reverseNum) {
		int sum = 0, r, flag = 0;
		if (reverseNum >= Integer.MIN_VALUE && reverseNum < Integer.MAX_VALUE) {
			if (reverseNum < 0) {
				reverseNum = reverseNum * (-1);
				flag = 1;
			}
		} else {
			return 0;
		}

		while (reverseNum > 0) {
			r = reverseNum % 10;
			sum = (sum * 10) + r;
			reverseNum = reverseNum / 10;
		}
		if (flag == 1)
			return sum * (-1);
		else
			return sum;
	}

	public static void reverse(int x) {
		String s = x + "";
		int i = 0;
		while (s.charAt(i) == s.charAt(s.length() - 1 - i) && i <= s.length() / 2) {
			System.out.println(s.charAt(i) + ":" + s.charAt(s.length() - 1 - i));
			i++;
		}
	}
}
