package programs;

public class Stacks {
	Node Head;

	public static void main(String[] args) {
		Stacks sk = new Stacks();
		sk.push(10);
		sk.push(9);
		sk.push(8);
		sk.push(7);
		sk.push(6);
		sk.push(5);
		sk.push(4);
		sk.traverse();
		sk.pop();
		sk.traverse();
	}

	public void push(int data) {
		if (Head == null) {
			Head = new Node(data);
			return;
		}
		Node ptr = new Node(data);
		ptr.next = Head;
		Head = ptr;
	}

	public void pop() {
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
