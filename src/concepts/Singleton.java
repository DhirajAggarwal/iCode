package concepts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Singleton implements Cloneable, Serializable, Runnable {
	public static final long serialVersionUID = 1L;
	static Singleton ec;

	private Singleton() {
		ec = new Singleton();
	}

	synchronized public static Singleton getObject() {
		if (ec != null) {
			return ec;
		} else {
			ec = new Singleton();
			return ec;
		}
	}

	public static void main(String[] args)
			throws FileNotFoundException, IOException, ClassNotFoundException, CloneNotSupportedException {
		Singleton ec1;
		ec1 = (Singleton) getObject().clone();
		System.out.println(ec1 == ec);

		// FileSerilize
		FileOutputStream f = new FileOutputStream("fileSerialize.txt");
		ObjectOutputStream o = new ObjectOutputStream(f);
		o.writeObject(ec);
		o.flush();
		o.close();
		f.close();

		// DeSearialize
		FileInputStream fis = new FileInputStream("fileSerialize.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Singleton ec2 = (Singleton) ois.readObject();
		ois.close();
		fis.close();
		System.out.println(ec2 == ec);

		Thread t1 = new Thread(getObject());
		Thread t2 = new Thread(getObject());
		t1.start();
		t2.start();
		Thread.interrupted();
	}

	//ThreadingInSigletorn
	@Override
	public void run() {
		System.out.println("DJ");
	}

	//ToAvoidClonningOfSingletonObject
	@Override
	public Object clone() throws CloneNotSupportedException {
		return ec;
	}
	//ToAvoidSerializationOfSingletonObject
	public Object readResolve() {
		return ec;
	}

}
