package com.relationship;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	  SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").
   			   addAnnotatedClass(Instructor.class). addAnnotatedClass(Details.class).buildSessionFactory();
    	  
   	   Session session=factory.getCurrentSession();
        Details det = new Details();
        det.setYoutube("http://youtube.com/abc");
        det.setTwitter("http://twitter.com/abc");
        Instructor ins = new Instructor();
        ins.setFirstName("john");
        ins.setLastName("doe");
        ins.setEmail("johndoe@gmail.com");
        ins.setDetails(det);
        session.getTransaction().begin();
        session.persist(det);
        session.persist(ins);
        session.persist(det);
        session.getTransaction().commit();
        session.close();
        
        
    }
}
