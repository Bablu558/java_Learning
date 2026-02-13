package com.Dequeue.learn;

import java.util.*;

public class Priority2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		PriorityQueue pq = new PriorityQueue();
		
		for(int i=1;i<=n;i++) {
			pq.add(sc.nextInt());
		}
		
		pq.add(sc.nextInt());
		
		pq.remove();
		
		System.out.println("Updated Queue of task priorities:");
//		for(Object x : pq) {
//			System.out.print(x + " ");
//		}
		
		
		// jab tak queue empty na ho usme se min remove karte raho print  so element sorted form me print hoga 
		while(!pq.isEmpty()) {
			System.out.print(pq.remove()+ " ");
		}
		sc.close();
	}

}
