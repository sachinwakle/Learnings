package com.tcs.app.ds;

public class SpecialStackImpl {

	public static void main(String[] args) {

		SpecialStack st = new SpecialStack(3);
		st.push(3);
		st.displayStack();
		st.push(4);
		st.displayStack();
		st.push(2);
		st.displayStack();
		System.out.println("\nMinimum: "+st.getMin());
		System.out.println("Deleted: "+st.pop());
		st.displayStack();
		System.out.println("\nMinimum: "+st.getMin());
	}

}

class SpecialStack extends Stack {

	int size;
	Stack min;
	public SpecialStack(int size) {
		super(size);
		this.size = size;
	    min = new Stack(size);
	}
	
	
	
	public boolean push(int data)
	{
		if(super.isEmpty())
		{
			super.push(data);
			min.push(data);
			return true;
		}
		else if(super.isFull())
		{
			return false;
		}
		else
		{
			int tmp = min.pop();
			min.push(tmp);
			if(data<tmp)
			{
				super.push(data);
				min.push(data);
			}
			else
			{
				super.push(data);
				min.push(tmp);
			}
			return true;
		}
		
	}
	
	public Integer pop()
	{
		Integer found = null;
		if(super.isEmpty())
		{
			return found;
		}
		else
		{
			min.pop();
			return super.pop();
		}
		
	}
	
	public Integer getMin()
	{
		Integer tmp = min.pop();
		min.push(tmp);
		return tmp;
	}
}