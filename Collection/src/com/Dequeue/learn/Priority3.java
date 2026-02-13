package com.Dequeue.learn;

import java.util.*;

public class Priority3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		PriorityQueue pq = new PriorityQueue();
		
		for(int i=1;i<=n;i++) {
			pq.add(sc.nextInt());
		}
		
		pq.add(sc.nextInt());
		
		
		
		System.out.println("Updated Queue of task priorities:");
		for(Object x : pq) {
			System.out.print(x + " ");
		}
		

		System.out.println();
		System.out.println("number of element: "+ pq.size());
		sc.close();
	}

}
