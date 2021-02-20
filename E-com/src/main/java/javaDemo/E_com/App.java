		package javaDemo.E_com;
		
		
		import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
		import java.io.ObjectInputStream.GetField;
		import java.util.ArrayList;
		import java.util.List;
		
		import javaDemo.BO.AddressBO;
		import javaDemo.BO.UserBO;
		import javaDemo.DAO.AddressDAO;
		import javaDemo.DAO.UserDAO;
		
		
		public class App {
			
			 static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 static User user = new User();
			 static UserBO userbo = new UserBO();
			 static UserDAO userdao = new UserDAO();
			 static AddressBO addressbo = new AddressBO();
			 static AddressDAO addressdao = new AddressDAO();
	        
			public static void main( String[] args )throws Exception
		     {
		    	 
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
				produc
		    
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
		
		  if(role.equalsIgnoreCase("Admin")) {
		   System.out.println("1.User\n"+"2.Address\n"+"3.product\n"+"4.Exit\n");
		   System.out.println("Enter the number\n");
		   switch (Integer.parseInt(br.readLine())){
		      //user  
		      case 1:
				     System.out.println("1.Create User\n"+"2.Update User\n");
		            
				     switch (Integer.parseInt(br.readLine())) {
		               
				        case 1 :
		        	           do {
		        		           System.out.println("Name");
		        		           String name = br.readLine();
		        		           System.out.println("Email");
		        		           String email = br.readLine();
		        		           System.out.println("Mobile Number");
		        		           String mobileNumber = br.readLine();
		        		           System.out.println("User Name");
		        		           String userName = br.readLine();
		        		           System.out.println("password");
		        		           String password = br.readLine();
		                           System.out.println("role");
		        		           String role1 = br.readLine();
		        		           User newuser = new User(name,email,mobileNumber,userName,password,role1);
		        		  
		        		           System.out.println("Address Line1");
		        		           String addressLine_1 = br.readLine();
		        		           System.out.println("Address Line2");
		        		           String addressLine_2 = br.readLine();
		        		           System.out.println("City");
		        		           String city = br.readLine();
		        		           System.out.println("State");
		        		           String state = br.readLine();
		        		           System.out.println("Landmark");
		        		           String landMark = br.readLine();
		        		           System.out.println("Pincode");
		        		           String pincode = br.readLine();
		        		  
		        		           Address newaddress = new Address(addressLine_1,addressLine_2,city,state,landMark,pincode);
		        	               newuser.getAddresslist().add(newaddress);
		        	               newaddress.setUser(newuser);
		        	               userbo.saveuser(newuser);
		        	               addressbo.saveaddress(newaddress);
		        	               System.out.println("Do you want to continue to Add User Yes/No\n");
		        	               }while(br.readLine().equalsIgnoreCase("Yes"));
		                           break;
				      
				        case 2 : 
				    	         Integer count = 0;
				   
				    		         do {
				    			          System.out.println("Enter the user name\n");
				    			          String userCheck=br.readLine();
				    			          if(userbo.checkUser(userCheck)==null) {
				    			             System.out.println("Enter valid username\n");
				    			             count=0;
				    		                }
				    		              else 
				    		                 {
				    			              do {
				    				              System.out.println("Enter field to update\n");
				    				              System.out.println("1.Name\n"+"2.Email\n"+"3.Mobilenumber\n"+"4.User Name\n"+"5.Password\n"+"6.Update All\n");
				    				              User update=userbo.checkUser(userCheck);
				    				              switch (Integer.parseInt(br.readLine())) {
				    				          
				    				              case 1:
				    				            	  System.out.println("Enter the new Name\n");
				    				            	  update.setName(br.readLine());
				    				            	  userbo.update(update);
				    				            	  break;
				    				            	  
				    				              case 2:
				    				            	  System.out.println("Enter the new Email\n");
				    				            	  update.setEmail(br.readLine());
		                                              userbo.update(update);
		                                              break;
				    				              
				    				              case 3:
				    				            	  System.out.println("Enter the new Mobile Number\n");
				    				            	  update.setMobileNumber(br.readLine());
				    				            	  userbo.update(update);
				    				            	  break;
				    				            	
				    				              case 4:
				    				            	  System.out.println("Enter the new User Name\n");
				    				            	  update.setUserName(br.readLine());
				    				            	  userbo.update(update);
				    				            	  break;
				    				             
				    				              case 5:
				    				            	  System.out.println("Enter the new password\n");
				    				            	  update.setPassword(br.readLine());
				    				            	  userbo.update(update);
				    				            	  break;
				    				              
				    				              case 6:
				    				            	  
				    				            	  System.out.println("Enter the new Name\n");
				    				            	  update.setName(br.readLine());
				    				            	  System.out.println("Enter the new Email\n");
				    				            	  update.setEmail(br.readLine());
				    				            	  System.out.println("Enter the new Mobile Number\n");
				    				            	  update.setMobileNumber(br.readLine());
				    				            	  System.out.println("Enter the new User Name\n");
				    				            	  update.setUserName(br.readLine());
				    				            	  System.out.println("Enter the new password\n");
				    				            	  update.setPassword(br.readLine());
				    				            	  userbo.update(update);
				    				            	  break;
				    			                      }
				    				              System.out.println("Do you want to update any field Yes/No\n");
				    		                      }while (br.readLine().equalsIgnoreCase("Yes"));
				    		                 }
				    			             System.out.println("Do you want to update any field Yes/No\n");
				    		            }while(br.readLine().equalsIgnoreCase("Yes"));
		                }
				     
		    //Address
		     case 2:
		    	    System.out.println("1.Create Address/n"+"2.Update Address/n");     	    	 
		    	    switch (Integer.parseInt(br.readLine())) {
		               
			        case 1:
		    	            Integer count1 = 0;
		    	            do {
   			                    System.out.println("Enter the user name to add a Address\n");
   			                    String userCheck1=br.readLine();
   			                    if(userbo.checkUser(userCheck1)==null) {
   			                         System.out.println("Enter valid username\n");
   			                         count1=0;
   		                             }   	 
   			                    else {
   			        	              System.out.println("Address Line1\n");
      		                          String addressLine_1 = br.readLine();
      		                          System.out.println("Address Line2\n");
      		                          String addressLine_2 = br.readLine();
      		                          System.out.println("City\n");
      		                          String city = br.readLine();
      		                          System.out.println("State\n");
      		                          String state = br.readLine();
      		                          System.out.println("Landmark\n"); 
      		                          String landMark = br.readLine();
      		                          System.out.println("Pincode\n");
      		                          String pincode = br.readLine(); 
      		                          
      		                          Address newAddress = new Address(addressLine_1,addressLine_2,city,state,landMark,pincode);
   			        	              User  newAddressUser =userbo.checkUser(userCheck1);
   			        	              newAddressUser.getAddresslist().add(newAddress);
   			        	              newAddress.setUser(newAddressUser);
   			        	              userbo.update(newAddressUser);
   			        	              addressbo.saveaddress(newAddress);
   			        	              }
   			        	        System.out.println("Do you want to continue to add Address Yes/No\n");
			     	    	   }while (br.readLine().equalsIgnoreCase("Yes"));
		    	               break; 
			        case 2:
			        	   Integer count2 =0;
			        		   do {
	   			                    System.out.println("Enter the user name to update a Address\n");
	   			                    String userCheck2=br.readLine();
	   			                    if(userbo.checkUser(userCheck2)==null) {
	   			                         System.out.println("Enter valid username\n");
	   			                         count2=0;
	   		                             }   	 
	   			                    else {
	   			                    	 count2 =0;
	   			                    	 User updateaddress=userbo.checkUser(userCheck2);
	   			                           if(updateaddress.getAddresslist().size()==0) {
	   			                    	       System.out.println("No Address Found");
	   			                            }
	   			                         else {
	   			                        	   for(int i=0;i<updateaddress.getAddresslist().size();i++) {
	   			                        		  System.out.println((i+1)+"."+updateaddress.getAddresslist().get(i));
	   			                        		 }
	   			                        	   do {
	   			                        		   System.out.println("Select the Address number to update Address");
	   			                        		   Integer number= Integer.parseInt(br.readLine());
	   			                        		   updateAddres(updateaddress,updateaddress.getAddresslist().get(number));
	   			                        		   System.out.println("Do you Want to update any other Address");   
	   			                        	       }while(br.readLine().equalsIgnoreCase("Yes"));
	   			                        	   }
	   			                          }
	   			                    System.out.println("Do you want to update Address for any Another user");
	   			                    }while(br.readLine().equalsIgnoreCase("yes"));
	   			                    
	   			    }
		    	//product    
		          case 3:   
		    	    
		   }
		}}

			private static void updateAddres(User updateaddress, Address address) throws IOException {
				 System.out.println("Address Line 1\n");
				 address.setAddressline1(br.readLine());
				 System.out.println("Address Line2\n");
                 address.setAddressline2(br.readLine());
                 System.out.println("City\n");
                 address.setCity(br.readLine());
                 System.out.println("State\n");
                 address.setState(br.readLine());
                 System.out.println("Landmark\n"); 
                 address.setLandmark(br.readLine());
                 System.out.println("Pincode\n");
                 address.setPincode(br.readLine());
                 addressbo.updateAddress(address);
                 userbo.update(updateaddress);
				
			}}
