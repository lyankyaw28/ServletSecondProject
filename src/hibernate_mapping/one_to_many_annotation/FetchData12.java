package hibernate_mapping.one_to_many_annotation;

import java.util.Iterator;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class FetchData12 {
	public static void main(String[] args) {

		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();

		TypedQuery query = session.createQuery("from Question6");
		List<Question6> list = query.getResultList();

		Iterator<Question6> itr = list.iterator();
		while (itr.hasNext()) {
			Question6 q = itr.next();
			System.out.println("Question Name: " + q.getQname());

			// printing answers
			List<Answer6> list2 = q.getAnswers();
			Iterator<Answer6> itr2 = list2.iterator();
			while (itr2.hasNext()) {
				Answer6 a = itr2.next();
				System.out.println(a.getAnswername() + ":" + a.getPostedBy());
			}
		}
		session.close();
		System.out.println("success");
	}
}
