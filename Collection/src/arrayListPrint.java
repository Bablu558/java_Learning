import java.util.Scanner;
import java.util.ArrayList;

public class arrayListPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size");
		int si = sc.nextInt();
//		ArrayList list = new ArrayList();
		
//		OR
		ArrayList<Integer> list = new ArrayList<>();
		
		System.out.println("Enter element: ");
		for(int i=0;i<si;i++) { 
			int elm = sc.nextInt();
			list.add(elm);
		}
		System.out.println("Size:" + list.size());
        System.out.print("Element: ");
		for(Object result : list) {
			System.out.print(result + " ");
		}
		sc.close();
	}

}
