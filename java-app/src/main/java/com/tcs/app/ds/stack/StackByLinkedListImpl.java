package com.tcs.app.ds.stack;

public class StackByLinkedListImpl {

	public static void main(String[] args) {
		
		StackByLinkedList stack = new StackByLinkedList();
		stack.displayStack();
		System.out.println("Poped: "+stack.pop());
		stack.push(7);
		stack.displayStack();
		stack.push(3);
		stack.displayStack();
		stack.push(89);
		stack.displayStack();
		System.out.println("Poped: "+stack.pop());
		stack.displayStack();
		System.out.println("Poped: "+stack.pop());
		stack.displayStack();
		
	}
}

class StackByLinkedList {
	
	Node head;
	
	static class Node {
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
		}
	}
	
	public boolean push(int data)
	{
		if(head == null)
		{
			head = new Node(data);
			return true;
		}
		
		Node tmp = new Node(data);
		tmp.next = head;
		head = tmp;
		return true;
	}
	
	public Integer pop()
	{
		Integer value = null;
		if(head == null)
		{
			return value;
		}
		value = head.data;
		head = head.next;
		return value;
	}
	
	public void displayStack()
	{
		if(head == null)
		{
			System.out.println("Stack underflow");
			return;
		}
		
		Node tmp = head;
		System.out.println();
		while(tmp!= null)
		{
			System.out.print(tmp.data+" ");
			tmp = tmp.next;
		}
	}
}