package experiment;

import java.util.ArrayList;
import java.util.List;

public class BinarySearch {

	public static void main(String[] args) {
		
		List<Integer> rawList = new ArrayList<Integer>();
		rawList.add(8);
		rawList.add(34);
		rawList.add(5);
		rawList.add(4);
		rawList.add(67);
		rawList.add(1);
		
		MergeSort ms = new MergeSort();
		List<Integer> sortedList = ms.doMergeSort(rawList);
		
		if(doBinarySearch(sortedList,5))
			System.out.println("Element Found.");
		else
			System.out.println("Element Not Found.");

	}

	public static boolean doBinarySearch(List<Integer> sortedList, final Integer value)
	{
		if(sortedList == null || sortedList.isEmpty())
			return false;
		
		if(value == sortedList.get(sortedList.size()/2))
		{
			return true;
		}
		
		if(value<sortedList.get(sortedList.size()/2))
		{
			return doBinarySearch(sortedList.subList(0, sortedList.size()/2), value);
		}
		else
		{
			return doBinarySearch(sortedList.subList(sortedList.size()/2+1,sortedList.size()), value);
		}
	}
}
