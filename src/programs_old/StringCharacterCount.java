package programs;

public class StringCharacterCount {

	public static void main(String[] args) {
		StringCharacterCount scc = new StringCharacterCount();
		String s = "Great is the new sexy";
		scc.characterCount(s);
	}

	public void characterCount(String s) {
		String x = new String();
		for (int i = 0; i < s.length(); i++) {
			x = x + s.charAt(i);
			if (i != s.length() - 1 && s.charAt(i) == s.charAt(i + 1))
				continue;
			else {
				System.out.print(s.charAt(i) + "" + x.length());
				x = "";
			}
		}
	}
}
