package experiment;

public class threadOne extends Thread {

	public static void main(String[] args) throws InterruptedException {
		
		threadOne one = new threadOne();
		one.start();
		Thread.sleep(3);
		System.out.println("In main.");

	}
	
	@Override
	public void run() {
		System.out.println("In run.");

	}

}
