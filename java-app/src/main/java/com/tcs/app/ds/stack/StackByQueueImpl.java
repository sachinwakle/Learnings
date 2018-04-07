package com.tcs.app.ds.stack;

public class StackByQueueImpl {

	public static void main(String[] args) {
		
		StackByQueue stack = new StackByQueue(3);
		stack.displayStack();
		System.out.println("Deleted: "+stack.pop());
		stack.push(3);
		stack.displayStack();
		stack.push(67);
		stack.displayStack();
		stack.push(5);
		stack.displayStack();
		System.out.println("Deleted: "+stack.pop());
		stack.push(2);
		stack.displayStack();
		System.out.println("Deleted: "+stack.pop());
		stack.displayStack();
		System.out.println("Deleted: "+stack.pop());
		stack.displayStack();
		System.out.println("Deleted: "+stack.pop());
		stack.displayStack();
		stack.push(13);
		stack.displayStack();
		stack.push(671);
		stack.displayStack();
		stack.push(15);
		stack.displayStack();
	}
}

class StackByQueue {
	CircularQueue queueA;
	CircularQueue queueB;
	
	public StackByQueue(int size) {
		queueA = new CircularQueue(size);
		queueB = new CircularQueue(size);
	}
	
	public void displayStack()
	{
		if(!queueA.isEmpty())
		{
			queueA.displayQueue();
		}
		else if(!queueB.isEmpty())
		{
			queueB.displayQueue();
		}
		else
		{
			System.out.println("Stack underflow");
		}
	}
	public boolean push(int data)
	{
		if(queueA.isFull())
		{
			System.out.println("Stack Overflow");
			return false;
		}
		else if(!queueA.isEmpty())
		{
			queueA.enqueue(data);
			return true;
		}
		else if(queueB.isFull())
		{
			System.out.println("Stack Overflow");
			return false;
		}
		else
		{
			queueB.enqueue(data);
			return true;
		}
	}
	
	public Integer pop()
	{
		Integer tmp = null;
		if(!queueA.isEmpty())
		{
			while(!queueA.isEmpty())
			{
				tmp = queueA.dequeue();
				if(!queueA.isEmpty())
				{
					queueB.enqueue(tmp);
				}
			}
		}
		else
		{
			while(!queueB.isEmpty())
			{
				tmp = queueB.dequeue();
				if(!queueB.isEmpty())
				{
					queueA.enqueue(tmp);
				}
			}
		}
		
		return tmp;
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
		if((rear==size-1 && front==0) || (front-1 == rear))
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
		if(front==-1 && rear == -1)
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