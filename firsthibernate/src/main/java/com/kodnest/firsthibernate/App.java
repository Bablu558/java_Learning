package com.kodnest.firsthibernate;

import java.util.Scanner;

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
//        System.out.println("Enter name, gender and salary of Employee");
//        Employee emp =new Employee(sc.next(), sc.next(),sc.nextInt());
        
        System.out.println("Enter C_name, email , phone and account number of Bankuser");
        Bankuser emp =new Bankuser(sc.next(),sc.next(),sc.nextInt(),sc.next());
        
        
        // hibernate steps
        
//        Configuration conf =new Configuration();
//        conf.configure("hibernate.cfg.xml");
        
//        OR
        // step-1
        Configuration conf  = new Configuration().configure("hibernate.cfg.xml");
        
        // step-2
       SessionFactory factory=conf.buildSessionFactory();
        
       
       // step-3
       Session session=factory.openSession();
        
       
       // step-4
       
     Transaction transaction = session.beginTransaction();
       
     
     // step-5
     
     session.persist(emp);
     
     // step-6
     
     transaction.commit();
     
     
    // step-7
     
     session.close();
     factory.close();
    }
}
