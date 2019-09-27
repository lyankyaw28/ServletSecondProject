package hibernate_mapping.one_to_many_annotation;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class StoreData12 {
	public static void main(String[] args) {

		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();

		Transaction t = session.beginTransaction();

		Answer6 ans1 = new Answer6();
		ans1.setAnswername("Java is a programming language");
		ans1.setPostedBy("Ravi Malik");

		Answer6 ans2 = new Answer6();
		ans2.setAnswername("Java is a platform");
		ans2.setPostedBy("Sudhir Kumar");

		Answer6 ans3 = new Answer6();
		ans3.setAnswername("Servlet is an Interface");
		ans3.setPostedBy("Jai Kumar");

		Answer6 ans4 = new Answer6();
		ans4.setAnswername("Servlet is an API");
		ans4.setPostedBy("Arun");

		ArrayList<Answer6> list1 = new ArrayList<Answer6>();
		list1.add(ans1);
		list1.add(ans2);

		ArrayList<Answer6> list2 = new ArrayList<Answer6>();
		list2.add(ans3);
		list2.add(ans4);

		Question6 question1 = new Question6();
		question1.setQname("What is Java?");
		question1.setAnswers(list1);

		Question6 question2 = new Question6();
		question2.setQname("What is Servlet?");
		question2.setAnswers(list2);

		session.persist(question1);
		session.persist(question2);

		t.commit();
		session.close();
		System.out.println("success");
	}
}
