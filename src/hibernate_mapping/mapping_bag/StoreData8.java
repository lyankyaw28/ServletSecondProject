package hibernate_mapping.mapping_bag;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class StoreData8 {
	public static void main(String[] args) {    
	      
	     StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
	     Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();  
	       
	     SessionFactory factory=meta.buildSessionFactory();  
	     Session session=factory.openSession();  
	       
	    Transaction t=session.beginTransaction();    
	        
	    ArrayList<String> list1=new ArrayList<String>();    
	    list1.add("Java is a programming language");    
	    list1.add("Java is a platform");    
	        
	    ArrayList<String> list2=new ArrayList<String>();    
	    list2.add("Servlet is an Interface");    
	    list2.add("Servlet is an API");    
	        
	    Question2 question1=new Question2();    
	    question1.setQname("What is Java?");    
	    question1.setAnswers(list1);    
	        
	    Question2 question2=new Question2();    
	    question2.setQname("What is Servlet?");    
	    question2.setAnswers(list2);    
	        
	    session.persist(question1);    
	    session.persist(question2);    
	        
	    t.commit();    
	    session.close();    
	    System.out.println("success");    
	 }    
}
