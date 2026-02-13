import java.util.Scanner;

public class MaxNumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter Element:");
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
        
        // find max
        int max = arr[0];
        for(int i=1; i<size;i++) {
        	if(arr[i] > max) {
        		max = arr[i];
        	}
        }
        System.out.println("Maximum Number is: "+max);
	}

}
