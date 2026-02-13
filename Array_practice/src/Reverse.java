import java.util.Scanner;
public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter Size");
		  int size =  sc.nextInt();
		  int arr[] = new int[size];
		  
		  System.out.println("Enter Element:");
		  for(int i =0;i<size;i++) {
//			  System.out.println("Enter Element:" + (i+1));
			  arr[i]=  sc.nextInt();
		  }
		  int [] revAr = new int[arr.length];
	
		  int j = arr.length-1;
		  for(int i=0;i<=arr.length-1;i++) {
			  revAr[j] = arr[i];
			  j--;
		  }
		  System.out.print("Original array: [");
		  for(int i=0;i<=arr.length-1;i++) {
			  System.out.print(arr[i]);
			  if(i<arr.length-1) {
				  System.out.print(", ");
			  }
		  }
		  System.out.println("]");
		  
		  
		  System.out.print("Reversed array: [");
		  for(int i=0;i<=revAr.length-1;i++) {
			  System.out.print(revAr[i]);
			  if(i<revAr.length-1) {
				  System.out.print(", ");
			  }
		  }
		  System.out.println("]");
		  
	}

}
