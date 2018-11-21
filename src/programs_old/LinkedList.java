package programs;

import java.util.ArrayList;
import java.util.List;

class Node {

	int data;
	Node next;

	public Node(int data) {
		this.data = data;
	}

	public String toString() {
		return data + "";
	}
}

public class LinkedList {
	Node Head;

	public void append(int data) {
		if (Head == null) {
			Head = new Node(data);
			return;
		}
		Node current = Head;
		while (current.next != null) {
			current = current.next;
		}
		current.next = new Node(data);
	}

	public void printlist() {
		Node current = Head;
		while (current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}

	public void prepend(int data) {
		Node current = Head;
		Head = new Node(data);
		Head.next = current;
	}

	public void deleteEnd() {
		Node current = Head;
		while (current.next.next != null) {
			current = current.next;
		}
		current.next = null;
	}

	public void deleteSpecific(int dataFind) {
		Node current = Head;
		while (current.next.data != dataFind) {
			System.out.println(current);
			current = current.next;
		}
		current.next = current.next.next;
	}

	public void sortLinkList() {
		Node current = Head;
		Node currentTwo = Head.next;
		while (current != null) {
			currentTwo = current.next;
			while (currentTwo != null) {
				if (current.data > currentTwo.data) {
					current.data = current.data ^ currentTwo.data;
					currentTwo.data = current.data ^ currentTwo.data;
					current.data = current.data ^ currentTwo.data;
				}
				currentTwo = currentTwo.next;
			}
			current = current.next;
		}
	}

	public void midOfLinkList() {
		Node current = Head;
		List<Integer> arr = new ArrayList<Integer>();
		while (current != null) {
			arr.add(current.data);
			current = current.next;
		}
		System.out.println(arr.get(arr.size() / 2));
	}

	public boolean circularlist() {
		Node current = Head;

		while (current.next != null) {
			current = current.next;
		}
		current.next = Head;

		Node slow = Head;
		Node fast = Head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (fast == slow) {
				return true;
			}	
		}
		return false;
	}

	public void reverseLinkList(){
		Node current = Head;
		while(current.next!=null){
			current = current.next;
		}
		current.next = Head;
		Head.next = null;
		System.out.println("1");
	}
	
	public static void main(String[] args) {
		LinkedList linkList = new LinkedList();
		linkList.append(20);
		linkList.append(30);
		linkList.prepend(10);
		linkList.prepend(40);
		// linkList.append(60);
		linkList.printlist();
		// linkList.deleteEnd();
		// System.out.println("\n");
		// linkList.printlist();
		// linkList.deleteSpecific(20);
		System.out.println("\n");
		linkList.sortLinkList();
		linkList.printlist();
		linkList.midOfLinkList();
		//System.out.println(linkList.circularlist());
		linkList.reverseLinkList();
	}
}