package javaDemo.DAO;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import javaDemo.E_com.User;

public class UserDAO {
	     Configuration cfg = new Configuration().configure();
	     ServiceRegistry register = new ServiceRegistryBuilder().applySettings(cfg.getProperties()).buildServiceRegistry();
	     SessionFactory sf = cfg.buildSessionFactory(register);
	     
	public void save(User user) {
		 Session session = sf.openSession();
         Transaction transaction = session.beginTransaction(); 
         session.save(user);
         transaction.commit();
         session.close();
         }
	
	public List<User>userlist(){
		 Session session = sf.openSession();
	     Transaction transaction = session.beginTransaction(); 
		 List<User>list = new ArrayList<User>();
		 list= session.createCriteria(User.class).list();
         return list;
         }
	
	public void update(User user) {
		Session session = sf.openSession();
        Transaction transaction = session.beginTransaction(); 
        session.update(user);
        transaction.commit();
        session.close();
	    }
	
}
