package programs;

import java.util.Scanner;

public class ReducedString {

	static String super_reduced_string(String s) {
		String n = null;
		char[] a = s.toCharArray();
		int j = 0;
		for (int i = 0; i < a.length; i++) {
			System.out.println(i);
			if (n == null) {
				n = a[i] + "";
			} else {
				System.out.println(j + " : " + i + " : "+ n);
				if (n.charAt(j) == a[i]) {
					if (n != null && n.length() > 1) {
						n = n.substring(0, n.length() - 1);
						j = j - 1;
					} else {
						n = null;
						j = 0;
					}

				} else {
					n = n + a[i];
					j++;
				}
			}
		}
		return n==null?"Empty String":n;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		String result = super_reduced_string(s);
		System.out.println(result);
	}
}
