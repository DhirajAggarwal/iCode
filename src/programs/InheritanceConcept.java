package programs;

class G {

	public String toString() {
		return "G [a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + "]";
	}

	int a = 10;
	static int b = 20;
	final int c = 30;
	final static int d = 40;

	G() {
		System.out.println("In G Constructor");
	}

	G(int e) {
		System.out.println("In G Para_Constructor " + e);
	}

	void show(final int f) {
		System.out.println("In G show() " + f);
	}
}

class P extends G {

	public String toString() {
		return "P [a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + "]";
	}

	int a = 100;
	static int b = 200;
	final int c = 300;
	final static int d = 400;

	P() {
		System.out.println("In P Constructor");
	}

	P(int e) {
		super(10);
		System.out.println("In P Para_Constructor " + e);
	}

	void show(final int f) {
		System.out.println("In P show() " + f);
	}
}

class C extends P {

	public String toString() {
		return "C [a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + "]";
	}

	int a = 1000;
	static int b = 2000;
	final int c = 3000;
	final static int d = 4000;

	C() {

		System.out.println("In C Constructor");
	}

	C(int e) {
		super(100);
		System.out.println("In C Para_Constructor " + e);
	}

	public void show(int f) {
		System.out.println("In C show() " + f);
	}
}

public class InheritanceConcept {

	public static void main(String[] args) {

		C c1 = new C();
		C c2 = new C(1000);
		P p1 = new C();
		P p2 = new C(1000);
		G g1 = new C();
		G g2 = new C(1000);

		P p3 = new P();
		P p4 = new P(100);
		G g3 = new P();
		G g4 = new P(100);

		G g5 = new G();
		G g6 = new G(10);

		c1.show(10);
		p1.show(20);
		g1.show(30);
		p3.show(40);
		g3.show(50);
		g5.show(60);
		System.out.println(c1.a + ";" + C.b + ";" + c1.c + ";" + C.d);
		System.out.println(c1);
		System.out.println(p3);
		System.out.println(g5);

	}

}

// Any constructor will call default parent constructors always
// To call parameterized constructors, use super(i)
// Constructor can not be final, static
// Parent class variables cannot be assigned values outside method of Child
// static methods don't override but no compile time exception
// final methods give compile time exception