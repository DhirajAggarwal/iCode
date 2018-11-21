package programs;

class Driver {
	static int i = 0;

	public synchronized void print(StaticBlockInThread d) {
		System.out.println(++i + " | " + d.getName());
		if (i % 2 == 0) {
			i = 0;
		}
	}
}

public class StaticBlockInThread extends Thread {
	Driver d = new Driver();

	public static void main(String args[]) throws InterruptedException {
		StaticBlockInThread d1 = new StaticBlockInThread();
		StaticBlockInThread d2 = new StaticBlockInThread();
		d1.setName("d1");
		d2.setName("d2");
		d1.start();
		d2.start();
	}

	@Override
	public void run() {
		d.print(this);
	}
}
