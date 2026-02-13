import java.util.LinkedList;
import java.util.Scanner;
public class LinkedListAddLast {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
           
        int n = sc.nextInt();
        
        // Consume the newline character after reading n
        sc.nextLine(); 
        LinkedList<String>Queue = new LinkedList<>();
       
        for (int i = 0; i < n; i++) {
            // Read each customer name (string) on a new line
            String customerName = sc.nextLine();
            
            // Add the new customer to the end of the list (FIFO behavior)
            Queue.addLast(customerName);
        }

       
        System.out.println("Queue Size: " + Queue.size());
        System.out.println("Customers:");

        
        for (String name : Queue) {
            System.out.println(name);
        }

	}

}
