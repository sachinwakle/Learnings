package experiment;

public class NonRepeatingCharacter {

	public static void main(String[] args) {
        NonRepeatingCharacter nrc = new NonRepeatingCharacter();
        char nrchar = nrc.firstNonRepeatingChar("Cogllco");
        if(nrchar == '0')
        	System.out.println("All characters are repeated.");
        else
        	System.out.println("This is first Non Repeated char: "+nrchar);
	}
	
	char firstNonRepeatingChar(String str)
	{
		char notRepeatedChar;
		int count=0;
		String sName = str.toLowerCase();
		int length = sName.length();
		for(int i=0;i<length;i++)
		{
			count = 0;
			notRepeatedChar = sName.charAt(i);
			for(int j=0;j<length;j++)
			{
				if(notRepeatedChar == sName.charAt(j))
					count++;
			}
			
			if(count==1)
			{
				return notRepeatedChar;
			}
		}
		return '0';
	}

}
