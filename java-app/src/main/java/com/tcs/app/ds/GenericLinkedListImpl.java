package com.tcs.app.ds;

public class GenericLinkedListImpl {

	public static void main(String[] args) {
		
		GenericList<Integer> list = new GenericList<Integer>();
		list.insert(4);
		list.displayList();
		list.delete();
		list.displayList();
		list.insert(4);
		list.insert(5);
		list.insert(1);
		list.insert(0);
		list.displayList();
		list.delete();
		list.displayList();
		
		GenericList<String> listStirng = new GenericList<String>();
		listStirng.insert("sachin");
		listStirng.displayList();
		listStirng.insert("wakle");
		listStirng.displayList();
		listStirng.insert("tcs");
		listStirng.displayList();
		listStirng.delete();
		listStirng.displayList();
	}
	
	
}

class GenericList<T> {
	
	static class Node<T> {
		T data;
		Node<T> next;
		
		public Node(T data) {
			this.data = data;
		}
	}
	
	Node<T> head;
	
	public boolean insert(T data)
	{
		if(head == null)
		{
			head = new Node<T>(data);
			return true;
		}
		
		Node<T> tmp = new Node<T>(data);
		tmp.next = head;
		head = tmp;
		return true;
	}
	
	public T delete()
	{
		T data = null;
		if(head == null)
		{
			return data;
		}
		
		data = head.data;
		head = head.next;
		return data;
	}
	
	public void displayList()
	{
		if(head == null)
		{
			System.out.println("List is empty.");
			return;
		}
		
		Node<T> tmp = head;
		System.out.println();
		while(tmp != null)
		{
			System.out.print(tmp.data+" ");
			tmp = tmp.next;
		}
		
	}
}
