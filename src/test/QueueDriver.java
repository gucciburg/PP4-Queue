package test;

import exceptions.EmptyQueueException;
import queue.LinkedQueue;
import queue.QueueInterface;

public class QueueDriver {

	public static void main(String[] args) throws EmptyQueueException {
		QueueInterface<String> strQueue = new LinkedQueue<String>();
		
		strQueue.enqueue("Morning");
		strQueue.enqueue("Afternoon");
		strQueue.enqueue("Morning");
		
		System.out.println("First element? " + strQueue.front());
		System.out.println("How many elements? " + strQueue.size());
		
	}

}
