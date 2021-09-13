package com.stack;

public class QueueMain {

	public static void main(String[] args) {
		
		//enqueue operation
		Node<Integer> firstNode = new Node<>(56);
		Node<Integer> secondNode = new Node<>(30);
		Node<Integer> thirdNode = new Node<>(70);
		Queue myQueue=new Queue();
		myQueue.enqueue(firstNode);
		myQueue.enqueue(secondNode);
		myQueue.enqueue(thirdNode);
		myQueue.printQueue();
		//dequeue
		System.out.println("Performing dequeue operations till the queue is empty!!");
		myQueue.dequeue();
		myQueue.printQueue();
		myQueue.dequeue();
		myQueue.printQueue();
		myQueue.dequeue();
		myQueue.printQueue();
	}

}
