package com.tcs.app.ds;

public class QueueImpl {

	public static void main(String[] args) {
		
		Queue q1 = new Queue(5);
		q1.displayQueue();
		q1.enqueue(7);
		q1.enqueue(3);
		q1.displayQueue();
		System.out.print("\nDequeued: "+q1.dequeue());
		q1.displayQueue();
		System.out.print("\nDequeued: "+q1.dequeue());
		q1.displayQueue();
		System.out.print("\nDequeued: "+q1.dequeue());
		q1.displayQueue();
		q1.enqueue(7);
		q1.displayQueue();
		System.out.print("\nDequeued: "+q1.dequeue());
		q1.displayQueue();
		q1.enqueue(12);
		q1.enqueue(2);
		q1.enqueue(73);
		q1.displayQueue();
		System.out.print("\nDequeued: "+q1.dequeue());
		q1.displayQueue();
		System.out.print("\nDequeued: "+q1.dequeue());
		q1.displayQueue();
		System.out.print("\nDequeued: "+q1.dequeue());
		q1.displayQueue();
		q1.enqueue(73);
		q1.displayQueue();
	}

}

class Queue {
	
	int[] queue;
	private int front;
	private int rear;
	private int size;
	
	public Queue(int size) {
		this.size = size;
		front = -1;
		rear = -1;
		queue = new int[size];
	}
	
	public boolean enqueue(int element)
	{
		if(rear >= size-1)
			return false;
		
		queue[++rear] = element;
		if(front == -1)
			front++;
		return true;
	}
	
	public Integer dequeue()
	{
		if(front == -1)
			return null;
		if(front > rear)
			return null;
		
		return queue[front++];
	}
	
	public void displayQueue()
	{
		System.out.print("\n[");
		if(front>-1)
		{
			for(int i=front; i<=rear; i++)
			{
				System.out.print(i+"="+queue[i]+" ");
			}
		}
		System.out.print("]");
	}
}