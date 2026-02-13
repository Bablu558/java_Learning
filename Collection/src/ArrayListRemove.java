import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the size:");
         int n = sc.nextInt();
         System.out.println("Enter " + n + " Elements: ");
         ArrayList<Integer> list = new ArrayList<>();
         
//         read and add element to the Arraylist
         for(int i=0;i<n;i++) {
        	 list.add(sc.nextInt());
         }
         
         System.out.println("Enter index:");
         // User se index lenge
         int index = sc.nextInt();
         
         // us index ko remove karenge jo user ne diya h
         list.remove(index);
         
         // print updated ArrayList
         
         System.out.println("Updated ArrayList: ");
         for(int element: list) {
        	 System.out.print(element + " ");
         }
         sc.close();
	}

}
