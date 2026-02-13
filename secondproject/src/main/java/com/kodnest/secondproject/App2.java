package com.kodnest.secondproject;
import java.util.*;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App2 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        
		
       
       // step-3
       Session session=factory.openSession();
        
       
       // step-4
       
     Transaction transaction = session.beginTransaction();
       
     
     // step-5 
     
     // for getting a single data
//     System.out.println("Enter id");
//     Book ref=session.get(Book.class, sc.nextInt());
//     
//     System.out.println(ref.getBookid()+" "+ref.getName()+" "+ref.getPrice()+" "+ref.getAuthor()+" "+ref.getPublisher());
//     
//     System.out.println(ref);
     
     
     
//     for getting all data from db
     
     List<Book> books = session.createQuery("From Book",Book.class).list();
     
     // print all records
     
      
     for(Book b: books) {
    	 System.out.println(
    			 b.getBookid() + " " +
    	         b.getName() + " " +
    			 b.getPrice() + " " +
    	         b.getAuthor()+ " " +
    			 b.getPublisher()
    			 
    			 );
     }
     
     // step-6
     
     transaction.commit();
     
     
    // step-7
     
     session.close();
     factory.close();
    
    }
	}


