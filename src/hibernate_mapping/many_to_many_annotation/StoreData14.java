package hibernate_mapping.many_to_many_annotation;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class StoreData14 {
	public static void main(String[] args) {

		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();

		Answer8 an1 = new Answer8();
		an1.setAnswername("Java is a programming language");
		an1.setPostedBy("Ravi Malik");

		Answer8 an2 = new Answer8();
		an2.setAnswername("Java is a platform");
		an2.setPostedBy("Sudhir Kumar");

		Question8 q1 = new Question8();
		q1.setQname("What is Java?");
		ArrayList<Answer8> l1 = new ArrayList<Answer8>();
		l1.add(an1);
		l1.add(an2);
		q1.setAnswers(l1);

		Answer8 ans3 = new Answer8();
		ans3.setAnswername("Servlet is an Interface");
		ans3.setPostedBy("Jai Kumar");

		Answer8 ans4 = new Answer8();
		ans4.setAnswername("Servlet is an API");
		ans4.setPostedBy("Arun");

		Question8 q2 = new Question8();
		q2.setQname("What is Servlet?");
		ArrayList<Answer8> l2 = new ArrayList<Answer8>();
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
