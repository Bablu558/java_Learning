package com.dsa.practice;

import java.util.Scanner;

public class BinarySearch {

public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
      System.out.println("Enter size:");
       
      int n = sc.nextInt();
      sc.next();
      String[] std = new String[n];
      
      for(int i=0;i<n;i++) {
    	  std[i] = sc.nextLine();
      }
      
      String srcName = sc.nextLine();
      
      int low=0;
      int high = n-1;
      boolean found = false;
      
      while(low <= high) {
    	  int mid = (low + high)/2;
    	  
    	  System.out.println("Enter String to search:");
    	 int result =  srcName.compareTo(std[mid]);
    	 
    	 if(result==0) {
    		 found =true;
    		 break;
    	 }
    	 else if(result <0) {
    		 high = mid-1;
    	 }
    	 else {
    		 low = mid+1;
    	 }
      }
      if(found) {
    	  System.out.println("Student Found");
      } else {
    	  System.out.println("Student Not Found");
      }
      sc.close();

	}

}
