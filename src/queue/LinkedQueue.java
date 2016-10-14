package queue;

import exceptions.EmptyQueueException;

public class LinkedQueue<T> implements QueueInterface<T>{
	private int count;
	private LinearNode<T> front;
	private LinearNode<T> end;
	
	// CONSTRUCTORS
	public LinkedQueue(){
		count = 0;
		front = end = null;
	}
	
	public LinkedQueue(T element){
		LinearNode<T> node = new LinearNode<T>(element);
		count = 1;
		front = end = node;
	
	}
	
	
	// Goes to the end
	@Override
	public void enqueue(T element) {
		LinearNode<T> node = new LinearNode<T>(element);
		if (isEmpty()){
			front = node;
			count = 1;
		}
		else {
			
			
			end.setNext(node);
			count ++;
		}
		end = node;
	}
	
	@Override
	public T dequeue() throws EmptyQueueException {
		if (isEmpty()){
			throw new EmptyQueueException();
		}
		T result = front.getElement();
		front = front.getNext();
		count--;
		return result;
	}

	@Override
	public T front() throws EmptyQueueException {
		if (isEmpty()){
			throw new EmptyQueueException();
		}
		return front.getElement();
	}

	@Override
	public boolean isEmpty() {
		
		return count == 0;
	}

	@Override
	public int size() {
		
		return count;
	}
	public String toString(){
		
	}
	//implement circular array (5.2) xcredit put in queue package and driver test
	

}
