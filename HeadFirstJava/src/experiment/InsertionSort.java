package experiment;

import java.util.ArrayList;
import java.util.LinkedList;

public class InsertionSort {

	public static void main(String[] args) {
		
		ArrayList<Integer> orgList = new ArrayList<>();
		orgList.add(34);
		orgList.add(4);
		orgList.add(3);
		orgList.add(10);
		orgList.add(7);
		InsertionSort is = new InsertionSort();
		LinkedList<Integer> sortedList = is.doInsertionSort(orgList);
		System.out.println(sortedList);

	}
	
	public LinkedList<Integer> doInsertionSort(ArrayList<Integer> originalArray)
	{
		LinkedList<Integer> sortedArray = new LinkedList<>();
		
	OriginalList:for(Integer num : originalArray)
		{
			for(int i=0;i<sortedArray.size();i++)
			{
				if(num<sortedArray.get(i))
				{
					sortedArray.add(i, num);
					continue  OriginalList;
				}
			}
			
			sortedArray.add(sortedArray.size(), num);
		}
	return sortedArray;
		
	}

}
