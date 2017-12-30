package CollectionPackage;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class SortMountains {

	public static void main(String[] args) {
		SortMountains sm = new SortMountains();
		sm.go();

	}

	LinkedList<Mountain> mtn = new LinkedList<Mountain>();
	class NameCompare implements Comparator<Mountain>{

		@Override
		public int compare(Mountain o1, Mountain o2) {
			return o1.getName().compareToIgnoreCase(o2.getName());
		}
		
	}
	
	class HeightCompare implements Comparator<Mountain> {
		@Override
		public int compare(Mountain o1, Mountain o2) {
			return -(o1.getHeight()-o2.getHeight());
		}
	}
	public void go() {
		mtn.add(new Mountain("Longs", 14255, "black", 32));
		mtn.add(new Mountain("Elbert", 14433, "Green", 56));
		mtn.add(new Mountain("Maroon", 14156, "White", 5));
		mtn.add(new Mountain("Castle", 14256, "Gray", 94));
		
		System.out.println("as entered:\n"+mtn);
		
/*		NameCompare nc = new NameCompare();
		Collections.sort(mtn, nc); */
		
		Mountain mo = new Mountain();
		Collections.sort(mtn, mo);
		System.out.println("by name:\n"+mtn);
		
		HeightCompare hc = new HeightCompare();
		Collections.sort(mtn, hc);
		System.out.println("by height:\n"+mtn);
		
		Collections.sort(mtn);
		System.out.println("by color(implement comparable interface):\n"+mtn);
		
		Collections.sort(mtn, new Comparator<Mountain>() {

			@Override
			public int compare(Mountain o1, Mountain o2) {
				return (o1.getDistance()-o2.getDistance());
			}
		});
		System.out.println("by Distance:\n"+mtn);
	}

}

class Mountain implements Comparable<Mountain>, Comparator<Mountain>{
	private String name;
	private int height;
	private String color;
	private int distance;
	
	public Mountain(String name, int height, String color, int distance) {
		this.name = name;
		this.height = height;
		this.color = color;
		this.distance = distance;
	}
	
	public Mountain() {
	}

	@Override
	public int compare(Mountain o1, Mountain o2) {
		return o1.getName().compareToIgnoreCase(o2.getName());
	}
	
	@Override
	public int compareTo(Mountain o) {
		return this.getColor().compareToIgnoreCase(o.getColor());
	}
	
	@Override
	public String toString() {
		return name+" "+height+" "+color+" "+distance;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}
}
