package javaDemo.DAO;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import javaDemo.E_com.Address;

public class AddressDAO {
	Configuration cfg = new Configuration().configure();
	ServiceRegistry register = new ServiceRegistryBuilder().applySettings(cfg.getProperties()).buildServiceRegistry();
	SessionFactory sf = cfg.buildSessionFactory(register);
	
	public void save(Address address) {
		Session session = sf.openSession();
        Transaction transaction = session.beginTransaction(); 
        session.save(address);
        transaction.commit();
        session.close();
        }
	
    public  Address update(Address address) {
       Session session = sf.openSession();
       Transaction transaction = session.beginTransaction(); 
       session.update(address);
       transaction.commit();
       session.close();
       return address;
	   }
}