package programs;

import java.util.Scanner;

public class MakePalindrome {

	static String richieRich(String s, int n, int k) {
		return s;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		String s = in.next();
		String result = richieRich(s, n, k);
		System.out.println(result);
	}

}

// int comp=0;
// if (s.length() != n) {
// return "Enter valid String please";
// }
// String[] midStore = new String[s.length()];
// int i = 0;
// int actLen = s.length();
// int len = s.length() / 2;
// int count = 1;
// midStore[len] = s.charAt(len)+"";
// while (i < len) {
// System.out.println(i + " : " + len + " : " + count);
// if (s.charAt(i) != s.charAt(actLen - i - 1)) {
// if (count <= k) {
// if (Integer.parseInt(s.charAt(i)+"") > Integer.parseInt(s.charAt(actLen - i -
// 1)+"")) {
// midStore[i] = s.charAt(i) + "";
// midStore[actLen - i - 1] = s.charAt(i) + "";
// comp++;
// } else {
// midStore[i] = s.charAt(actLen - i - 1) + "";
// midStore[actLen - i - 1] = s.charAt(actLen - i -1) + "";
// comp++;
// }
// count++;
// comp++;
// }
// comp++;
// } else {
// midStore[i] = s.charAt(i) + "";
// midStore[actLen - i - 1] = s.charAt(i) + "";
// comp++;
// }
// i++;
// comp++;
// }
//
// s = "";
// for (int j = 0; j < midStore.length; j++) {
// if(midStore[j] == null) {
// return -1+"";
// }
// s = s + midStore[j];
// }
// System.out.println(comp);
// return s;
