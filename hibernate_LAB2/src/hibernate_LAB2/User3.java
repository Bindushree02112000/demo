package hibernate_LAB2;
import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class User3 {
	public static void main(String[] args) {
		  // Create the objects
	    Address a1=new Address();
	    a1.setStreetName("subashnagar");
	    a1.setCity("bangalore");
	    a1.setPincode(560068);
	    
	    Address a2=new Address();
	    a2.setStreetName("begur");
	    a2.setCity("bangalore");
	    a2.setPincode(560060);
	    
	    Address a3=new Address();
	    a3.setStreetName("ambur");
	    a3.setCity("vellore");
	    a3.setPincode(560568);
	    
	    
	    Address a4=new Address();
	    a4.setStreetName("xxxx");
	    a4.setCity("chennai");
	    a4.setPincode(560069);
	    
	    
	    //Get Configuration
	    Configuration cfg1 = new Configuration();
	    cfg1.configure("hibernate.cfg.xml");
	    
	    //Get SessionFactory
	    SessionFactory factory = cfg1.buildSessionFactory();
	    
	    //Get Session
	    Session session = factory.openSession();
	    
	    //Transaction
	    Transaction tx1 = session.beginTransaction();
	    session.save(a1);
	    session.save(a2);
	    session.save(a3);
	    session.save(a4);
	    //inserting the data into table user1
	 
	    
	    //Commit
	    tx1.commit();
	    
	    //Close
	    session.close();
	    factory.close();



	}
	

}
