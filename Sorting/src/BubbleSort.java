
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int[] shortt = {5,78,41,21,62,1,2,9};
         int n = shortt.length;
         for(int i=0;i<n-1;i++) {
        	 for(int j=0;j<n-1-i;j++) {
        		 if(shortt[j] > shortt[j+1]) {
        			 int temp = shortt[j];
        			 shortt[j] = shortt[j+1];
        			 shortt[j+1] = temp;
        		 }
        	 }
         }
         System.out.println("Shorted Array: ");
         
         for (int i = 0; i < n; i++) {
        	    System.out.print(shortt[i] + " ");
        	}
         
         // 2nd to print usi for-each loo
         
//         for(int num : shortt) {
//        	 System.out.print(num + " ");
//         }
	}

}
