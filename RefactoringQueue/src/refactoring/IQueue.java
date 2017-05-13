package refactoring;

public interface IQueue {
	public boolean enqueue(Object obj);
	public boolean dequeue();
	public Object peek();
	public boolean isFull();
	public boolean isEmpty();
}
