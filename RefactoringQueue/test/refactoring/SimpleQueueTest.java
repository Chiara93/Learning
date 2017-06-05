package refactoring;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SimpleQueueTest {
	private IQueue queue;
	
	@Before
	public void setUp() {
		queue = new SimpleQueue();
	}
	
	@Test
	public void empty() {
		assertTrue(queue.isEmpty());
	}
	
	@Test
	public void enqueue() {
		assertTrue(queue.enqueue(1));
		assertTrue(queue.enqueue(2));
	}
	
	@Test
	public void peek() {
		assertTrue(queue.enqueue(1));
		assertEquals(1, queue.peek());
	}
	
	@Test
	public void dequeue() {
		assertTrue(queue.enqueue(1));
		assertTrue(queue.enqueue(2));
		assertTrue(queue.dequeue());
		assertFalse(queue.isEmpty());
	}
}
