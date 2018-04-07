package com.tcs.app.ds;

public class StackImpl {

	public static void main(String[] args) {

		Stack stk1 = new Stack(4);
		stk1.displayStack();
		stk1.push(5);
		stk1.displayStack();
		System.out.print("\npoped: "+stk1.pop());
		stk1.push(4);
		stk1.displayStack();
		stk1.push(1);
		stk1.displayStack();
		stk1.push(6);
		stk1.displayStack();
		stk1.push(11);
		stk1.displayStack();
		stk1.push(3);
		stk1.displayStack();
		System.out.print("\npoped: "+stk1.pop());
		System.out.print("\npoped: "+stk1.pop());
		System.out.print("\npoped: "+stk1.pop());
		stk1.push(6);
		stk1.displayStack();
	}

}

class Stack {
	private int[] stack;
	private int top;
	private int size;
	
	public Stack(int size) {
		this.size = size;
		top = -1;
		stack = new int[size];
	}
	
	public boolean isFull()
	{
		if(top >= size-1)
			return true;
		return false;
	}
	
	public boolean isEmpty()
	{
		if(top <= -1)
			return true;
		return false;
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
	
	public void displayStack()
	{
		System.out.print("\n[");
		if(top>=0)
		{
			for(int i=0;i<=top;i++)
			{
				System.out.print(i+"="+stack[i]+" ");
			}
		}
		System.out.print("]");
	}
}
