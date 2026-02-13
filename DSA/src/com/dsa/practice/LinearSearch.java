package com.dsa.practice;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total  number of product");
		int n = sc.nextInt();
		sc.nextLine();
		
		
		String[] product = new String[n];
		System.out.println("Enter all products");
		for(int i=0;i<n;i++) {
			product[i] = sc.nextLine();
		}
		
		System.out.println("Enter product to search:");
		String sp = sc.nextLine();
		
		boolean found = false;
		
		for(int i=0;i<n;i++) {
			if(product[i].equals(sp)) {
				found = true;
				break;
			}
		}
		if(found) {
			System.out.println("Product Found");
		} else {
			System.out.println("Product Not Found");
		}
		sc.close();
	}

}
