package com.tcs.app.ds.queue;

public class QueueByLinkedListImpl {

	public static void main(String[] args) {
		
		QueueByLinkedList queue = new QueueByLinkedList();
		queue.displayQueue();
		System.out.println("Deleted: "+queue.dequeue());
		queue.enqueue(89);
		queue.displayQueue();
		queue.enqueue(9);
		queue.displayQueue();
		queue.enqueue(8);
		queue.displayQueue();
		System.out.println("Deleted: "+queue.dequeue());
		queue.displayQueue();
		queue.enqueue(0);
		queue.displayQueue();
		

		
	}

}

class QueueByLinkedList {
	
	static class Node {
		
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
		}
	}
	
	Node head;
	Node rear;
	
	public boolean enqueue(int data)
	{
		if(rear == null)
		{
			head = new Node(data);
			rear = head;
			return true;
		}
		
		Node tmp = new Node(data);
		rear.next = tmp;
		rear = tmp;
		return true;
	}
	
	public Integer dequeue()
	{
		Integer value = null;
		if(head == null)
			return value;
		
		value = head.data;
		head = head.next;
		return value;
	}
	
	public void displayQueue()
	{
		if(head == null)
		{
			System.out.println("Queue is underflow");
			return;
		}
			
		Node traverser = head;
		System.out.println();
		do
		{
			System.out.print(traverser.data+" ");
			traverser = traverser.next;
		}
		while(traverser != null);
	}
}
