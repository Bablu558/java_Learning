
import java.util.Arrays;
public class ArrayElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr = {45,15,78,98,2,1,6};
         // System.out.println("original array is: " + Arrays.toString(arr));
         // Arrays.sort(arr);
         //   System.out.println("original array is: " + Arrays.toString(arr));
         
         
         // other way to print
         Arrays.sort(arr); // for print array in short format means assending
         for(int i=0;i<arr.length;i++){
           System.out.print(arr[i] + " ");
         }
	}

}
