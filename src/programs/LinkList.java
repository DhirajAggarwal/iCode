package programs;
public class LinkList {

	LinkList next;
	int info;

	public LinkList(int info) {
		this.info = info;
	}

	public String toString() {
		return "This node is " + info;
	}
}

class LinkListOps {
	LinkList Head;

	public static void main(String[] args) {
		LinkListOps llo = new LinkListOps();
		llo.insertANodeInBeginning(40);
		llo.insertANodeInBeginning(20);
		llo.insertANodeInBeginning(10);
		llo.insertANodeAtlast(50);
		llo.insertANodeAtlast(60);
		llo.insertAtPos(30,1);
		llo.printList();
		System.out.println();
		llo.deleteAtBeginning();
		llo.printList();
		System.out.println();
		llo.deleteAtTheEnd();
		llo.printList();
		System.out.println();
		llo.deleteAtPos(1);
		llo.printList();
		
	}

	public void printList() {
		LinkList current = Head;
		while (current != null) {
			System.out.println(current);
			current = current.next;
		}
	}

	public void insertANodeInBeginning(int info) {
		LinkList current;
		if (Head == null) {
			Head = new LinkList(info);
			return;
		}
		current = Head;
		Head = new LinkList(info);
		Head.next = current;
	}

	public void insertANodeAtlast(int info) {
		LinkList current;
		if (Head == null) {
			Head = new LinkList(info);
			return;
		}
		current = Head;
		while (current.next != null) {
			current = current.next;
		}
		current.next = new LinkList(info);
	}

	public void insertAtPos(int info, int pos) {
		LinkList current;
		if (Head == null) {
			Head = new LinkList(info);
			return;
		}
		current = Head;
		LinkList temp;
		int i = 0;
		while (i != pos - 1) {
			current = current.next;
			i++;
		}
		temp = current.next;
		current.next = new LinkList(info);
		current = current.next;
		current.next = temp;
	}

	public void deleteAtBeginning() {
		LinkList current;
		if (Head == null) {
			return;
		}
		current = Head.next;
		Head = current;
	}

	public void deleteAtTheEnd() {
		LinkList current = null;
		if (Head == null) {
			return;
		}
		current = Head;
		while (current.next.next != null) {
			current = current.next;
		}
		current.next = null;
	}
	
	public void deleteAtPos(int pos) {
		LinkList current = null;
		if (Head == null) {
			return;
		}
		current = Head;
		int i = 0;
		while (i != pos-1) {
			current = current.next;
		}
		LinkList temp = current.next.next;
		current.next = temp;
	}
	
	public void circularLinkList() {
		
	}
}
