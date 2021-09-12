package com.stack;

public class Stack {
	
	private LinkedList<Integer> linkedList;
	
	public Stack() {
		linkedList = new LinkedList<>();
	}
	
	public void push(INode<Integer> element)
	{
		linkedList.add(element);
	}
	
	public void printStack()
	{
		linkedList.printNodes();
	}
}
