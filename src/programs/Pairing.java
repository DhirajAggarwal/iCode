package programs;

import java.util.ArrayList;
import java.util.List;

public class Pairing {

	public static void main(String[] args) {

	}

	public void digitisation(int n) {
		int r;
		List<Integer> list = new ArrayList<Integer>();
		int i = 0;
		while (n > 0) {
			r = n % 10;
			list.add(r);
			n = n / 10;
		}
	}

	public void pairInt(List list) {

		
	}

	public void pairString(String s) {

	}

}
