package com.tech.intelizin;

public class Trre {
	
	public static void main(String[] args) {
		String s = "0";
		Boat b = new Boat();
		Boat b2 = new Speedboat();
		Speedboat s2 = new Speedboat();
		if((b instanceof Vessel) && (b2 instanceof Toy))
			if((s2 instanceof Vessel) && (s2 instanceof Toy))
			System.out.println(s);
	}

}

interface Vessel
{
	
}

interface Toy
{

}

class Boat implements Vessel
{
	
}

class Speedboat extends Boat implements Toy
{
	
}

