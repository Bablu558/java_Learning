package com.Dequeue.learn;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
public class FirstProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size");
		int n = sc.nextInt();
		sc.nextLine();
		
		ArrayDeque Cq = new ArrayDeque();
		
		System.out.println("Enter ID's: ");
		for(int i=0;i<n;i++) {
			Cq.add(sc.nextInt());
		}
		
		System.out.println("Enter First");
		Cq.addFirst(sc.nextInt());
		System.out.println("Enter last");
		Cq.addLast(sc.nextInt());
		
		// remove first time 
//		Cq.removeFirst();
		
		// remove 2nd time
		
	System.out.println("Removed ID's is : "+	Cq.removeFirst());
		
		System.out.println("Updated queue:");
		
		for(Object x : Cq) {
			System.out.println(x + " ");
		}
		sc.close();
		
			
			
		
		
		
		sc.close();
	}

}
