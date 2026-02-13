import java.util.Scanner;

public class algo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("Enter first number:");
	        int a = scanner.nextInt(); // 5
	        
	        System.out.println("Enter second number:");
	        int b = scanner.nextInt(); // 10
//	        if(a > b) {
//	        	System.out.println("Number " + a + " is Greatest");
//	        } else if(a == b) {
//	        	System.out.println("Both " + a + " and " + b + " is Equal");
//	        }else {
//	        	System.out.println("Number " + b + " is Greatest");
//	        }
	        
	        System.out.println("Before Swapping " + a + " " + b);
	        a= a+b; // 5+10= 15
	        b = a-b; // 15-10= 5
	        a = a-b; // 15-5= 10
	        System.out.println("After Swapping " + a + " " + b);
	        
	        
	        scanner.close();
	}

}
