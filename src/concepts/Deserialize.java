package concepts;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialize {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Demo d = null;
		FileInputStream i = new FileInputStream("fileSerialize.txt");
		ObjectInputStream oi = new ObjectInputStream(i);
		Object o = oi.readObject();
		if (o instanceof Demo) {
			 d = (Demo) o;
		}
		//d =(Demo) oi.readObject();
		oi.close();
		System.out.println(d);
	}
}
