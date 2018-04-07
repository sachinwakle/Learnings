package com.tcs.app.ds.queue;

public class QueueByStackImpl { 

	public static void main(String[] args) {
		
		QueueByStack que = new QueueByStack();
		
		que.enqueue(2);
		que.displayQueue();
//		System.out.println("Deleted: "+que.dequeue());
//		que.displayQueue();
		que.enqueue(12);
		que.displayQueue();
		que.enqueue(70);
		que.displayQueue();
		que.enqueue(5);
		que.displayQueue();
		System.out.println("Deleted: "+que.dequeue());
		que.displayQueue();
		que.enqueue(7);
		que.displayQueue();
		System.out.println("Deleted: "+que.dequeue());
		que.displayQueue();
		que.enqueue(90);
		que.displayQueue();
		System.out.println("Deleted: "+que.dequeue());
		que.displayQueue();
	}

}

class QueueByStack{
	Stack stackA = new Stack(2);
	Stack stackB = new Stack(2);
	
	public void enqueue(int element)
	{
		if(stackA.isFull())
		{
			if(!stackB.isEmpty())
			{
				System.out.println("Queue is full.");
				return;
			}
			else
			{
				while(!stackB.isFull() && !stackA.isEmpty())
				{
					stackB.push(stackA.pop());
				}
				
				stackA.push(element);
			}
		}
		else
		{
			stackA.push(element);
		}
	}
	
	public Integer dequeue()
	{
		if(stackB.isEmpty())
		{
			if(stackA.isEmpty())
			{
				System.out.println("Queue is empty.");
				return null;
			}
			else
			{
				while(!stackB.isFull() && !stackA.isEmpty())
				{
					stackB.push(stackA.pop());
				}
				
				return stackB.pop();
			}
		}
		else
		{
			return stackB.pop();
		}
	}
	
	public void displayQueue()
	{
		System.out.println();
		if(stackA.isEmpty())
		{
			if(stackB.isEmpty())
			{
				System.out.println("Queue is empty.");
				return;
			}
			else
			{
				stackB.displayStackReverse();
			}
		}
		else
		{
			if(!stackB.isEmpty())
			{
				stackB.displayStackReverse();
			}
			stackA.displayStack();
		}
	}
}

class Stack
{

	int[] stack;
	int top;
	int size;
	
	public Stack(int size) {
		this.size = size;
		this.top = -1;
		stack = new int[size];
	}
	
	public boolean push(int element)
	{
		if(top>=size-1)
			return false;
		
		stack[++top] = element;
		return true;
	}
	
	public Integer pop()
	{
		if(top<0)
			return null;
		
		return stack[top--];
	}
	
	public boolean isFull()
	{
		if(top>=size-1)
			return true;
		return false;
	}
	
	public boolean isEmpty()
	{
		if(top < 0)
			return true;
		return false;
	}
	
	public void displayStack()
	{
		if(top>=0)
		{
			for(int i=0;i<=top;i++)
			{
				System.out.print(i+"="+stack[i]+" ");
			}
		}
		else
		{
			return;
		}
	}
	
	public void displayStackReverse()
	{
		if(top>=0)
		{
			for(int i=top;i>=0;i--)
			{
				System.out.print(i+"="+stack[i]+" ");
			}
		}
		else
		{
			return;
		}
	}
}
