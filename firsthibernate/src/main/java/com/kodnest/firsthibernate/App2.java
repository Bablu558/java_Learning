package com.kodnest.firsthibernate;
import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App2 {

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		SessionFactory factory= new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		Session session=factory.openSession();
		Transaction transaction = session.beginTransaction();
		Bankuser ref=session.get(Bankuser.class, sc.nextInt());
		
		System.out.println(ref.userid+" ");
	}

}
