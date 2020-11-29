package ds.students;

import ds.interfaces.Stack;

public class DSStack extends Stack {

	@Override
	public int hashCode() {
		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		return true;
	}

	public DSStack() {
		this.list = new DSList();
	}
	
	public DSStack(DSStack other) {
		this.list = other.list;
	}
	
	public Token push(Token obj) {
		list.add(obj);
		return obj;
	}

	public Token peek() {
		return list.get(0);
	}

	public Token pop() {
		return list.remove(0);
	}

	public boolean isEmpty() {
		return list.isEmpty();
	}

	public int size() {
		return list.size();
	}
	
	@Override
	public String toString() {
		return null;
	}
	


}
