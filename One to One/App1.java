package Hibdemo.demo1;

import javax.imageio.spi.ServiceRegistry;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistryBuilder;

import com.google.protobuf.Service;

public class App1 {
	public static void main(String args[])
	{
		
		
		Laptop lap = new Laptop();
		lap.setLid(1);
		lap.setL_name("Dell");
		
		Student stu = new Student();
		stu.setId(101);
		stu.setName("Hema");
		stu.setRoll_no(1010101);
		stu.setLap(lap);
		//Configuration con = new Configuration().configure().addResource("org.hibernate.Hibdemo.demo1.Student.class");
		//StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("Hibernate_for_many_one.cfg.xml").build();
		//StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure().addService(serviceRole, service)
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
        
        SessionFactory factory = meta.getSessionFactoryBuilder().build();  
        Session session = factory.openSession();  
        Transaction t = session.beginTransaction();
        session.save(stu);
        session.save(lap);
        t.commit();  
        //System.out.println(a);
        System.out.println("successfully saved");    
         factory.close();  
         session.close(); 
		
	
		
		
	}

}
