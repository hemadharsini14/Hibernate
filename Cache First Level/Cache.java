package Hibdemo.demo1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Cache {
	public static void main(String args[])
	{
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		 Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
	    
	    SessionFactory factory = meta.getSessionFactoryBuilder().build();  
	    Session session1 = factory.openSession();  
	    Transaction t = session1.beginTransaction();
	    //Alien a = new Alien();
	    Alien a = null;
	    a = (Alien)session1.get(Alien.class, 3);
	    System.out.println(a);
	    t.commit();
	    session1.close();
	    Session session2 = factory.openSession();  
	    Transaction t1 = session2.beginTransaction();
	    a = (Alien)session2.get(Alien.class, 3);
	    System.out.println(a);
	    t1.commit();
	    session2.close();
	    
	    //t.commit();  
	    
	}

}
