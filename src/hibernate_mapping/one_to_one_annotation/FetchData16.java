package hibernate_mapping.one_to_one_annotation;

import java.util.Iterator;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class FetchData16 {
	public static void main(String[] args) {
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();

		TypedQuery query = session.createQuery("from Employee8");
		List<Employee8> list = query.getResultList();

		Iterator<Employee8> itr = list.iterator();
		while (itr.hasNext()) {
			Employee8 emp = itr.next();
			System.out.println(emp.getEmployeeId() + " " + emp.getName() + " " + emp.getEmail());
			Address8 address = emp.getAddress();
			System.out.println(address.getAddressLine1() + " " + address.getCity() + " " + address.getState() + " "
					+ address.getCountry() + " " + address.getPincode());
		}

		session.close();
		System.out.println("success");
	}
}
