package programs;

public class ReverseTheEquation {

	public static void main(String[] args) {
		String s = "20-3+5*2";
		String a = "";
		String[] s1 = s.split("\\.");
		int n = s1.length;
		while (n > 0) {
			a = a + s1[n - 1];
			n--;
		}
		System.out.println(a);
	}
}
