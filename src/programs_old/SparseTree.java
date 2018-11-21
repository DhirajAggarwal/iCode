package programs;

import java.util.Scanner;

public class SparseTree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[] strings = new String[N];
		for (String s : strings) {
			s = sc.nextLine();
		}
		int Q = sc.nextInt();
		String[] queries = new String[Q];
		for (String q : queries) {
			q = sc.nextLine();
		}
	}

	public int sparseTree(String[] strings, String[] query, int element, int begin, int end) {
		if(end >= begin){
//			if(strings[mid]> query[i])
//				return spar
		}
		return -1;
	}
}
