package programs;

import java.io.IOError;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

class Demode implements TestInterface, TestImp{

	public static void main(String... args) {
		Demode d = new Demode();
		// System.out.println(d.longestUniqueString("geeksforgeeks"));
		// d.largestNumber(new int[] { 45, 9, 4, 1, 91, 98, 9, 199 });
		// d.patternPrint(new int[] {3,5,4,1,2});
		// d.printLowerCase("SURAJ");
		// d.subarrayOfGivenSum(new int[] { 2, 3, 4, 5, 6, 7, 8, 10 }, 15);
		// System.out.println(d.checkPalindrome("dhiihd"));
		// d.arrangePositiveNegative(new int[] { 1, -2, 3, 5, -6, -9, 10 });
		// d.zeroOnLeft(new int[] { 5, 7, 0, 9, 0, 0, 1, 2, 0, 6 });
		d.makePalindrome("abab");
	}

	public int lastWord(String A) {
		String[] s = A.split("\\s+");
		int n = s.length;
		return n != 0 ? s[n - 1].length() : 0;
	}

	public String reverseWords(String A) {
		String[] s = A.split("\\s+");
		int n = s.length - 1;
		String g = "";
		while (n >= 0) {
			g = g + s[n] + " ";
			n--;
		}
		return g.trim();
	}

	public String longestAskedString(String s) {
		int n = s.length(), k = 3, count = 0, index = 0;
		String c = "";
		String s_temp = "", s_main = "";
		for (int j = 0; j < s.length(); j++) {
			int i = 0;
			while (count <= k && i < s.length()) {
				if (!c.contains(s.charAt(i) + "")) {
					c = c + s.charAt(i) + "";
					count++;
				}
				if (count <= k) {
					s_temp = s_temp + s.charAt(i);
				}
				i++;
			}

			s_main = s_main.length() < s_temp.length() ? s_temp : s_temp;
			count = 0;
			c = "";

			s = s.substring(s_temp.length() - 1);
			s_temp = "";
		}
		return s_main;
	}

	public int validString(String A) {
		char[] s = A.toCharArray();
		int i = 0, j = 0;
		while (j < s.length - 1) {
			while (i <= 9) {
				if ((Integer.parseInt(s[j] + "")) == i) {
					return 1;
				} else if (s[j] == ' ') {
					return 0;
				}
				i++;
			}
			j++;
		}
		return 0;
	}

	public void maxSumSubarray(int[] arr) {
		int mSum = 0, sum = 0;
		int i = 0;
		while (i < arr.length - 1 && sum >= 0) {
			sum = sum + arr[i];
			if (sum >= 0 && sum > mSum) {
				mSum = sum;
			} else if (sum < 0) {
				sum = 0;
			}
			i++;
		}
		System.out.println(mSum);
	}

	public int productMaxMin(int[] a, int[] b) {
		int a_max = a[0], b_max = b[0], i = 0;
		while (i < a.length - 1) {
			if (a_max < a[i + 1]) {
				a_max = a[i + 1];
			}
			i++;
		}
		i = 0;
		while (i < b.length - 1) {
			if (b_max < b[i + 1]) {
				b_max = b[i + 1];
			}
			i++;
		}
		System.out.println(a_max + ":" + b_max);
		return a_max * b_max;
	}

	public void maxVotes(String[] arr) {
		Map<String, Integer> map = new TreeMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}
		}
		for (Map.Entry<String, Integer> m : map.entrySet()) {
			// if (m.getValue())
		}
	}

	public int badString(String s) {
		int bad = 0, good = 0;
		int i = 0;
		while (i < s.length()) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
					|| s.charAt(i) == 'u') {
				bad++;
				good = 0;
			} else if (s.charAt(i) == '?') {
				bad++;
				good++;
			} else {
				good++;
			}

			if (bad > 5 || good > 3) {
				return 0;
			}
			System.out.println(bad + " : " + good);
			i++;
		}
		return 1;
	}

	public void waveArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					a[i] = a[i] + a[j];
					a[j] = a[i] - a[j];
					a[i] = a[i] - a[j];
				}
			}
		}

		for (int i : a) {
			System.out.println(i);
		}
		System.out.println("#======#");

		int i = 0;
		while (i < a.length) {
			System.out.println(a[i + 1]);
			System.out.println(a[i]);
			i = i + 2;
		}

	}

	public void largestNumber(int[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (conversion(a[i], a[j])) {
					a[i] = a[i] + a[j];
					a[j] = a[i] - a[j];
					a[i] = a[i] - a[j];
				}

			}
		}
		for (int i : a) {
			System.out.print(i);
		}
	}

	boolean conversion(int i, int j) {
		String a = String.valueOf(i);
		String b = String.valueOf(j);
		int len = a.length();
		int count = 0;
		while (count < len) {
			if (a.length() == b.length() && Integer.parseInt(String.valueOf(i).charAt(count) + "") < Integer
					.parseInt(String.valueOf(j).charAt(count) + "")) {
				return true;
			} else if (a.length() != b.length() && Integer.parseInt(i + j + "") > Integer.parseInt(j + i + "")) {
				return false;
			} else if (a.length() != b.length() && Integer.parseInt(j + "" + i) > Integer.parseInt(i + "" + j)) {
				return true;
			}
			count++;
		}
		return false;
	}

	int max = 0;

	public int longestUniqueString(String s) {
		char[] a = s.toCharArray();
		int len = a.length;
		int i = 0;
		String temp = "";
		if (len != 0) {
			for (i = 0; i < len; i++) {
				if (!temp.contains(a[i] + "")) {
					temp = temp + a[i];
				} else {
					break;
				}
			}
			if (max < temp.length()) {
				max = temp.length();
			}
			longestUniqueString(s.substring(1));
		}
		System.out.println(temp);
		return max;
	}

	public void patternPrint(int[] a) {
		int n = a.length;
		int max = a[0];
		for (int i = 1; i < n; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}

		String[][] b = new String[n][max];
		for (int i = 0; i < n; i++) {
			for (int j = max - 1; j >= 0; j--) {
				if (a[i] != 0) {
					b[j][i] = "*";
					a[i] = a[i] - 1;
				} else {
					b[j][i] = " ";
				}
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < max; j++) {
				System.out.print(b[i][j]);
			}
			System.out.println();
		}
	}

	public void removeAlternativeChar(String s) {
		for (int i = 0; i < s.length(); i++) {
			System.out.print(s.charAt(i));
			i = i + 1;
		}
	}

	public void printLowerCase(String s) {
		for (int i = 0; i < s.length(); i++) {
			char c = (char) (s.charAt(i) + 32);
			System.out.print(c);
		}
	}

	public void printMissing(int[] a) {
		int len = a.length;
		int sumAll = a[len - 1] * (a[len - 1] + 1) / 2;
		int sumArray = 0;
		for (int i : a) {
			sumArray = sumArray + i;
		}
		System.out.println(sumAll - sumArray);
	}

	public void subarrayOfGivenSum(int[] a, int sum) {// 2, 3, 4, 5, 6, 7, 8, 10
		int sumA = 0;
		int index = 0;
		int i = 0;
		while (i < a.length) {
			sumA = sumA + a[i];
			if (sumA == sum) {
				System.out.println(index + ", " + i);
			} else if (sumA > sum) {
				i = index++;
				sumA = 0;
			}
			i++;
		}
	}

	public void sort012(int[] a) {

	}

	public void makePalindrome(String s) {
		if (checkPalindrome(s)) {
			System.out.println(s + " is already palindrome.");
			return;
		}
		String rev = s;
		int i = 0;
		while (i < s.length() - 2) {
			rev = rev + s.charAt(i);
			if (checkPalindrome(rev)) {
				System.out.println(rev);
				return;
			}
			i++;
		}

	}

	public boolean checkPalindrome(String s) {
		int len = s.length() / 2;
		int i = 0;
		while (i < len) {
			if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
				return false;
			}
			i++;
		}
		return true;
	}

	public void arrangePositiveNegative(int[] a) {
		for (int k : a) {
			System.out.println(k);
		}
		System.out.println("###########");
		int len = a.length;
		int i = 0;
		int j = len - 1;
		while (i < j) {
			if (a[i] >= 0 && a[j] > 0) {
				i++;
			} else if (a[i] <= 0 && a[j] < 0) {
				j--;
			} else if (a[i] <= 0 && a[j] > 0) {
				a[i] = a[i] + a[j];
				a[j] = a[i] - a[j];
				a[i] = a[i] - a[j];
				i++;
				j--;
			} else {
				i++;
				j--;
			}
		}
		for (int k : a) {
			System.out.println(k);
		}
	}

	public void zeroOnLeft(int[] a) {
		int len = a.length;
		int i = 0, j = i + 1;
		int index = 0;
		while (i < len) {
			if (a[i] == 0) {
				index = i;
				break;
			}
			i++;
		}
		j = index + 1;
		while (j < len) {
			if (a[j] > a[index]) {
				a[index] = a[index] + a[j];
				a[j] = a[index] - a[j];
				a[index] = a[index] - a[j];
				index = index + 1;

			}
			j++;
		}
		for (int k : a) {
			System.out.println(k);
		}
	}

	@Override
	public void anyMethod() {
		// TODO Auto-generated method stub
		TestInterface.super.anyMethod();
		TestImp.super.anyMethod();
	}
	
	public int tryCatch(){
		try{
			return 1;
		}catch(Exception e) {
			return 2;
		}
		finally{
//			try {
//				return 3;
//			}catch(Exception e) {
//				
//			}
			System.out.println();
		}
	}
	

}
