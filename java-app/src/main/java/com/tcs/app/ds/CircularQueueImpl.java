package com.tcs.app.ds;

public class CircularQueueImpl {

	public static void main(String[] args) {
		
		CircularQueue que = new CircularQueue(3);
		que.displayQueue();
		que.enqueue(12);
		que.displayQueue();
		que.enqueue(1);
		que.displayQueue();
		que.enqueue(3);
		que.displayQueue();
		que.dequeue();
		que.displayQueue();
		que.enqueue(34);
		que.displayQueue();
		que.enqueue(31);
		que.displayQueue();
		que.dequeue();
		que.displayQueue();
		que.enqueue(10);
		que.displayQueue();
		que.dequeue();
		que.displayQueue();
		que.enqueue(67);
		que.displayQueue();
		que.dequeue();
		que.displayQueue();
		que.dequeue();
		que.displayQueue();
		que.dequeue();
		que.displayQueue();

	}

}

class CircularQueue {
	 private int[] queue;
	 private int front;
	 private int rear;
	 private int size;
	
	public CircularQueue(int size) {
		this.size = size;
		this.front = -1;
		this.rear = -1;
		queue = new int[this.size];
	}
	
	public boolean isFull()
	{
		if((rear==size-1 && front==0) || (front-1 == rear))
			return true;
		return false;
	}
	
	public boolean isEmpty()
	{
		if(front==-1 && rear == -1)
			return true;
		return false;
	}
	public boolean enqueue(int element)
	{
		if(isFull())
		{
			System.out.println("Queue is full.");
			return false;
		}
		else if(front==-1 && rear == -1)
		{
			front++;
			rear++;
			queue[rear] = element;
			return true;
		}
		else if(rear==size-1 && front!=0)
		{
			rear = 0;
			queue[rear] = element;
			return true;
		}
		else
		{
			queue[++rear] = element;
			return true;
		}
	}
	
	public Integer dequeue()
	{
		Integer found = null;
		if(isEmpty())
		{
			System.out.println("Queue is empty.");
			return found;
		}
		else if(front == rear)
		{
			found = queue[front];
			front = -1;
			rear = -1;
			return found;
		}
		else if(front == size-1)
		{
			found = queue[front];
			front = 0;
			return found;
		}
		else
		{
			found = queue[front];
			front++;
			return found;
		}
	}
	
	public void displayQueue()
	{
		System.out.print("\n[");
		
		if(front == -1 && rear == -1)
		{
			
		}
		else
		{
			int i = front;
			while(true){
				if(i>=size)
					i = 0;
				System.out.print(i+"="+queue[i]+" ");
				if(i == rear)
					break;
				i++;
			}

		}
		
		System.out.print("]");
	}
}