package programs;

import java.util.ArrayList;
import java.util.List;

public class longestSubstring {

	public static void main(String[] args) {
		System.out.println(longestSubstring.getString("dhirajaggarwal"));
	}

	public static String getString(String s) {
		int cur_len = 0;
		int max_len = 0;
		int i, j;
		String x = "";
		List<String> list = new ArrayList<String>();
		i = 0;
		while ( i< s.length()) {
			x = "";
			for (j = 0; j <= i; j++) {
				if (s.charAt(i) != s.charAt(j) || j == i) {
					x = x + s.charAt(j);
					cur_len++;
					System.out.println("Inside J: " + " j=" + j + " i=" + i + " " + x);
				} else {
					list.add(x);
					x = s.charAt(j) + "";
					cur_len++;
				}
			}
			System.out.println("Inside I: " + x);
			i++;
			cur_len++;
		}
		return x;
	}
}

// String x = "";
// HashMap<Integer,String> map = new HashMap<Integer,String>();
// ArrayList<String> list = new ArrayList<>();
// for (int i = 0; i < s.length(); i++) {
// if (!(x.contains(s.charAt(i) + ""))) {
// x = x + s.charAt(i);
// } else {
// list.add(x);
// x = s.charAt(i) + "";
// }
// }
// for(String a : list){
// System.out.println(a);
// }