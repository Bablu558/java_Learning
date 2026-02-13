
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// for separate class
		
//PrintingNum pn = new PrintingNum();
//PrintChar pc = new PrintChar();
//Addition ad = new Addition();
//
//pn.start();
//pc.start();
//ad.start();
		
		
		
//		for Activity single and extends
		
//		Activity ac1 = new Activity();
//		Activity ac2= new Activity();
//		Activity ac3 = new Activity();
//
//		ac1.setName("ADD");
//		ac2.setName("CHAR");
//		ac3.setName("NUM");
//		ac1.start();
//		ac2.start();
//		ac3.start();
		
		
		
//		for implement runable interface
		
		RunableActivity task = new RunableActivity();
		Thread ac2= new Thread(task);
		Thread ac3 = new Thread(task);
		Thread ac4 = new Thread(task);

		ac2.setName("ADD");
		ac3.setName("CHAR");
		ac4.setName("NUM");
		
		ac2.start();
		ac3.start();
		ac4.start();
	}

}
