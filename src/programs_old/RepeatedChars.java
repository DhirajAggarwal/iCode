package programs;

import java.util.HashMap;
import java.util.Map;

public class RepeatedChars {

	public static void main(String[] args) {
		int[] a = { -9, -3, -5, -7, -9, -2, -3, -3 };
		repeatition("dhirajaggarwal");
		System.out.println();
		repeatitionInt(a);
		System.out.println();
		findMax(a);
	}

	public static void repeatition(String s) {
		char[] a = s.toCharArray();
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < a.length; i++) {
			if (!(map.containsKey(a[i] + ""))) {
				map.put(a[i] + "", 1);
			} else {
				map.put(a[i] + "", map.get(a[i] + "") + 1);
			}
		}
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}

	public static void findMax(int[] a) {
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		System.out.println(max);
	}

	public static void repeatitionInt(int[] a) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < a.length; i++) {
			if (!(map.containsKey(a[i]))) {
				map.put(a[i], 1);
			} else {
				map.put(a[i], map.get(a[i]) + 1);
			}
		}
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}
}
