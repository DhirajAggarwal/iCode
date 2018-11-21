package programs;

public class Rotate {

	public static void main(String[] args) {
		System.out.println(Rotate.tellIfRotate("dhiraj", "dhiraaj"));
	}

	public static String rotate(String s, int rotate) {
		String x = "";
		for (int i = s.length() - rotate - 1; i >= 0; i--) {
			x = x + s.charAt(i);
		}
		for (int i = s.length() - 1; i >= s.length() - rotate; i--) {
			x = x + s.charAt(i);
		}
		s = "";
		for (int i = x.length() - 1; i >= 0; i--) {
			s = s + x.charAt(i);
		}
		return s;
	}

	public static boolean tellIfRotate(String a, String b) {	
		int i=0;
		while(i <= b.length()) {
			System.out.println(b);
			if(a.equals(b))
				return true;
			b = rotate(b, 1);
			i++;
		}
		return false;
	}

}
