package experiment;

public class ExceptionTest2 implements Runnable {

	public static void main(String[] args) {
		
		ExceptionTest2 et2 = new ExceptionTest2();
		
		Thread h = new Thread(et2);
		h.start();
		et2.invokeRun();
		
		System.out.println("Overloaded Run mehtod: "+ExceptionTest2.run(32));
		et2.run();

	}

	@Override
	public void run() {
		System.out.println("In run method.");
	}
	
	public static int run(int num)
	{
		return num;
	}
	
	public void invokeRun()
	{
		System.out.println("Before run");
		run();
		System.out.println("After run");
	}

}
