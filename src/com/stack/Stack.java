package com.stack;

public class Stack {

	private LinkedList<Integer> linkedList;

	public Stack() {
		linkedList = new LinkedList<>();
	}

	/**
	 * Method to add element into the stack
	 * @param element
	 */
	public void push(INode<Integer> element)
	{
		linkedList.add(element);
	}

	public Integer checkTop() {
		return linkedList.head.getKey();
	}

	/**
	 * Method to pop the element from the stack
	 * @return
	 */
	public INode<Integer> pop()
	{
		return linkedList.pop();
	}

	/**
	 * Method to print the stack
	 */
	public void printStack()
	{
		linkedList.printNodes();
	}
}
