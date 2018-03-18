package com.tech.intelizin;

import javax.swing.text.DefaultStyledDocument.ElementBuffer;

public class Phone3 extends Electronic implements Device {

	public void doStuff()
	{
		
	}
}

class Phone2 extends Electronic
{
	public void doIt(int x)
	{
		
	}
}

class Electronic implements Device
{
	public void doIt()
	{
		
	}
}
interface Device
{
	public void doIt();
}