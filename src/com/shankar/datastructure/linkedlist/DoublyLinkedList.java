package com.shankar.datastructure.linkedlist;

public class DoublyLinkedList {
	
	
	private DoublyListNode head;
	private DoublyListNode tail;
	private int length;
	
	public DoublyLinkedList () {
		
		head = new DoublyListNode(Integer.MIN_VALUE, null, null);
		tail = new  DoublyListNode(Integer.MIN_VALUE, head, null);
		head .setNextNode(tail);
		length =0;
					
		
	}
	
	public int getPosition(int data) {
		DoublyListNode temp;
		temp = head;
		int index = 0;
		while(temp != null) {
			if(temp.getData() == data) {
				return index;
			}
			temp = temp.getNextNode();
			index++;
			
		}
		
		return -1;
		
	}
	
	public int getLength () {
		return length;
	}

	public void insertFront(int data) {
		DoublyListNode node = new DoublyListNode(data,head, head.getNextNode());
		node.getNextNode().setPrevNode(node);
		head.setNextNode(node);
		length++;
				
	}
	
	public void insert (int position, int data) {
		
		if(position < 0 ) {
			position =0;
		}
		
		if(position > length) {
			position = length;
		}
		
		if(head == null) {
			
			head = new DoublyListNode(data);
			tail = head;
		}
		
		if(position == 0) {
			
			DoublyListNode node = new DoublyListNode(data, null, head);
			
			head = node;
			
		}
		
		else {
			
			DoublyListNode temp = head;
			int index= 0;
			while (temp != null && index < position) {
				temp = temp.getNextNode();
				index++;
			}
			
			DoublyListNode node = new DoublyListNode(data, temp, temp.getNextNode());
			temp.setNextNode(node);
			node.getNextNode().setPrevNode(node);
			
			
		}
		
		length++;
	}
	
	
	public void insertTail (int data) {
		
		DoublyListNode node = new DoublyListNode(data, tail.getPrevNode(), tail);
		tail.getPrevNode().setNextNode(node);
		tail.setNextNode(node);
		length ++;
		
		
	}
	
	public void remove (int position) {
		
		if(position < 0) {
			position = 0;
		}
		
		if(position > length) {
			position = length;
		}
		
		if(head == null) {
			return;
		}
		
		if(position == 0) {
			head = head.getNextNode();
			if(head == null) {
				tail = null;
			}
		} else {
			
			DoublyListNode temp = head;
			int index =0;
			while (temp != null && index < position) {
				temp = temp.getNextNode();
			}
			
			temp.getNextNode().setPrevNode(temp.getPrevNode());
			temp.getPrevNode().setNextNode(temp.getNextNode());
			
		}
		length --;
	} 
	
	
	public synchronized void removeMatched(DoublyListNode node) {
		
		if(head.equals(node)) {
			head= head.getNextNode();
			if(head == null) {
				tail= null;
			}
		}
		
		DoublyListNode temp = head;
		
		while(temp.equals(node) || temp != null) {
			if(temp.equals(node)) {
				temp.getPrevNode().setNextNode(temp.getNextNode());
				temp.getNextNode().setPrevNode(temp.getPrevNode());
			}
		}
		
		length --;
		
		
	}
	
	public synchronized int removeHead () {
		if(length == 0) {
			return Integer.MIN_VALUE;
		}
		
		DoublyListNode temp = head.getNextNode();
		head.setNextNode(temp.getNextNode());
		temp.getNextNode().setNextNode(head);
		length--;
		return temp.getData();
				
	}
	
	public int removeTail() {
		if(length == 0) {
			return Integer.MIN_VALUE;
		}
		
		DoublyListNode node = tail.getPrevNode();
		tail.setPrevNode(node.getPrevNode());
		node.getPrevNode().setNextNode(tail);
		length--;
		return tail.getData();
	}
	
	
}





