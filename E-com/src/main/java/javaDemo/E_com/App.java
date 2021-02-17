package javaDemo.E_com;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.List;

import javaDemo.BO.AddressBO;
import javaDemo.BO.UserBO;
import javaDemo.DAO.UserDAO;


public class App 
{
    public static void main( String[] args )throws Exception
     {
    	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	 /*User user_admin=new User("Gowri","admin456@gmail.com","9876543210","gowri123","shankar16","Admin");   
         User customer_1 = new User ("Sujith","sujith@gmail.com","9945895950","sujithbr","sujith14","Customer");
         User customer_2 =new User("Srirahul","srirahul@gmail.com","9886332691","srirahul","rahul28","Customer");
         User customer_3 = new User("prakash","prakash@gmail.com","7565868568","prakash","prakash28","Customer");
        
        
         Address address_1 = new Address("A1","GokulamGarden","cbe","TamilNadu","PNpalayam","641037",customer_1);
         Address address_2 = new Address("A2","GokulamGarden","cbe","TamilNadu","PNpalayam","641037",customer_2);
         Address address_3 = new Address("A2","GokulamGarden","cbe","TamilNadu","PNpalayam","641037",customer_3);
        
        
         customer_1.getAddresslist().add(address_1);
         address_1.setUser(customer_1);
         customer_2.getAddresslist().add(address_2);
         address_2.setUser(customer_2);
         customer_3.getAddresslist().add(address_3);
         address_3.setUser(customer_3);
         user_admin.getAddresslist().add(address_1);
         address_1.setUser(user_admin);
        
         UserBO userbo = new UserBO();
         userbo.saveuser(user_admin);
         userbo.saveuser(customer_1);
         userbo.saveuser(customer_2);
         userbo.saveuser(customer_3);
        
         AddressBO addressbo =new AddressBO();
         addressbo.saveaddress(address_1);
         addressbo.saveaddress(address_2);
         addressbo.saveaddress(address_3);*/ 
         UserBO userbo = new UserBO();
         UserDAO userdao = new UserDAO();
         List<User> list= new ArrayList <User>();
	     list = userbo.List();
	   
	     Integer check =0;
	     String role ="";
	     do {
	          System.out.println("Enter username");
	          String name=br.readLine();
	          System.out.println("Enter password");
	          String checkPassword=br.readLine();
	          for(int i=0; i<list.size();i++) {
	        	  if((name.equals(list.get(i).getUserName()))&&(checkPassword.equals(list.get(i).getPassword()))) {
	        		  role=list.get(i).getRole();
	        		  check++;
	        		 }
	          }
	          if(check==0) {
	        	  System.out.println("Invalid Username or password");
	              }
	        	
	      }while (check<=0);
    	
    	
      
    }
}
