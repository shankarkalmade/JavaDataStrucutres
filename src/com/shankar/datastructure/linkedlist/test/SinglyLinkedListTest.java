package com.shankar.datastructure.linkedlist.test;

import com.shankar.datastructure.linkedlist.ListNode;
import com.shankar.datastructure.linkedlist.SinglyLinkedList;

public class SinglyLinkedListTest {
	
	public static void main(String[] args) {
		
		SinglyLinkedList list = new SinglyLinkedList();
		
		list.toString();
		
		ListNode node = new ListNode(2);
		
		list.insertAtbegining(node);
		
		list.insertAtEnd(node);
		
		list.toString();
		
	}

}
