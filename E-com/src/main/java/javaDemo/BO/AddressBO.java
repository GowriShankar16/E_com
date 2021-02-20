package javaDemo.BO;
import javaDemo.DAO.AddressDAO;
import javaDemo.E_com.Address;

public class AddressBO {
	   AddressDAO addressdao = new AddressDAO();
	
	    public void saveaddress(Address address) {
		   addressdao.save(address);
		   }
	    
	    public Address updateAddress(Address address) {
	         return addressdao.update(address);
	      }
	    public Integer checkAddressnumber() {
			return null;
	    	
	    }
}