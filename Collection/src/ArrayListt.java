import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter Size:");
int n = sc.nextInt();
 sc.nextLine();
 System.out.println("Enter Element:");
 ArrayList<String> list = new ArrayList<>();
 
 for(int i= 0; i < n; i++) {
	 list.add(sc.next());
 }
 System.out.println("Enter index which u want to add new element:");
 int index = sc.nextInt();
 sc.nextLine();
 System.out.println("Enter That string which you want to add:");
 String newString = sc.nextLine();
 
 // jo user ne index diya h usme add element karenge
 list.add(index,newString);
 
 System.out.print("Updated ArrayList:");
 for(String element: list) {
	 System.out.print(element+ " ");
 }
 sc.close();
	}

}
