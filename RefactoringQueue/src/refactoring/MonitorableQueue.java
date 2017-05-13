package refactoring;

public class MonitorableQueue implements IQueue {
	
	private IQueue simpleQueue = new SimpleQueue();
	private int highTreshold = 0;
	private int currentSize = 0;
	
	@Override
	public boolean enqueue(Object obj) {
		if(simpleQueue.enqueue(obj)) {
			if(++currentSize > highTreshold) {
				highTreshold = currentSize;
			}
			return true;
		}
		return false;
	}

	@Override
	public boolean dequeue() {
		if(simpleQueue.dequeue()) {
			currentSize--;
			return true;
		}
		return false;
	}

	@Override
	public Object peek() {
		return simpleQueue.peek();
	}

	@Override
	public boolean isFull() {
		return simpleQueue.isFull();
	}

	@Override
	public boolean isEmpty() {
		return simpleQueue.isEmpty();
	}

}
