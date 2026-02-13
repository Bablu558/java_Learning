package com.dsa.practice;

import java.util.Scanner;

public class FindToyIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter size:");
		int n = sc.nextInt();
		int[] toyId= new int[n];
		
		for(int i = 0;i<n;i++) {
			toyId[i] = sc.nextInt();
		}
		
		int targetToy = sc.nextInt();
		
		int position = -1;
		
		for(int i=0;i<n;i++) {
			if(toyId[i] == targetToy) {
				position = i+1;
				break;
			}
		}
		
		if(position != -1) {
			System.out.println("Toy found at position: " + position);
		}else {
			System.out.println("Toy not found");
		}
		sc.close();
	}

}
