package hibernate_mapping.mapping_map;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class FetchTest {
	public static void main(String[] args) {
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();

		TypedQuery query = session.createQuery("from Question4 ");
		List<Question4> list = query.getResultList();

		Iterator<Question4> iterator = list.iterator();
		while (iterator.hasNext()) {
			Question4 question = iterator.next();
			System.out.println("question id:" + question.getId());
			System.out.println("question name:" + question.getName());
			System.out.println("question posted by:" + question.getUsername());
			System.out.println("answers.....");
			Map<String, String> map = question.getAnswers();
			Set<Map.Entry<String, String>> set = map.entrySet();

			Iterator<Map.Entry<String, String>> iteratoranswer = set.iterator();
			while (iteratoranswer.hasNext()) {
				Map.Entry<String, String> entry = (Map.Entry<String, String>) iteratoranswer.next();
				System.out.println("answer name:" + entry.getKey());
				System.out.println("answer posted by:" + entry.getValue());
			}
		}
		session.close();
	}
}
