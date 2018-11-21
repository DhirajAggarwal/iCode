package programs;

class Sender {

	public void send(String msg) {
		System.out.println("\nSending\t" + msg);
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println("Thread  interrupted.");
		}
		System.out.println(msg + "Sent");
	}

}

class Print extends Thread {
	private String msg;
	Sender sender;
	Thread t;

	Print(String msg, Sender sender) {
		this.sender = sender;
		this.msg = msg;
	}

	public void run() {
		synchronized (sender) {
			sender.send(msg);
		}
	}
}

public class SyncDemo {

	public static void main(String args[]) {
		Sender snd = new Sender();
		Print p1 = new Print("Hi", snd);
		Print p2 = new Print("Bye", snd);
		p1.start();
		p2.start();

		try {
			p1.join();
			p2.join();
		} catch (Exception e) {
			System.out.println("Interrupted");
		}
	}

}
