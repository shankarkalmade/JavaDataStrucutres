package com.shankar.datastructure.stack;
import com.shankar.datastructure.exceptions.*;

public class FixedSizeArrayStack {

	//Test line for commits
	protected int capacity;
	
	public static final int CAPACITY=10;
	
	protected int [] stackRep;
	
	protected int top =-1;
	
	public FixedSizeArrayStack() {
		this(CAPACITY);
	}
	
	public FixedSizeArrayStack(int cap) {
		
		capacity= cap;
		stackRep = new int[capacity];
	}
	
	public int size() {
		return top + 1;
		
	}
	
	public boolean isEmpty() {
		return (top<0);
	}
	
	public boolean isFull() {
		return (top+1>=capacity);
	}
	public void push(int data) throws Exception {
		
		if(isFull()) {
			throw new StackFullException("Stack Data structure full");
		}
		stackRep[++top]= data;
	}
	
	public int pop() throws Exception {
		
		if(isEmpty()) {
			throw new StackEmptyException("Stack Data structure Empty");
		}
		int data = stackRep[top];
		stackRep[top--]= Integer.MIN_VALUE;
		return data;
	}
	
	@Override
	public String toString() {
		
		String stack= "[";
		if(size()==0) {
			stack+=" ]";
		}
		if(size()>0) {
			for(int i=0; i<size(); i++) {
				stack+= " "+stackRep[i];
			}
			stack+= " ]";
			
		}
		
		return stack;
	}
	
}
