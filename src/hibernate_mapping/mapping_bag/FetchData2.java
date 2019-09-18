package hibernate_mapping.mapping_bag;

import java.util.Iterator;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class FetchData2 {
	public static void main(String[] args) {

		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

		SessionFactory factory = meta.buildSessionFactory();
		Session session = factory.openSession();

		TypedQuery query = session.createQuery("from hibernate_mapping.mapping_bag.Question2");
		List<Question2> list = query.getResultList();

		Iterator<Question2> itr = list.iterator();
		while (itr.hasNext()) {
			Question2 q = itr.next();
			System.out.println("Question Name: " + q.getQname());

			// printing answers
			List<String> list2 = q.getAnswers();
			Iterator<String> itr2 = list2.iterator();
			while (itr2.hasNext()) {
				System.out.println(itr2.next());
			}

		}
		session.close();
		System.out.println("success");

	}
}
