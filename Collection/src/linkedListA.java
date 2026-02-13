import java.util.*;

public class linkedListA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		LinkedList<Integer> el = new LinkedList<>();
		el.add(10);
		el.add(20);
		el.add(30);
		el.add(40);
		el.add(50);
		
		System.out.println("Traversing using for loop");
		
		for(int  i=0;i<=el.size()-1;i++) {
			System.out.print(el.get(i)+ " ");
		}
		
		System.out.println();
		System.out.println("Traversing using for each loop");
		for(Object x : el) {
			System.out.print(x + " ");
		}
		System.out.println();
		
		System.out.println("Traversing using Iterator");
		
		Iterator itr =el.iterator();
		while(itr.hasNext()==true) {
			System.out.print(itr.next()+ " ");
		}
	}

}
