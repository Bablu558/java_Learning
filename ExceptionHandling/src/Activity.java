//import java.util.Scanner;
//
//public class Activity extends Thread{
//	@Override
//public void run() {
//	if(Thread.currentThread().getName().equals("ADD")) {
//		addition();
//	}else if(Thread.currentThread().getName().equals("CHAR")) {
//		printChar();
//	} else {
//		printNum();
//	}
//}
//	
//void addition() {
//	System.out.println("Addition activity started");
//	Scanner sc = new Scanner(System.in);
//	System.out.println("Enter first number");
//	int a = sc.nextInt();
//	System.out.println("Enter second number");
//	int b = sc.nextInt();
//	int res = a+b;
//	System.out.println("Addition result is " + res);
//	System.out.println("Addidtion activity completed");
//}
//
//
//void printChar() {
//	System.out.println("Printing char activity started");
//	for(char ch = 'A';ch<='I';ch++) {
//		System.out.println(ch);
//		try {
//			Thread.sleep(3000);
//		}catch(InterruptedException e) {
//			System.out.println("printing char intrrupted");
//		}
//	}
//	System.out.println("Printing char activity completed");
//}
//
//
//void printNum() {
//	System.out.println("Printing num activity started");
//	 for(int i=1;i<=10;i++) {
//		 System.out.println(i);
//		 try {
//			 Thread.sleep(3000);
//		 }catch (InterruptedException e) {
//			 System.out.println("Printing char interruped");
//		 }
//	 }
//	 System.out.println("Printing num activity completed");
//}
//}
