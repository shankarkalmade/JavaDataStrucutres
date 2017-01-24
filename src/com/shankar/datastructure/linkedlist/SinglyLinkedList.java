package com.shankar.datastructure.linkedlist;

import java.awt.List;

import javax.swing.ListCellRenderer;

public class SinglyLinkedList {
	
	ListNode head;
	private int length;
		
	public SinglyLinkedList() {
		
		length = 0;
	}
	
	public synchronized ListNode getHead() {
		return head;
	}
	
	public synchronized void insertAtbegining(ListNode node) {
		node.setNextNode(head);
		head = node;
		length++;
	}
	
	public synchronized void insertAtEnd(ListNode node) {
		if(head == null) {
			head= node;
		} else {
			
			ListNode p, q;
			for(p = head; (q= p.getNextNode())!=null; p=q);
			p.setNextNode(node);
						
		}
 		length++;
				
	}

	public void insert(int data, int position) {
		if(position < 0) {
			position =0;
		}
		if(position>length) {
			position = length;
		}
		if(head == null) {
			head = new ListNode(data);
			
		} if (position ==0 ) {
			ListNode temp = new ListNode(data);
			temp.setNextNode(head);
			head = temp;
		} else {
			
			ListNode p,q;
			int i=0;
			for(p =head, i=0; (q= p.getNextNode())!=null && i< position; p=q);
			p.setNextNode(new ListNode(data));
			p.getNextNode().setNextNode(q);
			
		}
		
		length++;
				
	}
	
	public synchronized ListNode removeFromFront() { 
		
		ListNode node = head;
		if(node != null) {
			
			head = node.getNextNode();
			
		}
		return node;
	} 
	
	public synchronized ListNode removeFromEnd() {
		if(head == null) {
			return null;
		}
		
		ListNode p = head, q= null, next= p.getNextNode(); 
		if(next == null) {
			head = null;
			return null;
		}
		
		while((next = p.getNextNode())!=null) {
			q= p;
			p = next;
			
		}
		
		q.setNextNode(null);
		return p;
		
	}
	
	public synchronized void removeMatched ( ListNode node) {
		
		if(head == null ) {
			return;
		}
		
		if(node.equals(head)) {
	
			head = head.getNextNode();
			return ;
			
			
		}
		
		ListNode p = head , q;
		
		while(( q = p.getNextNode())!=null) {
			
			if(q.equals(node)) {
				
				p.setNextNode(q.getNextNode());
				return ;
			}
			p =q;
		}
		length --;
				
	}
	
	public synchronized void remove(int position) {
	
		if( position < 0) {
			position =0;
		}
		
		if(position > length ) {
			position = length - 1;
		}
		
		if(head == null ) {
			return ;
		}
		
		if(position == 0) {
			head = head.getNextNode(); 
			
		} else {
			
			ListNode temp = head;
			
			for(int i = 1; i < position; i++) {
								
				temp = temp.getNextNode();
			}
			
		}
		
		length --;
	}
	
	public int length () {
		return length;
	}
	
	public int getPosition(int data) {
		
		ListNode temp = head;
		
		int position = 0;
		
		while (temp != null) {
			
			if(temp.getData() == data ) {
				return position;
				
			}
			
			temp = temp.getNextNode();
			position ++;
			
		}
		
		return Integer.MIN_VALUE;
	}
	
	public String toString () {
		
		String output = " [ ";
		
		if(head == null) {
			
			output += " ]";
			return output;
		}
		
		ListNode temp = head.getNextNode();
		output += ", "+ head.getData();
		
		while(temp!=null) {
			
			output += ", "+ temp.getData();
			temp= temp.getNextNode();
		}
		
		output += " ]";
		return output;
	}
	
}
