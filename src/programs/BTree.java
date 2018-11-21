package programs;

public class BTree {
	Node root;

	public static void main(String[] args) {
		BTree btree = new BTree();
		btree.add(10);
		btree.add(9);
		btree.add(8);
		btree.add(7);
		btree.add(6);
		btree.add(5);
		btree.add(4);
		btree.travese();
	}

	public void add(int data) {
		if (root == null) {
			root = new Node(data);
			return;
		}
		Node ptr = root;
		while (ptr != null) {
			if (ptr.data < data) {
				ptr = ptr.right;
			} else {
				ptr = ptr.left;
			}
		}
		ptr = new Node(data);
		System.out.println(ptr);
	}

	public void travese() {
		Node ptr = root;
		System.out.println(ptr);
		while (ptr != null) {
			ptr = ptr.left;
			System.out.println(ptr);
		}
		ptr = root;
		while (ptr != null) {
			ptr = ptr.right;
			System.out.println(ptr);
		}
	}
}
