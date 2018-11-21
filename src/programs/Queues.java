package programs;

public class Queues {
	Node Head;

	public static void main(String[] args) {
		Queues queue = new Queues();
		queue.add(10);
		queue.add(9);
		queue.add(8);
		queue.add(7);
		queue.add(6);
		queue.add(5);
		queue.add(4);
		queue.traverse();
		queue.remove();
		queue.traverse();
	}

	public void add(int data) {
		if (Head == null) {
			Head = new Node(data);
			return;
		}
		Node ptr = Head;
		while (ptr.next != null) {
			ptr = ptr.next;
		}
		ptr.next = new Node(data);
	}

	public void remove() {
		Node pop = Head;
		Head = Head.next;
		System.out.println(pop + " is poped.");
	}

	public void traverse() {
		Node ptr = Head;
		while (ptr != null) {
			System.out.println(ptr);
			ptr = ptr.next;
		}
	}

}
