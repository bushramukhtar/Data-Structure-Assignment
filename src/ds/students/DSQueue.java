package ds.students;

import ds.interfaces.Queue;

public class DSQueue extends Queue {
	
	public DSQueue(Queue s) {
	}

	public DSQueue() {
		this.list = new DSList();
	}

	@Override
	public boolean offer(Token t) {
		this.list.add(t);
		return true;
	}

	@Override
	public Token poll() {
		if(!isEmpty()){
		return this.list.remove(this.list.size());
		}
		return null;
	}

	@Override
	public Token peek() {
		return this.list.get(this.list.size());
	}

	@Override
	public String toString() {
		return null;
	}

	@Override
	public int size() {
		return this.list.size();
	}

	@Override
	public boolean isEmpty() {
		return this.list.isEmpty();
	}

}
