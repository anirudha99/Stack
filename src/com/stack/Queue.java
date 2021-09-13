package com.stack;

public class Queue {
	
	private final LinkedList<Integer> Linkedlist;
	
	public Queue() {
		Linkedlist = new LinkedList<>();
	}
	
	/**
	 * Method to add element
	 * @param element
	 */
	public void enqueue(INode<Integer> element)
	{
		Linkedlist.append(element);
	}
	
	public INode<Integer> dequeue()
	{
		return Linkedlist.pop();
	}

	/**
	 * method to print elements of the stack
	 * @return nothing
	 */
	public void printQueue()
	{
		Linkedlist.printNodes();
	}
}
