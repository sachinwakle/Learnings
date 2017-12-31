package experiment;

public class ExceptionTest {

	public static void main(String[] args) throws Exception {
		ExceptionTest et = new ExceptionTest();
		int reTURN = et.printStatement("yes");
		System.out.println("return in main: "+reTURN);
	}
	
	int printStatement(String st) throws Exception
	{
		int num = 10;
		try
		{
			System.out.println("num= "+num);
			num = Integer.parseInt(st);
		}
		catch (NumberFormatException e) {
			num = 20;
			System.out.println("num= "+num);
			throw new Exception();
		}
		finally
		{
			System.out.println("finally");
			return 0;
		}
	}

}
