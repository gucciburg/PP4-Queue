package exceptions;

public class EmptyQueueException extends Exception {
	public EmptyQueueException(){
		super("There are no more items in the queue");
	}
}
