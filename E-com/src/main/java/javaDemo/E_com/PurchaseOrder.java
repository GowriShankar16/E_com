package javaDemo.E_com;

import java.util.ArrayList;
import java.util.List;

public class PurchaseOrder {
	private Long id;
	private String purchasedDate;
	private Double totalprice;
	private User user;
	private Address address;
	private List <PurchaseOrderItem> purchaseOrderItem = new ArrayList<PurchaseOrderItem>();  
	
	public PurchaseOrder(Long id, String purchasedDate,  Double totalprice, User user, Address address,
			List<PurchaseOrderItem> purchaseOrderItem) {
		super();
		this.id = id;
		this.purchasedDate = purchasedDate;
		this.totalprice = totalprice;
		this.user = user;
		this.address = address;
		this.purchaseOrderItem = purchaseOrderItem;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPurchasedDate() {
		return purchasedDate;
	}

	public void setPurchasedDate(String purchasedDate) {
		this.purchasedDate = purchasedDate;
	}

	public Double getTotalprice() {
		return totalprice;
	}

	public void setTotalprice(Double totalprice) {
		this.totalprice = totalprice;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<PurchaseOrderItem> getPurchaseOrderItem() {
		return purchaseOrderItem;
	}

	public void setPurchaseOrderItem(List<PurchaseOrderItem> purchaseOrderItem) {
		this.purchaseOrderItem = purchaseOrderItem;
	}
}
	