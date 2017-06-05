package refactoring;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MonitorableQueueTest {
	private MonitorableQueue queue;
	
	@Before
	public void setUp() {
		queue = new MonitorableQueue();
	}
	
	@Test
	public void test() {
		assertTrue(queue.enqueue("italiano"));
		assertTrue(queue.enqueue("matematica"));
		
		assertEquals("italiano", queue.peek());
		assertEquals(2, queue.getTreshold());
		
		assertTrue(queue.dequeue());
		
		assertTrue(queue.enqueue("inglese"));
		assertEquals(2, queue.getTreshold());
	}
}
