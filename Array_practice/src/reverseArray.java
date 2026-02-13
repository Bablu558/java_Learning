
import java.util.Scanner;
public class reverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size:");
            int size = sc.nextInt();
            int arr[] = new int[size];
            for(int i=0;i<size;i++) {
            	arr[i] = sc.nextInt();
            	
            }
            System.out.print("Array: [");
            for(int i=0;i<size;i++) {
            	System.out.print(arr[i]);
            	if(i<arr.length-1) {
            		System.out.print(", ");
            	}
            }
            System.out.print("]\n");
            
            
            System.out.print("Reversed Array:");
            System.out.print("[");
            for(int i = size-1;i>=0;i--) {
            	System.out.print(arr[i]);
            	if(i>0) {
            		System.out.print(", ");
            	}
            }
            System.out.print("]");
            
             
	}

}
