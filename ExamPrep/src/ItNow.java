
import java.util.Scanner;
public class ItNow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int evenSum=0;
        int oddSum = 0;
        System.out.println("enter val:");
        for(int i=0;i<n;i++) {
        	
        	int val =sc.nextInt();
        	if(val %2==0)
        		evenSum +=val;
        	else 
        		oddSum+=val;
        }
        System.out.println("Even Sum: " + evenSum);
	System.out.println("Odd Sum: " + oddSum);
	}

}
