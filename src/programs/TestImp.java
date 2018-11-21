package programs;

public interface TestImp {

	final String x = "Dhiraj";

	default void anyMethod() {
		System.out.println(x);
	}

}
