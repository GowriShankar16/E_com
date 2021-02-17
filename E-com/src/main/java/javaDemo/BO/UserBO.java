package javaDemo.BO;
import java.util.*;
import javaDemo.DAO.UserDAO;
import javaDemo.E_com.User;

public class UserBO {
	      UserDAO userdao = new UserDAO();
	  public void saveuser(User user){
	      userdao.save(user);
	      }
      public List<User>List(){
		  List<User>list = new ArrayList<User>();
		  list = userdao.userlist();
		  return list;
		  }
      
      
      
}