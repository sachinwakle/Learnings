package com.tcs.app.ds;

public class LinkedList {

	public static void main(String[] args) {
		
		LinkedList linkedList = new LinkedList();
		linkedList.addAtEnd(6);
		linkedList.addAtEnd(3);
		linkedList.addAtEnd(1);
		linkedList.addAtEnd(2);
		linkedList.addAtFirst(67);
		linkedList.addAtFirst(13);
		linkedList.addAtFirst(15);
		linkedList.addAtFirst(25);
		linkedList.displayLinkedList();
		linkedList.reverse();
		System.out.println();
		linkedList.displayLinkedList();
		Node tmp = linkedList.head;
		System.out.println("Length: "+linkedList.length(tmp));
		
		/*System.out.println("\nRemoved(6): "+linkedList.remove(6));
		linkedList.displayLinkedList();
		System.out.println("\nRemoved(0): "+linkedList.remove(0));
		linkedList.displayLinkedList();
		System.out.println("\nRemoved(25): "+linkedList.remove(25));
		linkedList.displayLinkedList();
		System.out.println("\nRemoved(2): "+linkedList.remove(2));
		linkedList.displayLinkedList();*/
//		System.out.println("\nRemoved last element: "+linkedList.removeAtFirst());
//		linkedList.displayLinkedList();
//		System.out.println("\nRemoved last element: "+linkedList.removeAtFirst());
//		linkedList.displayLinkedList();
		
		/*System.out.println("\nReverse List");
		linkedList.reverse();
		linkedList.displayLinkedList();*/

	}
	
	Node head;
	static class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
		}
	}
	
	public Integer length(Node tmp)
	{
		Integer count = 1;
		if(tmp.next == null)
			return count;
		
		count += length(tmp.next);
		return count;
	}
	public boolean addAtEnd(int element)
	{
		if(head == null)
		{
			head = new Node(element);
			return true;
		}
		Node tmp = head;
		while(tmp.next != null)
			tmp = tmp.next;
		
		tmp.next = new Node(element);
		return true;
	}
	
	public boolean addAtFirst(int element)
	{
		if(head == null)
		{
			head = new Node(element);
			return true;
		}
		
		Node node = new Node(element);
		node.next = head;
		head = node;
		return true;
	}
	
	public void displayLinkedList()
	{
		Node tmp = head;
		while(tmp != null)
		{
			System.out.print(tmp.data+" ");
			tmp = tmp.next;
		}
	}
	
	public Integer remove(int element)
	{
		Integer found = null;
		if(head == null)
			return found;
		
		Node tmp = head;
		Node con = null;
		while(tmp != null)
		{
			if(tmp.data == element)
			{
				if(con == null)
				{
					head = tmp.next;
					found = element;
					return found;
				}
				con.next = tmp.next;
				found = element;
				return found;
			}
			con = tmp;
			tmp = tmp.next;
		}
		
		return found;
	}
	
	public Integer removeAtFirst()
	{
		Integer found = null;
		if(head == null)
			return found;
		
		found = head.data;
		head = head.next;
		return found;
	}
	public Integer removeAtEnd()
	{
		Integer found = null;
		if(head == null)
		{
			return null;
		}
		
		Node tmp = head;
		Node con = null;
		while(tmp.next!=null)
		{
			con = tmp;
			tmp = tmp.next;
		}
			
			if(con == null)
			{
				head = null;
			}
			else
			{
				con.next = null;
			}
			found = tmp.data;
			return found;
	}
	
	public void reverse()
	{
		Node current = head;
		Node prev = null;
		Node next = null;
		
		while(current != null)
		{
			next = current.next;
			if(next == null)
			{
				head = current;
			}
			current.next = prev;
			prev = current;
			current = next;
		}
	}

}
