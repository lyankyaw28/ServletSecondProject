package hibernate_mapping.mapping_map;

import java.util.HashMap;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class StoreData10 {
	public static void main(String[] args) {

		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();

		Transaction t = session.beginTransaction();
		
		HashMap<String, String> map1 = new HashMap<String, String>();
		map1.put("Java is a programming language", "John Milton");
		map1.put("Java is a platform", "Ashok Kumar");

		HashMap<String, String> map2 = new HashMap<String, String>();
		map2.put("Servlet technology is a server side programming", "John Milton");
		map2.put("Servlet is an Interface", "Ashok Kumar");
		map2.put("Servlet is a package", "Rahul Kumar");

		Question4 question1 = new Question4("What is Java?", "Alok", map1);
		Question4 question2 = new Question4("What is Servlet?", "Jai Dixit", map2);

		session.persist(question1);
		session.persist(question2);

		t.commit();
		session.close();
		System.out.println("successfully stored");
	}
}
