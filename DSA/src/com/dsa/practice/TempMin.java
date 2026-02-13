package com.dsa.practice;

import java.util.Scanner;

public class TempMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of days:");
		int n = sc.nextInt();
		int[] temps = new int[n];
		
		for(int i=0;i<n;i++) {
			temps[i] = sc.nextInt();
		}
		
		
		int min = temps[0];
		
		for(int i=1;i<n;i++) {
			if(temps[i] < min) {
				min=temps[i];
			}
		}
		System.out.println("Minimum Temperature: " + min);
		sc.close();
	}

}
