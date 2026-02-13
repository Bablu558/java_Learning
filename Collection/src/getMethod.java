import java.util.Scanner;
import java.util.ArrayList;

public class getMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=0;i<n;i++) {
			list.add(sc.nextInt());
		}
		
		int index = sc.nextInt();
		
		System.out.println("Element at index " + index + ": " + list.get(index));
	}

}
