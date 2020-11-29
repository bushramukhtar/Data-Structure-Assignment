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
		
	}
	
	public DSStack(DSStack other) {
		this.list = other.list.clone();
	}
	
	public Token push(Token obj) {
		return null;
	}

	public Token peek() {
		return null;
	}

	public Token pop() {
		return null;
	}

	public boolean isEmpty() {
		return true;
	}

	public int size() {
		return 0;
	}
	
	@Override
	public String toString() {
		return null;
	}
	


}
