package programs;

public class Factorial {
	static int y=1;
	public static void main(String[] args) {
		System.out.println(Factorial.factorial(5));
		System.out.println(Factorial.factorialRecursion(5));
	}

	public static int factorial(int x) {
		int y = 1;
		while (x > 0) {
			y = y * x;
			x--;
		}
		return y;
	}
	
	public static int factorialRecursion(int x){
		if(x>0){
		y = y*x;
		 factorialRecursion(x-1);
		}
		return y;
	}
}
