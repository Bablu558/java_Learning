
import java.util.Scanner;
public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter String:");
//		String str = sc.nextLine();
//		sc.close();
//		char[] arr = str.toCharArray();
//		
//		System.out.println("Reversed:");
//		
//        for(int i= arr.length-1; i>=0 ; i--) {
//        	System.out.print(arr[i]);
//        }
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String:");
		String str = sc.nextLine();
		sc.close();
		StringBuilder result = new StringBuilder();
		
		char[] arr = str.toCharArray();
		
		System.out.println("Reversed:");
		
        for(int i= arr.length-1; i>=0 ; i--) {
//        	System.out.print(arr[i]);
        	result.append(arr[i]);
        }
        String reversed = result.toString();
//        if(str.equals(reversed)) {
        
        // will asume capital and small letter same
        if(str.equalsIgnoreCase(reversed)) {
        	System.out.println(reversed + ", is Palidrom:");
        }else {
        	System.out.println( reversed + ", is Not a Palidrom:");
        }
		
        
        
	}

}
