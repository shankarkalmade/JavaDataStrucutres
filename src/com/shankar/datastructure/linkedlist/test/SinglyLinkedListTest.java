package com.shankar.datastructure.linkedlist.test;

import com.shankar.datastructure.linkedlist.ListNode;
import com.shankar.datastructure.linkedlist.SinglyLinkedList;

public class SinglyLinkedListTest {
	
	public static void main(String[] args) {
		
		SinglyLinkedList list = new SinglyLinkedList();
		
		System.out.println(list.toString());
		
		for(int i =0; i<=10; i++) {
			ListNode node = new ListNode(i);
			list.insertAtbegining(node);			
			
		}
		
		System.out.println(list.toString());
		
		
		//inserted 100 at position 5
		list.insert(100, 5);
		System.out.println(list.toString());
		
		//remove from front
		list.removeFromEnd();
		System.out.println(list.toString());
		
		//remove from end
		list.removeFromFront();
		System.out.println(list.toString());
		
		//get node position
		System.out.println(list.getPosition(100));
		
		
		//remove nodeof position 5
		list.remove(5);
		System.out.println(list.toString());
		
		ListNode node = new ListNode(2);
		
		//removeing mateched node 
		list.removeMatched(node);
		System.out.println(list.toString());
		
		
	}

}
