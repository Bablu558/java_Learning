package com.Dequeue.learn;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueLrn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// base on min-heap
		PriorityQueue pq1 = new PriorityQueue();
		pq1.add(100);
		pq1.add(50);
		
		pq1.add(150);
		pq1.add(25);
		pq1.add(75);
		pq1.add(125);
		pq1.add(175);
		System.out.println(pq1); // [25, 50, 125, 100, 75, 150, 175]
		
		System.out.println(pq1.remove()); // 25
		System.out.println(pq1.remove()); // 50
		System.out.println(pq1.remove());// 75
//		base on max-> heap
		
		PriorityQueue pq =new PriorityQueue(Collections.reverseOrder());
		
		pq.add(100);
		pq.add(50);
		
		pq.add(150);
		pq.add(25);
		pq.add(75);
		pq.add(125);
		pq.add(175);
		
		System.out.println(pq);   // [175, 75, 150, 25, 50, 100, 125]
	}

}
