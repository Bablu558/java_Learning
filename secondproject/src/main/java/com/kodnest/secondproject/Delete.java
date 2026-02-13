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
public class Delete 
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
     System.out.println("Enter id to delete:");
     int id = sc.nextInt();
     Book book = session.get(Book.class, id);
    
     if (book != null) {
         session.delete(book);
         System.out.println("Record deleted successfully");
     }
     session.delete(book);
     
     // step-6
     
     transaction.commit();
     
     
    // step-7
     
     session.close();
     factory.close();
     
     System.out.println("record deleted");
    
    }
}
