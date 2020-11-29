package ds.students;

import ds.interfaces.List;

public class DSList implements List {

	public Node head;
	private Node tail;

	public DSList() {


		head.next = tail;
		tail.prev=head;
	}

	public DSList(Node head_) {
		this.head = head;
	}

	public DSList(DSList other) { // Copy constructor.
		this.head = other.head;
		this.tail = other.tail;

	}

	public Token remove(int index) {
		Node newNode = head;
		int count = 0;
		while (newNode != null && count < index) {
			count++;
			newNode = newNode.next;
		}
		if (newNode != null && count + 1 == index) {
			Token token = newNode.next.getToken();
			newNode.next.next.prev = newNode;
			newNode.next = newNode.next.next;
			return token;
		}
		return null;
	}

	public int indexOf(Token obj) {
		return 0;
	}

	public Node getNode(int index) {
		Node newNode = head;
		int count = 0;
		while (newNode != null && count < index) {
			count++;
			newNode = newNode.next;
		}
		if (newNode != null && count + 1 == index) {
			return newNode;
		}
		return null;
	}

	public Token get(int index) {
		Node newNode = head;
		int count = 0;
		while (newNode != null && count < index) {
			count++;
			newNode = newNode.next;
		}
		if (newNode != null && count + 1 == index) {
			Token token = newNode.next.getToken();

			return token;
		}
		return null;
	}

	public boolean isEmpty() {
		if (head.next.equals(tail))
			return true;
		return false;
	}

	public int size() {
		if(!isEmpty()){
			int size =0;
			Node newNode = head;
			while(!(newNode.next.equals(tail))){
				newNode= newNode.next;
				size++;
			}
			return size;
		}
		return 0;
	}

	@Override
	public String toString() {
		return "";
	}

	public boolean add(Token obj) throws NullPointerException {
		if(!obj.equals(null)){
		Node newNode = new Node(null,head,obj);
		this.tail = newNode;
		return true;
		}
		throw new NullPointerException();
	}

	public boolean add(int index, Token obj) {
		Node newNode = head;
		int count = 0;
		while (newNode != null && count < index) {
			count++;
			newNode = newNode.next;
		}
		if (newNode != null && count + 1 == index) {
				Node nodeToAdd = new Node(newNode.next.next, newNode, obj);
				return true;
		}
		return false;
	}

	public boolean contains(Token obj) {
		return false;
	}

	public boolean remove(Token obj) {
		if(!isEmpty()){
			Node newNode = head;
			while (!(newNode.equals(tail) && newNode.getToken().hashCode()==obj.hashCode())){
				newNode = newNode.next;
			}
			if(newNode.getToken().hashCode()==obj.hashCode()){
				newNode.prev.next = newNode.next;
				newNode.next.prev = newNode.prev;
				return true;
			}	
			return false;
			}
			return false;
		}
	

	@Override
	public int hashCode() {
		return 0;
	}

	@Override
	public boolean equals(Object other) {
		return true;
	}

}
