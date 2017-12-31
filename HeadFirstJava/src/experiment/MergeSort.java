package experiment;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {

	public static void main(String[] args) {

		MergeSort ms = new MergeSort();
		List<Integer> sortList = new ArrayList<Integer>();
		sortList.add(9);
		sortList.add(4);
		sortList.add(10);
		sortList.add(8);
		sortList.add(9);
		sortList.add(12);
		
		System.out.println(ms.doMergeSort(sortList));
		
	}
	
	public List<Integer> doMergeSort(List<Integer> orgList)
	{
		if(orgList.size()<2)
		{
			return orgList;
		}
		
		int midIndex = orgList.size()/2;
		List<Integer> leftList = new ArrayList<Integer>();
		List<Integer> rightList = new ArrayList<Integer>();
		
		for(int i=0;i<midIndex;i++)
		{
			leftList.add(orgList.get(i));
		}
		
		for(int j=midIndex; j<orgList.size(); j++)
		{
			rightList.add(orgList.get(j));
		}
		
		
		return merge(doMergeSort(leftList), doMergeSort(rightList));
	}
	
	private List<Integer> merge(List<Integer> lowList, List<Integer> highList)
	{
		int lowPointer=0;
		int highPointer=0;
		List<Integer> sortedList = new ArrayList<Integer>();
		while(lowPointer<lowList.size() && highPointer<highList.size())
		{
			if(lowList.get(lowPointer)<highList.get(highPointer))
			{
				sortedList.add(lowList.get(lowPointer));
				lowPointer++;
			}
			else
			{
				sortedList.add(highList.get(highPointer));
				highPointer++;
			}
		}
		
		while(lowPointer<lowList.size())
		{
			sortedList.add(lowList.get(lowPointer));
			lowPointer++;
		}
		
		while(highPointer<highList.size())
		{
			sortedList.add(highList.get(highPointer));
			highPointer++;
		}
		
		return sortedList;
	}

}
