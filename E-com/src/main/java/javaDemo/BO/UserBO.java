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
      
      public void update ( User user) {
    	   userdao.update(user);
           }
      
 
      public User  checkUser(String user) {
    	    User checkUser=null;
    	    List<User>checkUserList =userdao.userlist();
    	    for(int i=0;i<checkUserList.size();i++) {
    		   if(user.equals(checkUserList.get(i).getUserName())) {
    			   checkUser=checkUserList.get(i);
    		    }
    		 
    		}
		   return checkUser;
          }
}