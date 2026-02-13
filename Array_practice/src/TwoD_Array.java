import java.util.Scanner;
public class TwoD_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter Rows:");
         int rows = sc.nextInt();
         System.out.println("Enter cols:");
         int cols = sc.nextInt();
         
         int[][] arr = new int[rows][cols];
         
         // enter array
         for(int i=0;i<rows;i++) {
        	 for(int j=0;j<cols;j++) {
        		 arr[i][j] = sc.nextInt();
        	 }
         }
//          print array 
         for(int i=0;i<rows;i++) {
        	 for(int j=0;j<cols;j++) {
        		 System.out.print(arr[i][j]);
        	 }
        	 System.out.println();
         }
         int mSum = 0;
         for(int i=0;i<rows;i++) {
        	 int rowMin = arr[i][0];
        	 for(int j=1;j<cols;j++) {
        		 if(arr[i][j]< rowMin) {
        			 rowMin = arr[i][j];
        		 }
        	 }
        	 System.out.println("Row " + (i+1) + " Min = " + rowMin);
        	 mSum += rowMin;
         }
         System.out.println("sum "+ mSum);
	}

}
