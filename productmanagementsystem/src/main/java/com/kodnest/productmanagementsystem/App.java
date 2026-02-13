package com.kodnest.productmanagementsystem;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        
    	Hibernate app= new Hibernate();
    	Scanner sc = new Scanner(System.in);
    	while(true) {
    	System.out.println("Press 1 to add product");
    	System.out.println("Press 2 to get product");
    	System.out.println("Press 3 to delete product");
    	System.out.println("Press 4 to update product");
    	System.out.println("Press 5 to exit");
    	
    	
    	int choice = sc.nextInt();
    	
    	switch(choice) {
    	case 1->app.addProduct();
    	case 2->app.getProductById();
    	case 3->app.deleteProduct();
    	case 4->app.updateProduct();
    	
    	default->{
    		app.resourceCleanUp();
    		System.out.println("Thank you for using kodnest management system");
    	}
    	
    	}
    	}
    	
    }
    
    
}
