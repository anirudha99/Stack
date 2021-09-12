package com.stack;

public class StackMain {
	public static void main(String[] args) {
		Node<Integer> firstNode = new Node<>(70);
		Node<Integer> secondNode = new Node<>(30);
		Node<Integer> thirdNode = new Node<>(56);
		Stack myStack = new Stack();
		myStack.push(firstNode);
		myStack.push(secondNode);
		myStack.push(thirdNode);
		myStack.printStack();
		System.out.println("Top most element of the stack:"+myStack.checkTop());
		System.out.println("Pop operations until stack is empty!!");
		myStack.pop();
		myStack.printStack();
		myStack.pop();
		myStack.printStack();
		myStack.pop();
		myStack.printStack();
	}
}
