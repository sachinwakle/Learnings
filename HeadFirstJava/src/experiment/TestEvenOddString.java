package experiment;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestEvenOddString{
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EvenOddString eo = new EvenOddString();
		boolean ans = eo.isEvenString("abacbccbaddd");
		if (ans) 
			System.out.println("String is even.");
		else
			System.out.println("String is odd.");
	}
}

class EvenOddString {
	
	boolean isEvenString(String strName)
	{
		int length = strName.length();
		char charOne;
		HashMap<Character,Integer> hMap = new HashMap<Character,Integer>();
		charOne = strName.charAt(0);
		for(int i=0;i<length;i++)
		{
			charOne = strName.charAt(i);
			
			if(hMap.containsKey(charOne))
			{
				hMap.put(charOne, hMap.get(charOne)+1);
			}
			else
			{
				hMap.put(charOne, 1);
			}
		}
		System.out.println(hMap);
		
		int count = hMap.get(charOne);
		
		 Set<Entry<Character, Integer>> entry = hMap.entrySet();
		
		for(Entry<Character, Integer> ch  : entry)
		{
			if(count != ch.getValue())
			{
				return false;
			}
		}
		
		return true;
	}

}
