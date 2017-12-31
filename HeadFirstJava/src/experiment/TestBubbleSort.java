package experiment;

public class TestBubbleSort {

	public static void main(String[] args) {

		TestBubbleSort bSort = new TestBubbleSort();
		int[] sortedList = {4,8,3,10,2};
		System.out.println("List before sort:");
		for(int ele:sortedList)
			System.out.print(" "+ele);
		
		bSort.bubbleSortList(sortedList);
		System.out.println("\nList after Bubble sort:");
		for(int ele:sortedList)
			System.out.print(" "+ele);


	}
	
	public void bubbleSortList(int[] ary)
	{
		boolean switched;
		
		do{
			switched = false;
			for(int i=0; i<ary.length-1; i++)
			{
				if(ary[i+1]<ary[i])
				{
					int tmp = ary[i];
					ary[i] = ary[i+1];
					ary[i+1] = tmp;
					switched = true;
				}
			}
		}while(switched);
	}

}
