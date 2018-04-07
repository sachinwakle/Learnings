package com.tcs.app.ds;

public class DoublyLinkedListImpl {

	public static void main(String[] args) {

		DoublyLinkedListImpl list = new DoublyLinkedListImpl();
		list.addAtEnd(3);
		list.addAtEnd(5);
		list.addAtEnd(1);
		list.addAtEnd(37);
		list.DisplayList();
		System.out.println("\nRemoved: "+list.removeAtEnd());
		list.displayReverseList();
	}

	DoublyLinkedList head;
	DoublyLinkedList tail;
	
	static class DoublyLinkedList {
		int data;
		DoublyLinkedList next;
		DoublyLinkedList prev;
		public DoublyLinkedList(int data) {
			this.data = data;
		}
	}
	
	public void addAtEnd(int data)
	{
		if(head == null)
		{
			head = new DoublyLinkedList(data);
			tail = head;
			return;
		}
		
		DoublyLinkedList tmp = head;
		while(tmp.next != null)
			tmp = tmp.next;
		
		tmp.next = new DoublyLinkedList(data);
		tmp.next.prev = tmp;
		tail = tmp.next;
	}
	
	public void DisplayList()
	{
		DoublyLinkedList tmp = head;
		while(tmp != null)
		{
			System.out.print(tmp.data+" ");
			tmp = tmp.next;
		}
	}
	
	public void displayReverseList()
	{
		DoublyLinkedList tmp = tail;
		while(tmp != null)
		{
			System.out.print(tmp.data+" ");
			tmp = tmp.prev;
		}
	}
	
	public Integer removeAtEnd()
	{
		Integer found = null;
		if(tail == null)
			return found;
		
		found = tail.data;
		tail = tail.prev;
		tail.next = null;
		return found;
	}
}


