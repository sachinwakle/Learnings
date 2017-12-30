package experiment;

import java.util.ArrayList;
import java.util.List;

public class QuickSort {

	public static void main(String[] args) {

			QuickSort qs = new QuickSort();
			List<Integer> toBeSortList = new ArrayList<>();
			toBeSortList.add(7);
			toBeSortList.add(1);
			toBeSortList.add(0);
			toBeSortList.add(10);
			toBeSortList.add(4);
			toBeSortList.add(8);
			System.out.println("---Quick Sort---");
			System.out.println("Before Sorting: "+toBeSortList);
			toBeSortList = qs.doQuickSort(toBeSortList);
			System.out.println("After Sorting: "+toBeSortList);
			
	}

	public List<Integer> doQuickSort(List<Integer> orgList)
	{
		if(orgList.size()<2)
			return orgList;

		final Integer pivot = orgList.get(0);
		List<Integer> lowerList = new ArrayList<Integer>();
		List<Integer> higherList = new ArrayList<Integer>();
		
		for(int i=1;i<orgList.size();i++)
		{
			if(orgList.get(i)<pivot)
			{
				lowerList.add(orgList.get(i));
			}
			else
			{
				higherList.add(orgList.get(i));
			}
		}
		
		List<Integer> sortedList = doQuickSort(lowerList);
		sortedList.add(pivot);
		sortedList.addAll(doQuickSort(higherList));
		
		return sortedList;
	}
}
