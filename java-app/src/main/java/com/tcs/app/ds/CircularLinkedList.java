package com.tcs.app.ds;

public class CircularLinkedList {

	public static void main(String[] args) {

		CircularLinkedList list = new CircularLinkedList();
		list.insert(3);
//		list.insert(2);
//		list.insert(4);
//		System.out.println();
//		list.displayList();
		System.out.println("\nRemoved: "+list.delete());
		list.displayList();
		list.insert(12);
		list.insert(45);
		System.out.println();
		list.displayList();
		System.out.println("\nRemoved: "+list.delete());
		list.displayList();
		System.out.println("\nRemoved: "+list.delete());
		list.displayList();
		System.out.println("\nRemoved: "+list.delete());
		list.displayList();
		System.out.println("\nRemoved: "+list.delete());
		list.displayList();
		System.out.println("\nRemoved: "+list.delete());
		list.displayList();
		
	}
	
	private Node head;
	static class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
		}
	}
	
	public void insert(int data)
	{
		if(head == null)
		{
			head = new Node(data);
			head.next = head;
			return;
		}
		
		Node first = head.next;
		head.next = new Node(data);
		head = head.next;
		head.next = first;
		return;
	}
	
	public void displayList()
	{
		if(head == null)
		{
			System.out.println("Circular linked list is empty.");
			return;
		}
		
		Node first = head.next;
		do {
			System.out.print(first.data+" ");
			first = first.next;
		} while (head.next != first);
		
	}
	
	public Integer delete()
	{
		Integer found = null;
		if(head == null)
		{
			return found;
		}
		else if(head == head.next)
		{
			found = head.data;
			head = null;
			return found;
		}
		else
		{
			found = head.next.data;
			head.next = head.next.next;
			return found;
		}
		
	}	
}
