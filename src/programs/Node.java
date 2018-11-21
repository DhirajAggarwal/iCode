package programs;

public class Node {
	Node next;
	int data;
	Node left;
	Node right;

	Node(int data) {
		this.data = data;
		left = right = null;
	}

	public String toString() {
		return data + " of Node";
	}
}
