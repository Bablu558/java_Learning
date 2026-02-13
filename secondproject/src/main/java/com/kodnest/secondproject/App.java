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
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("name,price,Author, publisher");
        
        Book book = new Book(sc.next(),sc.nextInt(),sc.next(),sc.next());
        
        
        // step-1
        Configuration conf  = new Configuration().configure("hibernate.cfg.xml");
        
        // step-2
       SessionFactory factory=conf.buildSessionFactory();
        
       
       // step-3
       Session session=factory.openSession();
        
       
       // step-4
       
     Transaction transaction = session.beginTransaction();
       
     
     // step-5
     
     session.persist(book);
     
     // step-6
     
     transaction.commit();
     
     
    // step-7
     
     session.close();
     factory.close();
    
    }
}
