package programs;

public class LinkedList {
	Node Head;
	Node next;

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add(10);
		ll.add(9);
		ll.add(8);
		ll.add(7);
		ll.add(6);
		ll.add(5);
		ll.add(4);
		ll.delete(6);
		ll.traverse();
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

	public void delete() {
		Node temp = Head;
		Head.next = Head;
		Head = temp;
		System.out.println(temp + " is deleted.");
	}

	public void delete(int data) {
		Node ptr = Head;
		while (data != ptr.next.data) {
			ptr = ptr.next;
		}
		Node temp = ptr.next;
		ptr.next = ptr.next.next;
		System.out.println(temp + " is deleted.");
	}

	int size = 0;

	public void traverse() {
		Node ptr = Head;
		while (ptr != null) {
			System.out.println(ptr);
			size++;
			ptr = ptr.next;
		}
	}

	public void middleElement() {
		Node ptr = Head;
		while (ptr != null) {
			System.out.println(ptr);
			size++;
			ptr = ptr.next;
		}
		ptr = Head;
		int mid = size / 2 + 1;
		while (mid - 1 > 0) {
			ptr = ptr.next;
			mid--;
		}
		System.out.println(ptr);
	}
}
