package s105;

public class Node {

	private int value;
	private Node next; // = null;

	Node(int value) { //Node(int value, Node next)

		this.value = value;
		//this.next = next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public int getValue() {

		return value;
	}

	public Node getNext() {
		return next;
	}

	@Override
	public String toString() {
		return "Node [value=" + value + ", next=" + next + "]";
	}

}
