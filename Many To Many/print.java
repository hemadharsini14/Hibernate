package Hibdemo.demo1;
import java.util.ArrayList;
import java.util.Iterator;    
import java.util.List;  
  
import javax.persistence.TypedQuery;    
import org.hibernate.Session;    
import org.hibernate.SessionFactory;  
import org.hibernate.boot.Metadata;  
import org.hibernate.boot.MetadataSources;  
import org.hibernate.boot.registry.StandardServiceRegistry;  
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;   

public class print {
	public static void main(String args[])
	{
	StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("Hibernate_for_many_one.cfg.xml").build();  
    Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();  
      
    SessionFactory factory=meta.getSessionFactoryBuilder().build();  
    Session session=factory.openSession();  
        
    TypedQuery query= session.createQuery("from Student") ;  

    //List<Student> list = (List<Student>) query.getResultList();  
    ArrayList<Student> list = (ArrayList<Student>) query.getResultList();
    System.out.println("In ddd");
    System.out.println(list.size());
    Iterator<Student> itr= list.iterator();    
    while(itr.hasNext())
    {
    	Student s =(Student) itr.next();
    	System.out.println("Inside while");
    	System.out.println(s.toString());
    }
	}

}
