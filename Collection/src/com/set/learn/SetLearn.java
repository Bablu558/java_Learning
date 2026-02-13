package com.set.learn;
import java.util.*;

public class SetLearn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet ts = new TreeSet();
		ts.add(100);
		ts.add(50);
		ts.add(150);
		ts.add(25);
		ts.add(75);
		ts.add(125);
		ts.add(175);
		ts.add(100);
		System.out.println(ts);
	
		System.out.println(ts.contains(10));
		System.out.println(ts.ceiling(100));
		System.out.println(ts.floor(100));
		System.out.println(ts.lower(100));
		System.out.println(ts.higher(100));
		System.out.println(ts.ceiling(60));
		
		
		System.out.println(ts.floor(60));
		System.out.println(ts.lower(60));
		System.out.println(ts.higher(60));
		System.out.println(ts.ceiling(60));
	
		
	}

}
