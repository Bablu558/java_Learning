package com.dsa.practice;
import java.util.Scanner;
public class mergeArray {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first Array");
        String line1 = sc.nextLine();
        System.out.println("Enter Second Array");
        String line2 = sc.nextLine();
        
        // Split karenge by space
        
        String[] s1 = line1.split(" ");
        String[] s2 = line2.split(" ");
        
        // convert karenge  int array
        
        int[] arr1 = new int[s1.length];
        int[] arr2 = new int[s2.length];
        
        for(int i=0;i<s1.length;i++) {
        	arr1[i] = Integer.parseInt(s1[i]);
        }
        
        for(int i=0;i<s2.length;i++) {
        	arr2[i] = Integer.parseInt(s2[i]);
        }
        
       // Merge  karenge
        
        int[] merged = new int[arr1.length + arr2.length];
        int index = 0;
        
        for(int i=0;i<arr1.length;i++) {
        	merged[index++] = arr1[i];
        	
        }
        
        for(int i=0;i<arr2.length;i++) {
        	merged[index++] = arr2[i];
        	
        }
        
        // find karenge min and max ko
        
        int min = merged[0];
        int max = merged[0];
        
        for(int i = 1; i<merged.length;i++) {
        	if(merged[i] < min) min = merged[i];
        	if(merged[i]>max) max = merged[i];
        	
        }
        
        // print 
        System.out.print("Merged Array: [");
        
        for (int i = 0; i < merged.length; i++) {
            if (i < merged.length - 1)
                System.out.print(merged[i] + ", ");
            else
                System.out.print(merged[i]);
        }
        System.out.println("]");
        System.out.println("Minimum Value: " + min);
        System.out.println("Maximum Value: " + max);

        sc.close();
    }
   
	}

