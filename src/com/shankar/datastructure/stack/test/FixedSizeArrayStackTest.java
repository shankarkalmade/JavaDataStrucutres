package com.shankar.datastructure.stack.test;

import com.shankar.datastructure.stack.FixedSizeArrayStack;

public class FixedSizeArrayStackTest {
	
	
	
	public static void main(String[] args) throws Exception {
		
		FixedSizeArrayStack testStack = new FixedSizeArrayStack(5);
		testStack.push(1);
		testStack.push(2);
		testStack.push(3);
		testStack.push(4);
		testStack.push(5);
		System.out.println(testStack);
		
	System.out.println(testStack.pop());
	System.out.println(testStack);
	System.out.println(testStack.pop());
	System.out.println(testStack);
	System.out.println(testStack.pop());
	System.out.println(testStack);
	System.out.println(testStack.pop());
	System.out.println(testStack);
	System.out.println(testStack.pop());
	System.out.println(testStack);
	testStack.pop();
		
	}
}
