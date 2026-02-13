package com.kodnest.mappingproject2;
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
    	
//        Course c1 = new Course("Msql");
//        Course c2 = new Course("Manual");
//        Course c3 = new Course("Rubby");
//        
//        Student student = new Student("Rahul", "rd@gmail.com","5544668899");
//        
//        c1.setStudent(student);
//        c2.setStudent(student);
//        c3.setStudent(student);
//        
//        
//        List<Course>course = new ArrayList<Course>();
//        
//        course.add(c1);
//        course.add(c2);
//        course.add(c3);
//        
//        
//        student.setRef(course);
//        
//        // hibernet step
//        
//        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
//        Session session = factory.openSession();
//        Transaction transaction= session.beginTransaction();
//        session.persist(student);
//        transaction.commit();
//        session.close();
//        factory.close();
//        
    	
    	
    	
    	// for player and Game setup
    	
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("Enter player name , email, phone and height");
    	
    	Player player = new Player(sc.next(),sc.next(),sc.next(),sc.nextFloat());
    	
    	
    	ArrayList<Game>gameList = new ArrayList<Game>();
    	
    	System.out.println("Enter number of games");
    	
    	int n = sc.nextInt();
    	for(int i =1;i<=n;i++) {
    		System.out.println("Enter game name and location for game " + i);
    		gameList.add(new Game(sc.next(),sc.next()));
    		
    	}
    	
    	for(int i= 0;i<=gameList.size()-1;i++) {
    		gameList.get(i).setPlayer(player);
    	}
    	
    	player.setGames(gameList);
    	
    	// hibernate step
    	 SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
       Session session = factory.openSession();
       Transaction transaction= session.beginTransaction();
       session.persist(player);
       transaction.commit();
       session.close();
       factory.close();
       sc.close();
    	
    	
    	
        
    }
}
