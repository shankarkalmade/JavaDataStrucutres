package com.shankar.datastructure.linkedlist;

public class DoublyListNode {
	
	
	private int data;
	private DoublyListNode prevNode;
	private DoublyListNode nextNode;
	
	
	public DoublyListNode(int data) {
		
		this.data = data;
		this.nextNode = null;
		this.prevNode = null;
	}
	
	public DoublyListNode (int data, DoublyListNode next , DoublyListNode prev) {
		this.data = data;
		this.prevNode = prev;
		this.nextNode = next;
				
	}
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public DoublyListNode getPrevNode() {
		return prevNode;
	}
	public void setPrevNode(DoublyListNode prevNode) {
		this.prevNode = prevNode;
	}
	public DoublyListNode getNextNode() {
		return nextNode;
	}
	public void setNextNode(DoublyListNode nextNode) {
		this.nextNode = nextNode;
	}
	
	

}
