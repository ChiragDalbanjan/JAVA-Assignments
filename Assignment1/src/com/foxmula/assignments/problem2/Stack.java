package com.foxmula.assignments.problem2;


class Stack{
	private Node head;
	private int count = 0;
	
	
	//int countPop = 0;
	
	public int getCount() {
		return count;
	}


	Stack(){
		this.head = null;
	}
	
	void push(int data) {
		Node newNode = new Node();
		newNode.setData(data);
		
		if(this.head == null) {
			newNode.setPrevious(null);			
		}
		else {
			newNode.setPrevious(this.head);
		}		
		this.count++;
		this.head = newNode;
	}
	
	int pop() {
		if (this.isEmpty()) {
			if(this.count == 0) {
				this.count = -1;
			}
			return -1;
		}
		int data = head.getData();
		this.head = this.head.getPrevious();
		count--;
		return data;
		
	}
	
	boolean isEmpty() {
		if (this.head == null) {
			return true;
		}
		return false;
	}
}
