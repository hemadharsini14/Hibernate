package Hibdemo.demo1;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.Service;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.Transaction;  
import org.hibernate.boot.Metadata;  
import org.hibernate.boot.MetadataSources;  
import org.hibernate.boot.registry.StandardServiceRegistry;  
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;  


public class App 
{
    public static void main( String[] args )
    {
    	StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
    	 Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
         
         SessionFactory factory = meta.getSessionFactoryBuilder().build();  
         Session session = factory.openSession();  
         Transaction t = session.beginTransaction();
         AName name = new AName();
         name.setFname("hema");
         name.setLname("dharsini");
         name.setSurname("pandiarajan");
        Alien a = new Alien();
        a.setId(3);
        a.setName(name);
        a.setColor("black");
        
        
        session.save(a);
        a = (Alien)session.get(Alien.class, 3);
        t.commit();  
        System.out.println(a);
        System.out.println("successfully saved");    
         factory.close();  
         session.close();  
    }
}
