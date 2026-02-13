
public class SelectionShort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {87,45,21,32,6,5,1,2,84};
		for(int i=0;i<arr.length-1;i++) {
			int smallest = i;
			for(int j=i+1; j<arr.length;j++) {
				if(arr[smallest] >arr[j]) {
					smallest =j;
				}
			}
			
			int temp= arr[smallest];
			arr[smallest] = arr[i];
			arr[i] = temp;
		}
		 System.out.println("Sorted Array is : ");
		 for (int i = 0; i < arr.length; i++) {
			
     	    System.out.print(arr[i] + " ");
     	}
    
	}

}
