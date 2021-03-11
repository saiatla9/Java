package com.cg.jh02.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "product2")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "prod_id")
	private Long productId;
	
	@Column(name = "prod_name")
	private String productName;
	
	@ManyToMany(cascade = CascadeType.ALL,mappedBy = "product")
	private Set<Order> orders;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(String productName) {
		super();
		this.productName = productName;
	}

	public Long getProductId() {
		return productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Set<Order> getOrders() {
		return orders;
	}

	public void setOrders(Set<Order> orders) {
		this.orders = orders;
	}

	@Override
	public String toString() {
		return String.format("Product [productId=%s, productName=%s, orders=%s]", productId, productName, orders);
	}
	
	
	

}
