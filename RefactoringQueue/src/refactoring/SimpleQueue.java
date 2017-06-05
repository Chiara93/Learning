package refactoring;

public class SimpleQueue implements IQueue{

	private static final int MAXSIZE = 1000;
	private Object[] queue = new Object[MAXSIZE];
	private int front = 0;
	private int rear = 0;
	private int counter = 0;

	@Override
	public boolean enqueue(Object obj) {
		if(isFull()) {
			return false;
		}
		queue[rear] = obj;
		rear = (rear + 1) % MAXSIZE;
		counter++;
		return true;
		
	}

	@Override
	public boolean dequeue() {
		if(isEmpty()) {
			return false;
		}
		front = (front + 1)% MAXSIZE;
		counter--;
		return true;
	}

	@Override
	public Object peek() {
		return queue[front];
	}

	@Override
	public boolean isFull() {
		if(counter == MAXSIZE) {
			return true;
		} 
		return false;
	}

	@Override
	public boolean isEmpty() {
		if(counter == 0) {
			return true;
		}
		return false;
	}


}
