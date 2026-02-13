import java.util.LinkedList;
import java.util.Scanner;
public class LinkedListArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc = new Scanner(System.in);
   
   System.out.println("Enter number of task:");
   int n = sc.nextInt();
   
   sc.nextLine();
   // Create karenge linkedLIst to store task
   System.out.println("Enter all " + n + "Task:");
   LinkedList<String> tasks = new LinkedList<>();
   
   for(int i=0;i<n;i++) {
	   String task = sc.nextLine();
	   tasks.addFirst(task);
   }
   // print size of LinkedList
   System.out.println("Number of tasks: " + tasks.size());
   
   // print all task
   System.out.println("Task:");
   for(String task : tasks) {
	   System.out.println(task);
   }
   sc.close();
	}

}
