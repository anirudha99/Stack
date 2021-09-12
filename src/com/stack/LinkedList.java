package com.stack;

public class LinkedList <K>{
	public INode<K> head;
	public INode<K> tail;
	
	public LinkedList() {
		this.head = head;
		this.tail = tail;
	}
	
	public void add(INode<K> newNode) {
		if(this.tail == null) {
			this.tail = newNode;
		}
		if(this.head == null) {
			this.head = newNode;
		}
		else {
			INode<K>tempNode = this.head;
			this.head = newNode;
			this.head.setNext(tempNode);
		}
	}
	
	public void printNodes() {
		System.out.println("My Nodes: "+head);
	}
}
