package programs;

public interface TestInterface {
	
	final String x="Dhiraj";
	
	default void anyMethod() {
		System.out.println(x);
	}

}
