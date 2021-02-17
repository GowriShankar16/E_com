package javaDemo.E_com;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class PurchaseOrderItem {
	
	  @Id
	  @GeneratedValue(strategy= GenerationType.IDENTITY)  
	  private Long id;
	
	  @Column (name = "quantity")
      private Integer quantity;
	
	  @Column (name = "unitPrice")
      private Double unitPrice;
	  
	  @Column (name = "product")
      private Product product;
	  
	  @ManyToOne
	  @JoinColumn(name ="purchaseorder_id")
	  private PurchaseOrder purchaseOrder;
	  
	  public PurchaseOrderItem() {
			super();
		}
     
	  
      public PurchaseOrderItem(Long id, Integer quantity, Double unitPrice, Product product,
			PurchaseOrder purchaseOrder) {
		super();
		this.id = id;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
		this.product = product;
		this.purchaseOrder = purchaseOrder;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public PurchaseOrder getPurchaseOrder() {
		return purchaseOrder;
	}
	public void setPurchaseOrder(PurchaseOrder purchaseOrder) {
		this.purchaseOrder = purchaseOrder;
	}
      
    
      
}
