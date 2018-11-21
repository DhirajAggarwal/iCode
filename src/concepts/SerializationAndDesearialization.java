package concepts;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Demo implements Serializable {

	private static final long serialVersionUID = 1L;
	static String a;
	transient int b;
	String c;
	int d;

	public Demo(String a, int b, String c, int d) {
		Demo.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}

	@Override
	public String toString() {
		return "Demo [a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + "]";
	}
}

public class SerializationAndDesearialization {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Demo d = new Demo("Aggarwal", 20, "Dhiraj", 30);
		Demo d1;
		
		FileOutputStream f = new FileOutputStream("fileSerialize.txt");
		ObjectOutputStream o = new ObjectOutputStream(f);
		o.writeObject(d);
		o.flush();
		o.close();
		f.close();
		System.out.println("Serialized Object:" + d);

		FileInputStream i = new FileInputStream("fileSerialize.txt");
		ObjectInputStream oi = new ObjectInputStream(i);
		d1 = (Demo) oi.readObject();
		oi.close();
		System.out.println("Deserialized Object:" + d);

		System.out.println(d1 == d);
	}

}
