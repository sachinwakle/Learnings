package experiment;

public class SubstringProgram {

	public static void main(String[] args) {

		SubstringProgram sp =new SubstringProgram();
		System.out.println("Non Repeating Char: "+sp.nonRepeated());
	}
	
	public char nonRepeated()
	{
		String str = "Collection";
		int length = str.length();
		char[] ar = str.toCharArray();
		int j;
		for(int i=0; i<length; i++ )
		{
			for( j=0; j<length; j++)
			{
				if(ar[i]==ar[j])
				{
					break;
				}
				
			}
			if(j==length)
			{
				return ar[i];
			}
		}
		return 0;
	}

}
