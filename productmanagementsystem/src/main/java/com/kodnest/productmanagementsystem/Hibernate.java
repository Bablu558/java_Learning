package com.kodnest.productmanagementsystem;

import java.util.*;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Hibernate {

	SessionFactory factory;
	Session session;
	
	Scanner sc = new Scanner(System.in);
	
	public Hibernate() {
		factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	  
		session =factory.openSession();
	}
	
	public void addProduct() {
		System.out.println("Enter  pname, p_price, p_stock,p_description, p_imageUrl");
		Product product = new Product(sc.next(),sc.nextInt(),sc.nextInt(),sc.next(),sc.next());
		 
		Session session=factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.persist(product);
		transaction.commit();
		session.close();
	}
	
public void getProductById() {
	System.out.println("Enter Product id:");
	
	int pid = sc.nextInt();
	
	
	Session session=factory.openSession();
	Transaction transaction = session.beginTransaction();
	Product product = session.get(Product.class, pid);
	
	if(product!=null) {
		System.out.println("product"+ product);
		
	}else {
		System.out.println("Invalid product id please try again");
	}
	transaction.commit();
	session.close();
	}

public void deleteProduct() {
System.out.println("Enter Product id:");
	
	int pid = sc.nextInt();
	
	
	Session session=factory.openSession();
	Transaction transaction = session.beginTransaction();
	Product product = session.get(Product.class, pid);
	
	if(product!=null) {
		session.remove(product);
		
	}else {
		System.out.println("Invalid product id please try again");
	}
	transaction.commit();
	session.close();
	}


public void updateProduct() {
System.out.println("Enter Product id:");
	
	int pid = sc.nextInt();
	
	
	Session session=factory.openSession();
	Transaction transaction = session.beginTransaction();
	Product product = session.get(Product.class, pid);
	
	if(product!=null) {
		while(true) {
		System.out.println("press 1 to update name");
		System.out.println("press 2 to update price");
		System.out.println("press 3 to update stock");
		System.out.println("press 4 to update descreption");
		System.out.println("press 5 to update imageUrl");
		System.out.println("press 6 to exit");
		
		int choice = sc.nextInt();
		
		if(choice==6) {
			break;
		}
		switch(choice) {
		case 1:{
			System.out.println("Enter new name");
			product.setProductName(sc.next());
			break;
		}
		
		case 2:{
			System.out.println("Enter new price");
			product.setProductPrice(sc.nextInt());;
		}
		
		case 3:{
			System.out.println("Enter new stock");
			product.setProductStock(sc.nextInt());
		}
		
		case 4:{
			System.out.println("Enter new description");
			product.setDescription(sc.next());
		}
		
		case 5:{
			System.out.println("Enter new imageUrl");
			product.setProductImageUrl(sc.next());
			break;
		}
		
		
		
	}
		
		}
		session.persist(product);
	}
		else {
		System.out.println("Invalid product id please try again");
	}
	
	transaction.commit();
	session.close();
	}

public void resourceCleanUp() {
	session.close();
	factory.close();
}
}
