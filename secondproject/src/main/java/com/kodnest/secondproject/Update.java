package com.kodnest.secondproject;
import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
/**
 * Hello world!
 *
 */
public class Update 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        
        
        
        
        
        // step-1
        Configuration conf  = new Configuration().configure("hibernate.cfg.xml");
        
        // step-2
       SessionFactory factory=conf.buildSessionFactory();
        
       
       // step-3
       Session session=factory.openSession();
        
       
       // step-4
       
     Transaction transaction = session.beginTransaction();
       
     
     // step-5
     System.out.println("Enter id to update:");
     int id = sc.nextInt();
     Book book = session.get(Book.class, id);
    
     if (book != null) {
        
    	 while(true) {
//    	 System.out.println("Enter new price");
//    	 int newPrice = sc.nextInt();
//    	 book.setPrice(newPrice);
    	 
    	 
    	 
    	 System.out.println("Press 1 to update name");
    	 System.out.println("Press 2 to update price");

    	 System.out.println("Press 3 to update author");
    	 System.out.println("Press 4 to update publisher");
    	 System.out.println("Press 5 to exit");
    	 
    	 int choice =sc.nextInt();
    	 
    	 if(choice == 5) {
    		 break;
    	 }
    	 switch(choice) {
    	 case 1:{
    		 System.out.println("Enter new name");
    		 String name = sc.next();
    		 book.setName(name);
    		 break;
    	 }
    	 
    	 case 2:{
    		 System.out.println("Enter new price");
    		 int price = sc.nextInt();
    		book.setPrice(price);
    		break;
    	 }
    	 
    	 case 3:{
    		 System.out.println("Enter new author");
    		 String author = sc.next();
    		book.setAuthor(author);
    		break;
    	 }
    	 
    	 case 4:{
    		 System.out.println("Enter new publisher");
    		 String publisher = sc.next();
    		book.setPublisher(publisher);
    		break;
    	   }
    	 default :{
       	  System.out.println("Invalid Option selected please try again: ");
        }
    	 } // switch close
    	 
    	 System.out.println("Record Updated");
    	 } // while close
    	 
    	 session.persist(book); // here persist save and update dono kaam karega
    	// step-6
         
         transaction.commit();
         
         
        // step-7
         
         session.close();
         factory.close();
         
     } 
     else {
    	System.out.println("Record not found for this ID:" + id);
     }
     
     
    
    
    }
}
