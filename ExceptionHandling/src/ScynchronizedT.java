
public class ScynchronizedT implements Runnable {
@Override
synchronized public void run() {
	try
	{
		String threadName = Thread.currentThread().getName();
		System.out.println(threadName + " Started using printer");
		Thread.sleep(3000);
		System.out.println(threadName + " is using printer");
		Thread.sleep(3000);
		System.out.println(threadName + " stoped using printer");
		Thread.sleep(3000);
	} catch(Exception e) {
		e.printStackTrace();
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ScynchronizedT pr = new ScynchronizedT();
		Thread t1 = new Thread(pr);
		Thread t2 = new Thread(pr);
		Thread t3 = new Thread(pr);
		
		t1.setName("Java Dev");
		t2.setName("Python Dev");
		t3.setName("C Dev");
		
		t1.start();
		t2.start();
		t3.start(); 
	}

}
