package com.Dequeue.learn;

import java.util.ArrayDeque;

public class DequeueLearning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayDeque ad = new ArrayDeque();
		ad.add(100);
		ad.add(50);
		ad.add(60);
		ad.add(80);
		System.out.println(ad); //[100, 50, 60, 80]
		ad.addFirst(78);        
		System.out.println(ad);   //[78, 100, 50, 60, 80]
		
		ad.addLast(7);
		System.out.println(ad); // [78, 100, 50, 60, 80, 7]
		
		System.out.println(ad.contains(50)); // true
		System.out.println(ad.getFirst()); // 78
		System.out.println(ad.getLast()); // 7
		System.out.println(ad.isEmpty()); // false
		
		ad.offer(222);
		System.out.println(ad);   // [78, 100, 50, 60, 80, 7, 222]
		
		System.out.println(ad.peek()); //78
		System.out.println(ad);        // [78, 100, 50, 60, 80, 7, 222]
		
		System.out.println(ad.poll()); // 78
		
		System.out.println(ad); // [100, 50, 60, 80, 7, 222]
		
		System.out.println(ad.remove()); // 100
		System.out.println(ad);         // [50, 60, 80, 7, 222]
	     ad.remove(60);
	     System.out.println(ad);  // [50, 80, 7, 222]
	     
	     System.out.println(ad.size()); // 4
		
	     
		
	}

}
