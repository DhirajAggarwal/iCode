package programs;

class P1 {

	void show() {
		System.out.println("In Private P");
	}
}

public class ConcreteClass extends P1 {

	public void show() {
		System.out.println("In Private C");
	}

	public static void main(String[] args) {
		ConcreteClass c = new ConcreteClass();
		P1 p = new ConcreteClass();
		c.show();

	}

}