package javaDemo.BO;
import javaDemo.DAO.AddressDAO;
import javaDemo.E_com.Address;

public class AddressBO {
	AddressDAO addressdao = new AddressDAO();
	public void saveaddress(Address address) {
		addressdao.save(address);
		
	}
}