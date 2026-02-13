package com.kodnest.mappingproject;

import java.util.Scanner;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
//    	Scanner sc = new Scanner(System.in);
    	
//    	no need for fetch data
    	
//    	System.out.println("Enter street no, street name, city, state, country, pincode");
//        Address address = new Address(sc.nextInt(),sc.next(),sc.next(),sc.next(),sc.next(),sc.nextInt());
//    
//        
//        System.out.println("Enter student name, marks, age");
//        Student student = new Student(sc.next(),sc.nextInt(),sc.nextInt(),address);
//    
        
        // hibernet step
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
//        session.persist(student);
        
//        FOR FETCH 
       Student stu= session.get(Student.class,1);
        System.out.println(stu);
        transaction.commit();
        session.close();
        factory.close();
//        sc.close();
    
    }
}
