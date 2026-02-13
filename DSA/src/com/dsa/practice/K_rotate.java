package com.dsa.practice;
import java.util.Scanner;
public class K_rotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc = new Scanner(System.in);
          
          System.out.println("Enter Size: ");
          int size = sc.nextInt();
          int arr[] = new int[size];
          
          for(int i=0;i<size;i++) {
        	  arr[i]= sc.nextInt();
          }
          
          int k = sc.nextInt();
          int[] rotated = rotate(arr, k);
          for(int i=0; i<arr.length; i++) {
        	    if(arr.length==1) {
        	System.out.print("["+ arr[i]+"]");
        	    }else {
        	    if(i==0) {
        	        System.out.print("[" + arr[i]+", ");
        	    } else if(i>0 && i<arr.length-1) {
        	        System.out.print(arr[i]+", ");
        	    } else if(i==arr.length-1) {
        	        System.out.print(arr[i] + "]");
        	    }
        	    }
        	}
          
          
	}
	
	public static void reverse(int[] arr, int start, int end) {
		while(start<end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end]= temp;
			start++;
			end--;
		}
	}
	
	public static int[] rotate(int[] arr, int step) {
		int n= arr.length;
		step = step%n;
				
//	one time full array reverse
		reverse(arr,0,n-1);
		
//		reverse the arry from step given
		reverse(arr,0,step-1);
		reverse(arr,step,n-1);
		return arr;
	}
	

}
