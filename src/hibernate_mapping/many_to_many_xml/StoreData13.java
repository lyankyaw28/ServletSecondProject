package hibernate_mapping.many_to_many_xml;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class StoreData13 {
	public static void main(String[] args) {

		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();

		Answer7 ans1 = new Answer7();
		ans1.setAnswername("Java is a programming language");
		ans1.setPostedBy("Ravi Malik");

		Answer7 ans2 = new Answer7();
		ans2.setAnswername("Java is a platform");
		ans2.setPostedBy("Sudhir Kumar");

		Question7 q1 = new Question7();
		q1.setQname("What is Java?");
		ArrayList<Answer7> l1 = new ArrayList<Answer7>();
		l1.add(ans1);
		l1.add(ans2);
		q1.setAnswers(l1);

		Answer7 ans3 = new Answer7();
		ans3.setAnswername("Servlet is an Interface");
		ans3.setPostedBy("Jai Kumar");

		Answer7 ans4 = new Answer7();
		ans4.setAnswername("Servlet is an API");
		ans4.setPostedBy("Arun");

		Question7 q2 = new Question7();
		q2.setQname("What is Servlet?");
		ArrayList<Answer7> l2 = new ArrayList<Answer7>();
		l2.add(ans3);
		l2.add(ans4);
		q2.setAnswers(l2);
		session.persist(q1);
		session.persist(q2);

		t.commit();
		session.close();
		System.out.println("success");
	}
}
