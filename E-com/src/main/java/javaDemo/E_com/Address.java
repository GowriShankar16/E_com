package javaDemo.E_com;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Address {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	
	@Column (name = "addressline1")
	private String addressline1;
	
	@Column (name = "addressline2")
	private String addressline2;
	
	@Column (name = "city")
	private String city;
	
	@Column (name = "state")
	private String state;
	
	@Column (name = "landmark")
	private String landmark;
	
	@Column (name = "pincode")
	private String pincode;
	
	@ManyToOne(cascade= {CascadeType.ALL})
	@JoinColumn(name="user_id")
	private User user;
	
	public Address() {
		
	}
	
	public Address( String addressline1, String addressline2, String city, String state, String landmark,
			String pincode) {
		super();
		this.id = id;
		this.addressline1 = addressline1;
		this.addressline2 = addressline2;
		this.city = city;
		this.state = state;
		this.landmark = landmark;
		this.pincode = pincode;
		this.user = user;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAddressline1() {
		return addressline1;
	}
	public void setAddressline1(String addressline1) {
		this.addressline1 = addressline1;
	}
	public String getAddressline2() {
		return addressline2;
	}
	public void setAddressline2(String addressline2) {
		this.addressline2 = addressline2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getLandmark() {
		return landmark;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	

}
