package hibernate_mapping.mapping_set;

import java.util.HashSet;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class StoreData9 {
	public static void main(String[] args) {

		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();

		Transaction t = session.beginTransaction();

		HashSet<String> set1 = new HashSet<String>();
		set1.add("Java is a programming language");
		set1.add("Java is a platform");

		HashSet<String> set2 = new HashSet<String>();
		set2.add("Servlet is an Interface");
		set2.add("Servlet is an API");

		Question3 question1 = new Question3();
		question1.setQname("What is Java?");
		question1.setAnswers(set1);

		Question3 question2 = new Question3();
		question2.setQname("What is Servlet?");
		question2.setAnswers(set2);

		session.persist(question1);
		session.persist(question2);

		t.commit();
		session.close();
		System.out.println("success");
	}
}
